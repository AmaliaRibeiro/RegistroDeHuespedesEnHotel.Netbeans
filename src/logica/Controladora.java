
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    public void crearHuesped (Huesped hues) {
         controlPersistencia.crearHuesped(hues);
     }
    public void eliminarHuesped (Huesped hues) {
         controlPersistencia.eliminarHuesped(hues);
      }
    public void eliminarHuesped (int id) { 
        controlPersistencia.eliminarHuesped(id);
    }
    public List<Huesped> obtenerHuespedes() {
       return controlPersistencia.obtenerHuespedes();
        
    }
    public void modificarhuesped (Huesped hue) {
        controlPersistencia.modificarhuesped(hue);
    }
    public Huesped buscarHuesped (Huesped hue) {
        return controlPersistencia.buscarHuesped(hue);
    }
    public Huesped buscarHuesped (int id) {
        return controlPersistencia.buscarHuesped(id);
    }
}
