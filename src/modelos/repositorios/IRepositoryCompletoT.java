/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paola
 */
public interface IRepositoryCompletoT<T> {
       
    void crear(T objeto);

   
    void editar(String id, T objeto);

    
    void eliminar(String id);

    
    public List<T> listar();
    
}
