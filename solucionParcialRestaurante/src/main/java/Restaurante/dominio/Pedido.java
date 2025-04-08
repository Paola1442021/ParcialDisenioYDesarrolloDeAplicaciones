/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante.dominio;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Paola
 */
public class Pedido {
    private int codigo;
    private int cantidad;
    private LocalTime fechaHora;
    private Plato plato;
    private Mesa mesa;

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }


    public Pedido(int cantidad, Plato plato, Mesa mesa) {
        this.cantidad = cantidad;
        this.fechaHora = LocalTime.now();
        this.plato = plato;
        this.mesa = mesa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
public boolean esPedidoValido(){
      return this.cantidadValida() && this.getMesa().isAbierta() && this.getPlato().isEstaDisponible();
   }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }
    public boolean cantidadValida(){
    return cantidad>0 && cantidad<99;
}
}
