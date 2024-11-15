/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

/**
 *
 * @author Paola
 */
public class CrudSimpleControllerTV {
    private final ControllerImplT implController = new ControllerImplT();
    
    public void crear(Object objeto) {
        implController.crear(objeto);
    }
}
