import java.util.Scanner;
/**
 * Resolucion de ecuacion de primer grado
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio5 { 
  public static void main(String[] args) {
    double a,b,x;
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a:");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca el valor de b:");
    b = Integer.parseInt(System.console().readLine());
    
    if ((a == 0 && b != 0) || (a == 0 && b == 0) {
    System.out.printf("Esa ecuacion no tiene solución");
    } else {
    x= -b/a;
    System.out.printf("x= %.2f", x);
    }
  }
}
