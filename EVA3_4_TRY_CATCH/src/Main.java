//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x = 10, y = 0;
        int resu = 0;
        try{//aqui va el codigo que puede fallar
             resu = x / y;

        }catch(ArithmeticException e){//aqui va la solucion
            //que queremos hacer
            System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO\n"+e);
        }
        System.out.println("Resultado = " +resu);
    }
}