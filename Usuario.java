
/**
 * Superclase usuario que contiene los atributos basicos y getters y setters.
 * 
 * @author Marcos Nitola
 * @version 20240501
 */
public class Usuario
{
    protected int ID;
    protected String name;
    protected String email;
    protected String hashPass;
    protected String biografia;
    protected String urlFoto;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(int ID, String name, String email, String hashPass)
    {
        this.ID = ID;
        this.setName(name);
        this.setEmail(email);
        this.setHashPass(hashPass);
    }

    /**
     * Obtener el nombre del usuario
     * 
     * @return El nombre del usuario 
     */
    public String getName(){return name;}
    /**
     * Establecer el nombre del usuario
     * 
     * @param name El nombre del usuario 
     */
    public void setName(String name){this.name = name;}
    /**
     * Obtener el correo del usuario
     * 
     * @return El correo del usuario 
     */
    public String getEmail(){return email;}
    /**
     * Establecer el correo del usuario
     * 
     * @param email El correo del usuario 
     */
    public void setEmail(String email){this.email = email;}
    /**
     * Establecer el hash de la contraseña del usuario
     * 
     * @param pass El hash de la contraseña del usuario 
     */
    public void setHashPass(String pass){this.hashPass = pass;}
    /**
     * Obtener el ID del usuario
     * 
     * @return El id del usuario 
     */
    public int getID(){return this.ID;}
    /**
     * Establecer la biografia del usuario
     * 
     * @param biografia Texto de presentacion  para el usuario
     */
    public void setBiografia(String biografia){this.biografia = biografia;}
    /**
     * Obtener biografia del usuario
     * 
     * @return Biografia del usuario
     */
    public String getBiografia(){return this.biografia;}
    /**
     * Establecer la url de la foto del usuario
     * 
     * @param biografia Texto de presentacion  para el usuario
     */
    public void setUrlFoto(String urlFoto){this.urlFoto = urlFoto;}
    /**
     * Obtener url de la foto del usuario
     * 
     * @return url de la foto de usuario del usuario
     */
    public String getUrlFoto(){return this.urlFoto;}
}
