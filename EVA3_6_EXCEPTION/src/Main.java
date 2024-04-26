import java.util.InputMismatchException;
import java.util.Scanner;

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
        }catch(Exception e){
            if(e instanceof InputMismatchException){
                System.out.println("InputMismatchException");
            }else
                System.out.println("ArithmeticException");
        }
        System.out.println("Programa finalizado.");
    }
}