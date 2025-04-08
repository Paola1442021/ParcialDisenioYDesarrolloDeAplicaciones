/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante.Servicios;

import Restaurante.dominio.*;
import java.util.List;

/**
 *
 * @author Paola
 */
public class Fachada {
    private static Fachada instancia;
    private ServicioMenu sMenu;
    private ServicioPedidos sPedidos;
    private ServicioSala sSala;
    
    private Fachada(){
        this.sMenu = new ServicioMenu();
        this.sPedidos = new ServicioPedidos();
        this.sSala = new ServicioSala();
    }
    
    public static Fachada getInstancia() {
        if(instancia==null)
        {
            synchronized (Fachada.class) {
                if(instancia == null)
                    instancia = new Fachada();
            }
        }
      return instancia;  
    }
    public Mesa selecionnarMesa(Camarero camarero, int numeroMesa)
    {
        return sSala.buscarMesaPor(camarero,numeroMesa);
    }
    
    public List<Plato> obtenerPlatos(){
      return  sMenu.getPlatos();

    }

    public Pedido agregarPedido(int cantidad,Plato plato,Mesa mesa)
 {
        return this.sPedidos.agregarPedido(cantidad,plato,mesa);
    }
}
