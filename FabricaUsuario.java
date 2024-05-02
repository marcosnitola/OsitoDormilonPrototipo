
/**
 * Fabrica de tipos de usuario
 * 
 * @author Marcos Nitola 
 * @version 20240501
 */
public class FabricaUsuario
{
    

    /**
     * Metodo crearUsuario
     * 
     * @param 
     * @return     the sum of x and y 
     */
    public Usuario crearUsuario(TipoUsuario tipo, String nombre, String email, String hashPass, String especialidad)
    {
        Usuario usuario = null;
        if (nombre.length() <= 0 | nombre.length() > 512){
            System.out.println("El nombre no puede estar vacio o ser demasiado largo");
            nombre = null;
        }
        
        if (tipo == TipoUsuario.PROFESIONAL_SALUD){
            usuario = new ProfesionalSalud(App.getUsuarioN()+1,nombre,email,hashPass, especialidad);
        } else if (tipo == TipoUsuario.USUARIO_COMUN){
            usuario = new UsuarioNormal(App.getUsuarioN()+1,nombre,email,hashPass);
        }
        
        return usuario;
    }
}
