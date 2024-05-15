import javax.swing.*;
import java.awt.event.MouseEvent;
import java.io.*;

public class BlockNotas extends javax.swing.JFrame {
    private JTextArea txtAreaArchivos;
    private JButton abrir;
    private JButton cerrar;

    private void abrir(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            File file = new File("C:\\Archivos\\text.txt");
            FileReader reader = new FileReader(file);
            BufferedReader buffreader = new BufferedReader(reader);
            txtAreaArchivos.read(buffreader, "xd");
            buffreader.close();
        } catch(Exception ex) {

        }
    }
    private void cerrar(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            File file = new File("C:\\Archivos\\text.txt"); // crea un objeto file con la ruta
            FileWriter filewriter = new FileWriter(file); // crea un objeto file writer con el objeto file
            BufferedWriter buffwriter = new BufferedWriter(filewriter); // crea un objeto buffered writer con el objeto file writer
            txtAreaArchivos.write(buffwriter);
            buffwriter.close();
        } catch(Exception ex) {

        }
    }


}
