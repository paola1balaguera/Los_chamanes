/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.repositorios;

import controladores.CrudSimpleControllerTV;
/**
 *
 * @author Paola
 */
public class RepositorySimpleImplT extends CrudSimpleControllerTV{
    private final CrudSimpleControllerTV crudSimpleController = new CrudSimpleControllerTV();
    
    public void crear(Object objeto){
        crudSimpleController.crear(objeto);
    }
}
