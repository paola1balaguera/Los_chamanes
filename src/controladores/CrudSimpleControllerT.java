/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import modelos.Proyecto;
import repositorios.IRepositorySimpleT;
import repositorios.IRepositoryT;

/**
 *
 * @author Paola
 */
public class CrudSimpleControllerT {
   private final IRepositorySimpleT implRepositorySimpleT;

    public CrudSimpleControllerT(IRepositorySimpleT implRepositorySimpleT) {
        this.implRepositorySimpleT = implRepositorySimpleT;
    }


    
    public void crear(Object objeto){
        implRepositorySimpleT.crear(objeto);

    }


    public ArrayList<Proyecto> listar(){
         return null;
    }
}
