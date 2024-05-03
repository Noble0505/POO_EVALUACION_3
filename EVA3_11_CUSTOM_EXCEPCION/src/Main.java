//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 try{
     mensaje();
 }catch(MiExcpecion e){
     e.printStackTrace();
 }
        System.out.println("FIN DEL PROGRAMA");
    }
    public static void mensaje() throws MiExcpecion{
        System.out.println("mensaje");
        throw  new MiExcpecion("Falla del sistema!!!!");
    }
}
class MiExcpecion extends Exception {
    public MiExcpecion() {
    }

    public MiExcpecion(String message) {

        super(message);
    }

}