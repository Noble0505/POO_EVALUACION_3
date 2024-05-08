import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
             final String miRuta="C:\\Archivos\\archivo_texto.txt";
             try{
             leerArchivoFiles(miRuta);
                 System.out.println("\n");
             leerArchivoBuffer(miRuta);
                 System.out.println("\n");
             leerArchivoFileReader(miRuta);
                 System.out.println("\n");
                 leerArchivoConScanner(miRuta);
             } catch(IOException e){
                 System.out.println(e);
             }

    }
    /*
     Lectura de archivos usando la clase Files.
     Se lee todo el archivo y se carga en memoria.
     Por tanto, es util solo para archivos pequeños.
     */
    public static void leerArchivoFiles(String ruta) throws IOException {
        System.out.println("Lectura de archivo de texto con clase FIle Class. \n------------------------------------");
        Path path = Paths.get(ruta);//crea la ruta de tipo Path
        byte[] datos = Files.readAllBytes(path);//Genera un IOException
                           //new String --> convierte el arreglo de byte en
                           //una cadena de texto
        System.out.println(new String(datos));

    }
    /*
    Es adecuado para leer archivos grandes
    nos permite procesar arcbivos de texto linea por linea
    es adecuado para la multitarea
     */
    public static void leerArchivoBuffer(String ruta) throws IOException {
        System.out.println("Lectura de archivo de texto con clase BufferedReader. \n-----------------------------------");
       //Abrir el archivo
        //Leer el archivo con informacion binaria
        //Convertir la informacion binaria a texto
        File file = new File(ruta);
        FileInputStream in = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        String linea;
        //asignamos la linea a la variable cade
        //si cade es diferente de null, estamos
        //leyendo texto,si leemos null,llegamos
        //al final del archivo
        while ((linea = br.readLine()) != null){
            System.out.println(linea);
        }
        br.close();

    }
    public static void leerArchivoFileReader(String ruta) throws IOException {
        System.out.println("Lectura de archivo de texto con clase FileReader. \n-----------------------------------");
        File file = new File(ruta);
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String linea;
        //asignamos la linea a la variable cade
        //si cade es diferente de null, estamos
        //leyendo texto,si leemos null,llegamos
        //al final del archivo
        while ((linea = br.readLine()) != null){
            System.out.println(linea);
        }
        br.close();
    }
   public static void leerArchivoConScanner(String ruta) throws IOException {
       System.out.println("Lectura de archivo de texto con clase Scanner. \n-----------------------------------");
        Path path = Paths.get(ruta);
       Scanner leer = new Scanner(path);
       while (leer.hasNextLine()){
           System.out.println(leer.nextLine());
       }
        leer.close();
   }
}