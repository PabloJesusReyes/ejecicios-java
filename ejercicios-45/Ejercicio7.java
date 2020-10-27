/**
 *  1ºDAM - Ejercicios de programación
 * Tiempo que tarda en caer un objeto
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio7 { 
  public static void main(String[] args) {
    
    double x,y,z;
    
    System.out.print("Por favor, introduzca la primera nota:");
    x = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la segunda nota:");
    y = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la tercera nota:");
    z = Double.parseDouble(System.console().readLine());
    
    if (x >= 0 && y >= 0 && z >= 0 && x <= 10 && y <= 10 && z <= 10) {
      System.out.printf("La media es igual a %.2f", (x+y+z)/3);
    } else {
      System.out.printf("Alguna nota es menor que cero o mayor que diez");
    }
  }
}
