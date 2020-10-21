import java.util.Scanner;
/**
 * Calculo del volumen de un cono
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio9 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el radio de la base y la altura separadas por espacios: ");
    double radio = s.nextDouble();
    double alt = s.nextDouble();
    
    double vol = ((3.14/3) * (radio * radio) * alt);
    
    System.out.println("El volumen es " + vol);
  }
}
