
package logica;

import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class ProbandoJPA {

    
    public static void main(String[] args) {
      
       Controladora control = new Controladora();
       Huesped hue0 = new Huesped(1, "Gabriel", "Villalba", new Date());
       Huesped hue1 = new Huesped(2, "Amalia", "Ribeiro", new Date());
       Huesped hue2 = new Huesped(3, "Florencia", "Ribeiro", new Date());
       
       /*control.crearHuesped(hue0);
       control.crearHuesped(hue1);
       control.crearHuesped(hue2);*/
       
       //control.eliminarHuesped(hue2.getId());
       
       /*List<Huesped> lista = control.obtenerHuespedes();
       for (Huesped hue : lista) {
           System.out.println("id: " + hue.getId());
           System.out.println("Nombre: " + hue.getNombre());
           System.out.println("Apellido: " + hue.getApellido());
       
       }*/
       hue2.setApellido("Barrios");
       hue2.setNombre("Jorge");
       
       control.modificarhuesped(hue2);
    }
    
}
