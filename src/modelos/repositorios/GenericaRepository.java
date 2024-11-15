/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.repositorios;

import java.util.List;

/**
 *
 * @author Paola
 */
public interface GenericaRepository<T>{
    void crear(T t);
    void editar(T t);
    List<T> listar();

}
