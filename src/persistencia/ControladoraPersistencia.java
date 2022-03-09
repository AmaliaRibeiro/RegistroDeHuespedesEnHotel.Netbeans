
package persistencia;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Huesped;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    HuespedJpaController hueJPA = new HuespedJpaController(); 
    
        //METODO PARA EL ALTA
     public void crearHuesped (Huesped hues) {
         try {
             hueJPA.create(hues);
         }
         catch (Exception e) {
             System.out.println("No se pudo crear el huesped");
         }
         }
        //METODO PARA BAJA
     public void eliminarHuesped (Huesped hues) {
 
        try {
            hueJPA.destroy(hues.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     public void eliminarHuesped (int id) {
 
        try {
            hueJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     //METODO PARA LECTURA
     public List<Huesped> obtenerHuespedes() {
        
         return hueJPA.findHuespedEntities();
     }
     
     //METODO PARA MODIFICACION
     public void modificarhuesped (Huesped hue) {
        try {
            hueJPA.edit(hue);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     //METODO PARA BUSQUEDA
     public Huesped buscarHuesped (Huesped hue) {
         
         return hueJPA.findHuesped(hue.getId());
     }
     public Huesped buscarHuesped (int id) {
         
         return hueJPA.findHuesped(id);
     }
}
      


