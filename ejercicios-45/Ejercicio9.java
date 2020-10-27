/**
 *  1ºDAM - Ejercicios de programación
 * Resolucion de ecuaciones de segundo grado
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio9 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa resuelve ecuaciones de segundo grado.");
    System.out.println("ax^2 + bx + c = 0");
    
    System.out.print("Por favor, introduzca el valor de a:");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca el valor de b:");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca el valor de c:");
    double c = Double.parseDouble(System.console().readLine());
    
    if (a == 0 && b == 0 && c == 0) {
      System.out.printf("La ecuación tiene infinitas soluciones");

    } else if (a == 0 && b == 0 && c != 0) {
      System.out.printf("La ecuación no tiene solución");
    } else if ((4*a*c) > b*b){
      System.out.printf("La ecuación no tiene solución en los reales");
    } else {
      double sol1 = (-b + Math.sqrt(b * b - 4 * a * c))/(2*a);
      System.out.printf("Solucion primera: %.2f ",sol1);
      double sol2 = (-b - Math.sqrt(b * b - 4 * a * c))/(2*a);
      System.out.printf("Solucion segunda: %.2f ",sol2);
    }
  }
}
