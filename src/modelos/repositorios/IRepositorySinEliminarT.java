/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorios;

import java.util.ArrayList;

/**
 *
 * @author Paola
 */
public interface IRepositorySinEliminarT {
    
    void crear(Object objeto);
  
    void editar(String id, Object objeto);
    
    public ArrayList<Object> listar();    
}
