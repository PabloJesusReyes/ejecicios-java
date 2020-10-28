/**
 *  1ºDAM - Ejercicios de programación
 * Ordenar tres numeros desde teclado
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio13 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa ordena 3 números.");
    
    System.out.print("Por favor, introduzca el primer número:");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca el segundo número");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca el tercer número:");
    double c = Double.parseDouble(System.console().readLine());
    
    double primer,segundo,tercero;
    if (a > b) {
      if (a > c) {
      primer = a;
        if (c > b) {
          segundo = c;
          tercero = b;
        } else {
          segundo = b;
          tercero = c;
          }
      } else {
      primer = c;
      segundo = a;
      tercero = b;
      }
    } else {
        if (b > c) {
          primer = b;
        if (c > a) {
          segundo = c;
          tercero = a;
        } else {
          segundo = a;
          tercero = c;
        }
      } else {
        primer = c;
        segundo = b;
        tercero = a;  
        }

    }
          System.out.printf("El mayor número es: %f , el segundo %f y el tercero %f",primer, segundo, tercero);
  }
}
