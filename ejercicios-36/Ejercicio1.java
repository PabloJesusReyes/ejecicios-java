/**
 * Realiza la multiplicación de dos números
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio1 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce dos numeros separados por espacios: ");
    double x1 = s.nextDouble();
    double x2 = s.nextDouble();
   
    
    double mult= (x1 * x2);
    
    System.out.println("La multiplicación de esos dos números es " + mult);
  }
}
