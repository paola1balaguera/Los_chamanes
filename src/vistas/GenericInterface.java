package vistas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class GenericInterface<T> extends JFrame {
    private JTable table;
    private JTextField searchField;
    private JButton addButton, editButton, deleteButton, backButton, searchButton;

    public GenericInterface(String title) {
        setTitle("GESTIONAR " + title.toUpperCase());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Panel superior
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headerPanel.setBackground(new Color(3, 4, 5));
        
        JLabel titleLabel = new JLabel("PEPE CONSTRUCCIONS");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 36));
        titleLabel.setForeground(new Color(212, 175, 55));
        headerPanel.add(titleLabel);
        
        JLabel roleLabel = new JLabel("Admin");
        roleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        roleLabel.setForeground(Color.WHITE);
        headerPanel.add(roleLabel);

        backButton = new JButton("Salir");
        headerPanel.add(backButton);

        add(headerPanel, BorderLayout.NORTH);

        // Panel de búsqueda y acciones
        JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        searchField = new JTextField(20);
        searchField.setFont(new Font("Segoe UI", Font.ITALIC, 18));
        searchField.setText("CÓDIGO:");
        searchButton = new JButton("Buscar");
        
        addButton = new JButton("+");
        editButton = new JButton("✎");
        deleteButton = new JButton("✖");

        actionPanel.add(searchField);
        actionPanel.add(searchButton);
        actionPanel.add(addButton);
        actionPanel.add(editButton);
        actionPanel.add(deleteButton);
        add(actionPanel, BorderLayout.CENTER);

        // Panel de tabla
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(212, 175, 55), 3));
        add(scrollPane, BorderLayout.SOUTH);
    }

    // Métodos para obtener componentes
    public JTable getTable() {
        return table;
    }

    public JTextField getSearchField() {
        return searchField;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public void setTableModel(DefaultTableModel model) {
        table.setModel(model);
    }
}
