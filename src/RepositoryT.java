
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paola
 */
public interface RepositoryT<T>  {
    
    void crear(T t);
    void editar(T t);
    void eliminar(String codigo);
    List<T> listar();
    

}
