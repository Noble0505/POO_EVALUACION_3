import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*try{
            Persona perso = new Persona("Pablo", -1, "gutierrez");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/
       /*try{ Persona p = new Persona();
        p.setNombre("Juan");
        p.setApellido("Franco");
        p.setEdad(-2);

       }catch(Exception e){
           e.printStackTrace();
       }*/
       do {
           Persona perso = new Persona();

           try {
               Scanner sc = new Scanner(System.in);
               System.out.println("ingresa tu nombre");
               String nombre = sc.nextLine();
               perso.setNombre(nombre);
               System.out.println("ingresa tu apellido");
               String apellido = sc.nextLine();
               perso.setApellido(apellido);
               System.out.println("ingresa tu edad");
               int edad = sc.nextInt();
               perso.setEdad(edad);
               System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad);
           } catch (Exception e) {
               System.out.println("valor equivocado, prueba de nuevo");
           }
       }while (true);
    }
}
class Persona{
    private String nombre;
    private int edad;
    private String apellido;
    public Persona(){
        this.nombre = "-";
        this.edad = 0;
        this.apellido = "-";
    }
    public Persona(String nombre, int edad, String apellido) throws Exception {
        this.nombre = nombre;
        this.edad = edad;
        if((edad < 0) || (edad > 150))
            throw new Exception("El edad debe ser entre 0 y 150");
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

    public void setEdad(int edad) throws Exception {
        if((edad < 0) || (edad > 150))
            throw new Exception("El edad debe ser entre 0 y 150");
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}