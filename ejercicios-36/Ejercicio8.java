import java.util.Scanner;
/**
 * Calculo del salario semanal a partir de las horas
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio8 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce las horas trabajadas: ");
    double horas = s.nextDouble();


    System.out.println("El total a pagar es igual a " + (horas * 12) + "euros.");
  }
}
