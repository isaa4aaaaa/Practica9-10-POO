package mx.unam.fi.poo.g1.p910;
import java.util.Scanner;

/**
 * Clase principal
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
class Practica910{
    /**
     * Método main
     * Se define la funcionalidad del programa
     * @param args -> Arreglo por defecto del método main
     */
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("-------Revision de vocales en cadenas-------");
            System.out.println("Ingresa la palabra que quieras revisar:");
            String palabra = s.nextLine();
            LecturaCadena lecturaCadena = new LecturaCadena(palabra);
            lecturaCadena.revisarVocales();
            System.out.println("La palabra si contiene vocales!!");

        } catch (ExcepcionNoVocales e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

  