/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.List;

/**
 *
 * @author Paola
 * @param <T>
 */
public interface IControllerT<T> {
    
    public void crear(T objeto);
    
    public void editar(int id,T objeto);
    
    public void eliminar(int id);
    
    public List listar();
    
    public void leer(int id);

}
