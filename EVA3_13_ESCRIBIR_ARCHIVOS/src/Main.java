import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final static String miRuta = "C:\\Archivos\\";
    public static void main(String[] args) {

        try {
            escribirFiles(miRuta + "files.txt", "Toon link desperto cabrones");
            escribirFileWriter(miRuta + "fileWriter.txt", "Steve desperto cabrones");
            escribirBufferedWriter(miRuta + "bufferedWriter.txt", "El saul es gay");
        }catch (IOException e){
            System.out.println(e);
        }

    }
    //Clase files
    public static void escribirFiles(String ruta, String datos) throws IOException {
        Path path = Paths.get(ruta);//abrir el archivo
        Files.write(path, datos.getBytes());//guardar los datos
    }
    public static void escribirFileWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }
    public static void escribirBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(datos);
        bufferedWriter.close();
    }
}