import java.time.LocalDateTime;
/**
 * Publicacion que realiza un usuario en una comunidad
 * 
 * @author Marcos Nitola 
 * @version 20240502
 */
public class Publicacion
{
    private String contenido;
    private String fecha;
    private Usuario autor;

    /**
     * Constructor for objects of class Publicacion
     * @param autor Usuario autor de la publicacion
     * @param contenido Contenido textual de la publicacion
     * @param fecha Fecha en la que se publica
     */
    public Publicacion(Usuario autor, String contenido){
        this.autor = autor;
        this.contenido = contenido;
        this.fecha = LocalDateTime.now().toString();
        
    }

    /**
     * Edita el contenido de la publicacion
     * 
     * @param contenido El nuevo contenido que reemplazara al viejo
     * @return True si se puede cambiar, False en caso contrario
     */
    public boolean editarContenido(String contenido)
    {
        if(contenido.length() > 0 & contenido.length() <= 2048){
            this.contenido = contenido;
            System.out.println("Contenido editado exitosamente");
            return true;
        } else {
            System.out.println("El contenido no debe ser vacio o mayor de 32768");
            return false;
        }
    }
}
