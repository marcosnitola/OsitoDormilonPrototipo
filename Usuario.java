
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}
    public void setHashPass(String pass){this.hashPass = pass;}
}
