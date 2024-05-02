
public class ProfesionalSalud extends Usuario{
    private String especialidad;
    public ProfesionalSalud(int id, String name, String email, String hashPass, String especialidad){
        super(id, name, email, hashPass);
        this.especialidad = especialidad;
    }
}
