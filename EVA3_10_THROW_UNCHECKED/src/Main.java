//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       try {
           Persona p = new Persona("Juan", -1, "pancho");
       } catch (RuntimeException re) {
           re.printStackTrace();
       }
        System.out.println("FIN DEL PROGRAMA");
    }
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    public Persona(){
        this.nombre = "-";
        this.edad = 0;
        this.apellido = "-";
    }
    public Persona(String nombre, int edad, String apellido){
        this.nombre = nombre;
        this.edad = edad;
        if((edad < 0) || (edad > 150))
            throw new RuntimeException("La edad debe ser entre 0 y 150");
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        if((edad < 0) || (edad > 150))
            throw new RuntimeException("La edad debe ser entre 0 y 150");
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}