import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Clase usuario profesional de la salud
 * 
 * @author Marcos Nitola
 * @version 20240502
 */
public class ProfesionalSalud extends Usuario{
    private String especialidad;
    private List<Recurso> recursos;
    public ProfesionalSalud(int id, String name, String email, String hashPass, String especialidad){
        super(id, name, email, hashPass);
        recursos = new ArrayList<>();
        this.especialidad = especialidad;
    }
    
    public void agregarRecurso(Recurso recurso){
        recursos.add(recurso);
    }
    
    public void eliminarRecurso(int id){
        this.recursos.remove(id);
    }
}
