import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numerador: ");
        int num = sc.nextInt();
        System.out.println("Introduce el divisor: ");
        int div = sc.nextInt();
        int resu = 0;
        resu= num/div;
        System.out.println("Resultado: " +resu);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Programa finalizado.");
    }

}