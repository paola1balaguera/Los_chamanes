/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import java.util.List;
import repositorios.IRepositoryCompletoT;
import repositorios.implRepositoryCliente;


/**
 *
 * @author Paola
 */
public class CrudCompletoControllerT<T> {
    
    private final IRepositoryCompletoT implRepositoryCompleto;

    public CrudCompletoControllerT(IRepositoryCompletoT implRepositoryCompleto) {
        this.implRepositoryCompleto = implRepositoryCompleto;
    }

    public void crear(Object objeto) {
        implRepositoryCompleto.crear(objeto);
    }

    public void editar(String id, Object objeto) {
        implRepositoryCompleto.editar(id, objeto);
    }


    public void eliminar(String id) {
       implRepositoryCompleto.eliminar(id);
    }


    public List<T> listar() {
        return implRepositoryCompleto.listar();
    }
}