import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persona perso = new Persona("Juan", "Peres", 23);
        guardarObjeto(perso);
        Persona perso2 = leerObjeto();
        System.out.println(perso2);

    }
    public static Persona leerObjeto() throws IOException, ClassNotFoundException {
        Persona p = null;

            String ruta = "C:\\Archivos\\personas.per";
            FileInputStream abrir = new FileInputStream(ruta);
            ObjectInputStream leerArch = new ObjectInputStream(abrir);
            p = (Persona)leerArch.readObject();
        return p;
    }
    public static void guardarObjeto(Persona obj) throws IOException {

            String ruta = "C:\\Archivos\\personas.per";
            FileOutputStream abrirarch = new FileOutputStream(ruta);
            ObjectOutputStream guardarDatos = new ObjectOutputStream(abrirarch);
            guardarDatos.writeObject(obj);

    }

}
class Persona implements Serializable {
    String nombre;
    String apellido;
    int edad;

    public Persona() {
        nombre = "---";
        apellido = "---";
        edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
@Override
    public String toString() {
        return "\n Nombre: " + nombre + "\n Apellido " + apellido + "\n Edad: " + edad;
}
}