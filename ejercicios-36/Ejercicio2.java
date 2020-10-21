import java.util.Scanner;
/**
 * Realiza la multiplicación de dos números
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio2 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la cantidad de euros a convertir: ");
    double euros = s.nextDouble();
    
    double ratio= 166.38;
    
    System.out.println("La conversion es igual a " + (euros * ratio) + "pesetas.");
  }
}
