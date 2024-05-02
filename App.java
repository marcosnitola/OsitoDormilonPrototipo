import java.util.Scanner;
/**
 * Main class
 * 
 * @author Marcos Nitola
 * @version v0.1
 */
public class App
{
    private static Scanner sc;
    private static String opt;
    
    private static Usuario[] usuarios;
    private static int usuarioN = 0;
    
    public static void main(String[] args)
    {
        usuarios = new Usuario[4096];
        
        sc = new Scanner(System.in);
        menu();
    }
    
    private static void menu(){
        do{
            System.out.println("== Bienvenido a OsitoDormilon ==");
            System.out.println("1: Registrarse");
            System.out.println("2: Iniciar sesion");
            opt = sc.nextLine();
            switch (opt){
                case "1":
                    registrarse();
                    break;
                case "2":
                    
                    break;
            }
        } while(!opt.equals("x"));
    }
    
    private static void registrarse(){
        FabricaUsuario fabricaUsuario = new FabricaUsuario();
        System.out.println("== Registro ==");
        System.out.println("Ingresa tu correo electronico:");
        String correo = sc.nextLine();
        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu nueva contraseña");
        String contrasenna = sc.nextLine();
        System.out.println("Eres profesional de la salud? [(s)i/(n)o]");
        opt = sc.nextLine();
        if (opt.equals("s")){
            System.out.println("Escriba tu especialidad");
            String especialidad = sc.nextLine();
            App.agregarUsuario(fabricaUsuario.crearUsuario(nombre,correo,contrasenna,especialidad));
        } else if (opt.equals("n")){
            App.agregarUsuario(fabricaUsuario.crearUsuario(nombre,correo,contrasenna));
        }
        //Usuario nuevoUsuario = new Usuario(nombre,correo,contrasenna);
        System.out.println("Usuario creado exitosamente. Vuelva a iniciar sesion por seguridad.");
    }
    
    public static void agregarUsuario(Usuario usuario){
        usuarios[App.usuarioN] = usuario;
        usuarioN = usuarioN +1;
    }
    
    public static int getUsuarioN(){return App.usuarioN;}
}
