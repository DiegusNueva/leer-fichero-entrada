import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(new File("entrada.txt"))) {
            System.out.println(LeerEntrada.leerDatos(s));
        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado");
        }
    }
}