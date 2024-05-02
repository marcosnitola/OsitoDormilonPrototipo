import java.util.List;import java.util.ArrayList;import java.util.Iterator;
/**
 * Clase comunidad grupos para apoyo
 * 
 * @author Marcos Nitola 
 * @version 20240502
 */
public class Comunidad
{
    private String nombre;
    private String descripcion;
    private List<Usuario> miembros;

    /**
     * Constructor de la clase Comunidad
     * 
     * @param nombre Nombre de la comunidad
     * @param descripcion Descripcion de la comunidad
     */
    public Comunidad(String nombre, String descripcion)
    {
        miembros = new ArrayList<>();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Añade usuarios a la lista de miembros
     * 
     * @param usuario Usuario a ser añadido
     */
    public void agregarUsuario(Usuario usuario){
        miembros.add(usuario);
    }
    
    /**
     * Elimina usuarios por su ID
     * 
     * @param id ID del usuario a eliminar
     * @return True si se pudo eliminar, false si no.
     */
    public boolean eliminarUsuario(int id){
        Iterator<Usuario> iterator = miembros.iterator();
        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();
            if (usuario.getID() == id) {
                iterator.remove();
                return true; 
            }
        }
        return false;
    }
}
