import java.util.Scanner;
/**
 * Realiza la calculadora de dos numeros
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio4 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce dos números (pueden contener decimales) separados por espacios: ");
    double x1 = s.nextDouble();
    double x2 = s.nextDouble();
    
    double suma = x1 + x2;
    double resta = x1 - x2;
    double mult = x1 * x2;
    double div = x1 / x2;
    System.out.println("La suma de los dos numeros es igual a " + suma);
    System.out.println("La resta de los dos numeros es igual a " + resta);
    System.out.println("La mult de los dos numeros es igual a " + mult);
    System.out.println("La div de los dos numeros es igual a " + div);
  }
}
