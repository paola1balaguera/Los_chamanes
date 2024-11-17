/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import controladores.CrudCompletoControllerT;
import integrador.ADMIN.InterfazModificarProyecto;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Proyecto;

/**
 *
 * @author Paola
 */
public class VistaGenericaController<T> {
    private VistaGenerica<T> view;
    private List<T> model;
    private JFrame viewReturn;
    private JFrame viewCreate;
    private CrudCompletoControllerT crudController;
    
    public VistaGenericaController(VistaGenerica<T> view, List<T> model, JFrame viewReturn, CrudCompletoControllerT crudController, JFrame viewCreate) {
        this.view = view;
        this.model = model;
        this.viewReturn = viewReturn;
        this.crudController = crudController;
        this.viewCreate = viewCreate;
        initController();
    }
    
    private void initController() {
        loadTableData();
        view.getReturnButton().addActionListener(e -> onReturn());
        view.getBotonEliminar().addActionListener(e -> onDelete());
        view.getBotonCrear().addActionListener(e -> onCreate());
        view.getBotonEditar().addActionListener(e -> onEdit());
    }
    
    private void onReturn() {
        viewReturn.setVisible(true); // Muestra la vista de retorno
        view.setVisible(false);// Cierra la vista actual
    }
    
    public void onDelete() {
        if (view.getTabla().getSelectedRow() != -1) {
            int selectedRow = view.getTabla().getSelectedRow();
            Object codigo = view.getTabla().getValueAt(selectedRow, 0);
            System.out.println(selectedRow);
            System.out.println(codigo);
            crudController.eliminar((String) codigo);
            List<Proyecto> proyectos = crudController.listar();
            this.model = (List<T>) proyectos;
            loadTableData();
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Por favor, selecciona una fila antes de continuar.",
                "Advertencia",
                JOptionPane.WARNING_MESSAGE
            );
        }
        
    }
    
    public void onCreate() {
        view.setVisible(false);
        viewCreate.setVisible(true);
    }
    
    public void onEdit() {
        if (view.getTabla().getSelectedRow() != -1) {
            int selectedRow = view.getTabla().getSelectedRow();
            Object codigo = view.getTabla().getValueAt(selectedRow, 0);
            Object nombre = view.getTabla().getValueAt(selectedRow, 1);
            Object direccion = view.getTabla().getValueAt(selectedRow, 2);

            InterfazModificarProyecto interfazModificar = new InterfazModificarProyecto((String) codigo,(String) nombre,(String) direccion);
            view.setVisible(false);
            interfazModificar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Por favor, selecciona una fila antes de continuar.",
                "Advertencia",
                JOptionPane.WARNING_MESSAGE
            );
        }
        
    }
    
    private void loadTableData() {
        // Crear un modelo de tabla (puedes personalizarlo según tu entidad)
        String[] columnNames = {"Código", "Nombre", "Dirección"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        System.out.println(model);
        for (T item : model) {
            // Convertir el objeto a una fila de tabla (requiere un adaptador o método toRow en T)
            Object[] rowData = convertToRow(item);
            tableModel.addRow(rowData);
        }

        view.setTableModel(tableModel);
    }
    
    private Object[] convertToRow(T item) {
        if (item instanceof Proyecto) {
            Proyecto proyecto = (Proyecto) item; // Realiza el casting
            return new Object[]{
                proyecto.getCodigo(), // Código del proyecto
                proyecto.getNombre_proyecto(),         // Nombre del proyecto
                proyecto.getDireccion()       // Dirección del proyecto
            };
        } else {
            // Si el objeto no es de tipo Proyecto, devuelve un array vacío o con valores genéricos
            return new Object[]{"N/A", "N/A", "N/A"};
        }
    }
    
}
