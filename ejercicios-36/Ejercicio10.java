import java.util.Scanner;
/**
 * Conversor de Mb a Kb
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio10 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el numero de Mb: ");
    double mb = s.nextDouble();
    
    System.out.println("Eso equivale a  " + (mb * 1024) + "Kbs.");
  }
}
