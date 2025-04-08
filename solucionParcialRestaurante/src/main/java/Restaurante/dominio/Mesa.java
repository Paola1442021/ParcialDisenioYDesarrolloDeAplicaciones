/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante.dominio;

import Restaurante.dominio.Camarero;


/**
 *
 * @author Paola
 */
public class Mesa {
    private int numero;
    private int capacidad;
    private String ubicacion;
    private Camarero camarero;
    private boolean abierta;
    public Mesa(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    
    public Camarero getCamarero() {
        return camarero;
    }

    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }
    public boolean estaAbierta()
    { return false;
    }
}
