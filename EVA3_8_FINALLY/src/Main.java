import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            int num = sc.nextInt();
            System.out.println("El valor capturado es: " + num);
        }
        catch (Exception e) {
            //lo que se quiere hacer con la excepcion
            System.out.println("El valor introducido no es valido");
        }finally {
            //Usar para ejecutar codigo critico para el programa
            //terminar procesos, cerrar archivos o conexiones
            //Liberar recursos, etc...
            //NADA EVITA QUE SE PUEDA PRODUCIR UNA EXCEPCION EN
            //ESTE BLOQUE DE CODIGO
            /*int x = 100, y = 0;
            int div = x/y;
            System.out.println(div);*/
            System.out.println("ESTA INSTRUCCION SIEMPRE SE VA A EJECUTAR");
        }

    }
}