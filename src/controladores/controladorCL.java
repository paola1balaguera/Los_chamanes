/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import java.util.List;
import modelos.Cliente;
import modelos.Proyecto;
import repositorios.IRepositoryT;
import repositorios.implRepositoryCliente;
import repositorios.implRepositoryProyecto;

/**
 *
 * @author Paola
 */
public class controladorCL {
   private final IRepositoryT implRepository;
   //ArrayList<Proyecto> listaDeProyectos = new ArrayList<>();
    
   //private final Proyecto proyecto = null;
   //private static final implRepositoryProyecto repositoryProyecto = new implRepositoryProyecto();
   //private static final implRepositoryCliente repositoryCliente = new implRepositoryCliente();

    public controladorCL(IRepositoryT implRepository) {
        this.implRepository = implRepository;
    }
    
    public void crear(Object objeto){
        implRepository.crear(objeto);
        System.out.println("Entre al controlador al cliente");
        /*System.out.println("Entre al controlador");
        if (objeto instanceof Proyecto) {
            repositoryProyecto.crear(objeto);
           }
        else if(objeto instanceof Cliente){
            repositoryCliente.crear(objeto);
            System.out.println("Entre al controlador al cliente");
        }
        else{
            System.out.println("No entro a ningun repositorio implemen....");
        }
        */
    }


    public ArrayList<Proyecto> listar(){
         return null;
    }
}

