import java.util.Scanner;
/**
 * Realiza la conversion de pesetas a euros
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio3 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la cantidad de pesetas a convertir: ");
    double pesetas = s.nextDouble();
    
    double ratio= 166.38;
    
    System.out.println("La conversion es igual a " + (pesetas / ratio) + "euros.");
  }
}
