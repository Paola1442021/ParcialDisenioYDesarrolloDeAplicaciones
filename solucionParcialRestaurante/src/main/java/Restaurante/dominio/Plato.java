/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante.dominio;

import java.util.List;

/**
 *
 * @author Paola
 */
public class Plato {
    private String abreviacion;
    private String descripcion;
    private List<Ingrediente> ingredientes;
    private boolean estaDisponible;
    public Plato() {
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstaDisponible() {
        boolean bandera=false;
        for(Ingrediente i : ingredientes)
        {
            if(i.isEstaDisponible())
            { bandera=true;
            }
        }
        return bandera;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    @Override
    public String toString()
    {
        return "['" + " " + this.getAbreviacion() + "']" + " " + "-" + this.getDescripcion();
    }
    
    
}
