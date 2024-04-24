//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //NULLPOINTEREXCEPTION:
        //OCURRE CUANDO QUEREMOS USARE UN OBJETO QUE NO EXISTE
        Persona persona= null;
        System.out.println(persona.toString());

        //INDEXOUTOFBOUNSEXCEPTION: Error de arreglos
        //leer una posicion que no existe
        int arreglo[]= new int[10];
        //0 es la primer posicion, n - 1 es la ultima (9)
        arreglo[15]=100;
        //ARITMETHICEXCEPTION: DIVISION ENTRE CERO

        int x = 10, y = 0;
        int resu = x / y;
        System.out.println(resu);

    }
}
class Persona {}