import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int  num = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
              System.out.println("Introduce un numero entero: ");
              num = sc.nextInt();
              break;
              }catch(InputMismatchException e){
              System.out.println("numero equivocado, intenta de nuevo");
          }
      }while (true);
      System.out.println(num);


    }
}