/**
 *  1ºDAM - Ejercicios de programación
 * Tiempo que tarda en caer un objeto
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio8 { 
  public static void main(String[] args) {
    
    double nota1,nota2,nota3,nota;
    
    System.out.print("Por favor, introduzca la primera nota:");
    nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la segunda nota:");
    nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la tercera nota:");
    nota3 = Double.parseDouble(System.console().readLine());
    
    if (nota1 >= 0 && nota2 >= 0 && nota3 >= 0 && nota1 <= 10 && nota2 <= 10 && nota3 <= 10) {
      nota = (nota1 + nota2 + nota3) / 3;
      System.out.printf("La media es igual a %.2f, ", nota);
      if(nota < 5) {
        System.out.println("la nota es un insuficiente");
      } else if(nota < 6) {
        System.out.println("la nota es un suficiente");
      } else if(nota < 7) {
        System.out.println("la nota es un bien");
      } else if(nota < 9) {
        System.out.println("la nota es un notable");
      } else {
        System.out.println("la nota es un sobresaliente");
      }
    } else {
      System.out.printf("Alguna nota es menor que cero o mayor que diez");
    }
  }
}
