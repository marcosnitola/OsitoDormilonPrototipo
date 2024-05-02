import java.time.LocalDateTime;
/**
 * Comentario que sera incluido en alguna publicacion
 * 
 * @author Marcos Nitola 
 * @version 20240502
 */
public class Comentario
{
    private Usuario autor;
    private String contenido;
    private String fecha;

    /**
     * Constructor para la clase Comentario
     * 
     * @param autor Autor del comentario
     * @param contenido Contenido del comentario
     */
    public Comentario(Usuario autor, String contenido)
    {
        this.autor = autor;
        this.contenido = contenido;
        this.fecha = LocalDateTime.now().toString();
    }
    
    
}
