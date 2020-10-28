/**
 *  1ºDAM - Ejercicios de programación
 * Ultima cifra
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio17 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa indicual cual es la ultima cifra de un múmero");
    
    System.out.print("Introduzca el número entero: ");
    int num = Integer.parseInt(System.console().readLine());
     System.out.println("");
    System.out.printf("La ultima cifra del numero es: %d ", (num % 10));
  }
}

