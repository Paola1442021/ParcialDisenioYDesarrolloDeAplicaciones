/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante.Servicios;

import Restaurante.dominio.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paola
 */
public class ServicioPedidos {
    private static ServicioPedidos instancia;
    private List<Pedido> pedidos;
    

    public ServicioPedidos() {
        pedidos = new ArrayList();

    }
    
    public static ServicioPedidos getInstancia() {
        if (instancia == null) {
            synchronized (ServicioPedidos.class) {
                if(instancia == null){
                    instancia = new ServicioPedidos();
            }
        }
       
    }
     return instancia;}

   public Pedido agregarPedido(int cantidad,Plato plato,Mesa mesa)
   { Pedido pedido = new Pedido(cantidad,plato,mesa);
       if(pedido.esPedidoValido())
        {
            this.setearCodigoDe(pedido);
            pedidos.add(pedido);
            return pedido;
        }
       return null;
       
   }
   
    public List<Pedido> mostrarPedidos()
    {
        return this.getPedidos();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public int obtenerUltimoNum()
    {
        return this.getPedidos().size();
    }
    public void setearCodigoDe(Pedido pedido)
    {
         pedido.setCodigo(obtenerUltimoNum());
    }
    
}
