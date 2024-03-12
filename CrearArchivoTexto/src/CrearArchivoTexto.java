import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivoTexto {
    public static void main(String[] args) {
        String nombreArchivo = "sergiodeleon.txt";
        String contenidoArchivo = "escriba un programa que sea capaz de crear un archivo con el texto con su [nombre sin espacios] Ejemplo: jennerperez.txt, el cual contenga el texto de este numeral";

        crearArchivo(nombreArchivo, contenidoArchivo);
    }

    public static void crearArchivo(String nombreArchivo, String contenidoArchivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            writer.println(contenidoArchivo);
            System.out.println("Archivo '" + nombreArchivo + "' creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}
