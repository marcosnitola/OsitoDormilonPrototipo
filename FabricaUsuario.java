
/**
 * Fabrica de tipos de usuario
 * 
 * @author Marcos Nitola 
 * @version 20240501
 */
public class FabricaUsuario
{
    

    /**
     * Crea el usuario Profesional de la salud
     * 
     * @param nombre Nombre profesional salud
     * @param email Correo del profesional salud
     * @param hashPass Hash contraseña profesional salud
     * @param especialidad Especialidad del profesional
     * @return usuario profesional de la salud 
     */
    public Usuario crearUsuario(String nombre, String email, String hashPass, String especialidad)
    {
        Usuario usuario = null;
        if (nombre.length() <= 0 | nombre.length() > 512){
            System.out.println("El nombre no puede estar vacio o ser demasiado largo");
            nombre = null;
        }
        
        usuario = new ProfesionalSalud(App.getUsuarioN()+1,nombre,email,hashPass, especialidad);
        
        return usuario;
    }
    
    /**
     * Crea el usuario normal
     * 
     * @param nombre Nombre usuario
     * @param email Correo del usuario
     * @param hashPass Hash contraseña del usuario
     * @return usuario normal
     */
    public Usuario crearUsuario(String nombre, String email, String hashPass)
    {
        Usuario usuario = null;
        if (nombre.length() <= 0 | nombre.length() > 512){
            System.out.println("El nombre no puede estar vacio o ser demasiado largo");
            nombre = null;
        }

        usuario = new UsuarioNormal(App.getUsuarioN()+1,nombre,email,hashPass);
        
        return usuario;
    }
}
