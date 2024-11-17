/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorios;

import java.util.ArrayList;
import java.util.Date;
import modelos.Proyecto;
import modelos.Torre;

/**
 *
 * @author Paola
 */
public class implRepositoryTorre implements IRepositoryCompletoT {
    
    ArrayList<Torre> listaDeTorres = new ArrayList<>();
    
    @Override
    public void crear(Object objeto) {
        Torre torre = (Torre) objeto; // Realiza el cast (conversion) a tipo Proyecto
             
        listaDeTorres.add(torre);
    }

    @Override
    public void editar(String id, Object objeto) {
        for(Torre torresita: listaDeTorres){
            if(torresita.getCodigo().equals(id)){
                Date torreActualizar = torresita.getFechaConstruccion();
                torresita.setFechaConstruccion(torreActualizar);
            }
            else{
                System.out.println("No se pudo actualizar la torre");
            }
        }
    }

    @Override
    public void eliminar(String id) {
        // Usar removeIf para eliminar la torre con el código proporcionado
        boolean eliminado = listaDeTorres.removeIf(torre -> torre.getCodigo().equals(id));

        // Confirmar si se eliminó o no
        if (eliminado) {
            System.out.println("La torre con código " + id + " fue eliminada correctamente.");
        } else {
            System.out.println("No se encontró ninguna torre con el código " + id + ".");
        }
    }


    @Override
    public ArrayList<Object> listar() {
        
        ArrayList<Object> resultado = new ArrayList<>();
    
        
        for (Torre torre : listaDeTorres) {
            resultado.add(torre);
        }

        
        return resultado;
    }
    
}
