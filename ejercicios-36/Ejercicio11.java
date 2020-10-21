import java.util.Scanner;
/**
 * Conversor de KB a Mb
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio11 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el numero de Kbs: ");
    double kb = s.nextDouble();
    
    System.out.printf("Eso equivale a %.2f Mbs" , (kb / 1024));
  }
}
