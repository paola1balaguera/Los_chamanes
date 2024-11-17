/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paola
 */
public interface IRepositoryT {
    
    public void crear(Object objeto);

    public ArrayList<Object> listar();
}
