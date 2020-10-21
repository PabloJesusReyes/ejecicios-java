import java.util.Scanner;
/**
 * Calculo del area de un triangulo
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio6 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la base y la altura (pueden contener decimales) separadas por espacios: ");
    double base = s.nextDouble();
    double altura = s.nextDouble();


    System.out.println("El area del rectangulo es igual a " + ((base * altura)/2));
  }
}
