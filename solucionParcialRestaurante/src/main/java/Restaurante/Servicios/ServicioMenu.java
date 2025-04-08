/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante.Servicios;

/**
 *
 * @author Paola
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Restaurante.dominio.*;
import java.util.List;

import java.util.ArrayList;

/**
 *
 * @author Paola
 */
public class ServicioMenu {
    
    private static ServicioMenu instancia;
    private List<Plato> platos;


    public ServicioMenu() {
        platos = new ArrayList();

    }
    
    public static ServicioMenu getInstancia() {
        if (instancia == null) {
            synchronized (ServicioMenu.class) {
                if(instancia == null){
                    instancia = new ServicioMenu();
            }
        }
       
    }
     return instancia;}

   
    

    public List<Plato> getPlatos() {
        return platos;
    }
}
