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
public class ServicioSala {
    
    private static ServicioSala instancia;
    private List<Mesa> mesas;
    private List<Camarero> camareros;


    public ServicioSala() {
        mesas = new ArrayList();
        camareros = new ArrayList();

    }
    
    public static ServicioSala getInstancia() {
        if (instancia == null) {
            synchronized (ServicioSala.class) {
                if(instancia == null){
                    instancia = new ServicioSala();
            }
        }
       
    }
     return instancia;}

    public Mesa buscarMesaPor(Camarero camarero,int numeroMesa) {
        Mesa m = new Mesa(numeroMesa);
       Camarero c = this.buscar(camarero);
        if(m.getCamarero().equals(c))
        { return m;
        }else{
        return null;
        }   
        }
    
    public Mesa buscar(Mesa mesa)
    {
        for(Mesa m : mesas)
        {
            if(m.getNumero()==(mesa.getNumero()))
            {
                return m;
            }
        }
        return null;
    }
      public Camarero buscar(Camarero camarero)
    {
        for(Camarero c : camareros)
        {
            if(c.getNombre().equals(camarero.getNombre()))
            {
                return c;
            }
        }
        return null;
    }

    public void agregarMesa(Mesa mesa) {
        this.mesas.add(mesa);
    }
}


