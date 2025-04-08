package Restaurante.Presentacion;


import Restaurante.Presentacion.Consola;
import Restaurante.Servicios.*;
import Restaurante.dominio.*;
import java.util.ArrayList;
import java.util.List;


public class IUConsola {
    private Camarero camarero;
    private Fachada fachada = Fachada.getInstancia();
    
    public  void registrarPedido(Camarero camarero) {
        
        Mesa mesa = this.seleccionarMesa();
        Plato plato = seleccionarPlato();
        int cantidad = Consola.leerInt("Ingrese cantidad");
       Pedido registrado = fachada.agregarPedido(cantidad,plato,mesa);
       if(registrado!=null)
       {
       this.mostrarPedido(registrado);
       }else{
            Consola.println("No se pudo ingresar el pedido");
       }
    }
    private String mostrarPedido(Pedido pedido)
    {
        return "Pedido ingresado con Nro. " + pedido.getCodigo() + " - " + "(" + pedido.getFechaHora() + ")";
    }
    
     
 /*
    }

    private static void verAgenda(Usuario usuarioLogueado) {        
        Consola.println("Agenda de " + usuarioLogueado.getNombreYApellido());
        Consola.println("Cantidad de contactos: " + usuarioLogueado.getAgenda().getCantidadContactos());
        
        for(Contacto contacto : usuarioLogueado.getAgenda().getContactos())
            Consola.println(contacto.getNombre());
    }*/
      private Mesa seleccionarMesa() {
          Mesa mesa = null;
          do{
              int numeroMesa = Consola.leerInt("Ingrese numero de mesa");
              mesa = fachada.selecionnarMesa(camarero, numeroMesa);
                if(mesa == null) 
                    Consola.println("Mesa invalida");
          }while (mesa == null);
          return mesa;
      }
      private Plato seleccionarPlato(){
          List<Plato> platos = this.fachada.obtenerPlatos();
          int platoSeleccionado = Consola.menu(this.formatearPlatos(platos));
          return platos.get(platoSeleccionado);
       
      }  
         private List<String> formatearPlatos(List<Plato> listaPlatos){
      List<String> formateado = new ArrayList();
      for (Plato p : listaPlatos)
      {
          formateado.add(p.toString());
      } return formateado;
      }  

}
        