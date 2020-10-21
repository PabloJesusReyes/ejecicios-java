import java.util.Scanner;
/**
 * Calculo del total de una factura
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio7 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la base imponible: ");
    double base = s.nextDouble();


    System.out.println("El total es igual a " + (base * 1.16));
  }
}
