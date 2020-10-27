/**
 *  1ºDAM - Ejercicios de programación
 * Tiempo que tarda en caer un objeto
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio8 { 
  public static void main(String[] args) {
    
    double x,y,z,nota;
    
    System.out.print("Por favor, introduzca la primera nota:");
    x = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la segunda nota:");
    y = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la tercera nota:");
    z = Double.parseDouble(System.console().readLine());
    
    if (x >= 0 && y >= 0 && z >= 0 && x <= 10 && y <= 10 && z <= 10) {
      nota = (x+y+z)/3;
      System.out.printf("La media es igual a %.2f ", nota);
      if(nota < 5) {
        System.out.println("La nota es un insuficiente");
      }
      if(nota >= 5 && nota <=6) {
        System.out.println("La nota es un suficiente");
      }
      if(nota >= 6 && nota <=7) {
        System.out.println("La nota es un bien");
      }
      if(nota >= 7 && nota <=9) {
        System.out.println("La nota es un notable");
      }
      if(nota >= 9) {
        System.out.println("La nota es un sobresaliente");
      }
    } else {
      System.out.printf("Alguna nota es menor que cero o mayor que diez");
    }
  }
}
