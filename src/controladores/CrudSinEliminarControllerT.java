/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import repositorios.IRepositorySinEliminarT;

/**
 *
 * @author Paola
 */
public class CrudSinEliminarControllerT {
    private final IRepositorySinEliminarT implRepsoitorySinEliminar;

    public CrudSinEliminarControllerT(IRepositorySinEliminarT implRepsoitorySinEliminar) {
        this.implRepsoitorySinEliminar = implRepsoitorySinEliminar;
    }
    
    void crear(Object objeto){
        implRepsoitorySinEliminar.crear(objeto);
    }
  
    void editar(String id, Object objeto){
        implRepsoitorySinEliminar.editar(id, objeto);
    }
    
    public ArrayList<Object> listar(){
         return null;
    }
    
}
