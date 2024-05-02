
/**
 * Recurso como URL o articulos sobre salud mental.
 * 
 * @author Marcos Nitola
 * @version 20240502
 */
public class Recurso
{
    private ProfesionalSalud autor;
    private String titulo;
    private String contenido;
    private TipoRecurso tipo;
    
    public enum TipoRecurso{
        ARTICULO, ENLACE_EXTERNO
    }
    /**
     * Constructor para la clase Recurso
     */
    public Recurso(ProfesionalSalud autor, String titulo, String contenido, TipoRecurso tipo)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
        this.tipo = tipo;
        autor.agregarRecurso(this);
    }

    /**
     * Edita contenido del recurso
     * 
     * @param contenido Contenido textual del recurso
     * @return Retorna el estado, True para edicion exitosa, False de lo contrario
     */
    public boolean editarRecurso(String contenido)
    {
        if(contenido.length() > 0 & contenido.length() <= 32768){
            this.contenido = contenido;
            System.out.println("Recurso editado exitosamente");
            return true;
        } else {
            System.out.println("El contenido no debe ser vacio o mayor de 32768");
            return false;
        }
    }
}
