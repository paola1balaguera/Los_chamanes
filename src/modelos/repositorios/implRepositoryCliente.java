/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorios;

import config.DatabaseAdministrador;
import java.util.ArrayList;
import modelos.Cliente;
import java.sql.*;
import modelos.Torre;

/**
 *
 * @author Paola
 */
public class implRepositoryCliente implements IRepositoryCompletoT {
    
    ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    @Override
    public void crear(Object objeto) {
        Cliente cliente = (Cliente) objeto;
        listaDeClientes.add(cliente);
    }

    @Override
    public ArrayList<Object> listar() {
        return null;
    }

    @Override
    public void editar(String id, Object objeto) {
        for(Cliente clientesito: listaDeClientes){
            if(clientesito.getCedula().equals(id)){
                int telefonoActualizar = clientesito.getCelular();
                String correoActualizar = clientesito.getCorreoElectronico();
                String direccionActualizar = clientesito.getDireccionResidencia();
                Float ingresosActualizar = clientesito.getIngresos();
                
                clientesito.setCelular(telefonoActualizar);
                clientesito.setCorreoElectronico(correoActualizar);
                clientesito.setDireccionResidencia(direccionActualizar);
                clientesito.setIngresos(ingresosActualizar);
                
            }
            else{
                System.out.println("No se pudo actualizar el cliente");
            }
        }
    }

    @Override
    public void eliminar(String id) {
            // Usar removeIf para eliminar la torre con el código proporcionado
        boolean eliminado = listaDeClientes.removeIf(cliente -> cliente.getCedula().equals(id));

        // Confirmar si se eliminó o no
        if (eliminado) {
            System.out.println("El cliente con código " + id + " fue eliminada correctamente.");
        } else {
            System.out.println("No se encontró ninguna cliente con el código " + id + ".");
        }
    }
    
}
