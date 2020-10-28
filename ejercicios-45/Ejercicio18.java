/**
 *  1ºDAM - Ejercicios de programación
 * Primera cifra
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio18 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa indicual cual es la primera cifra de un múmero");
    
    System.out.print("Introduzca el número entero de cincon cifras máximo: ");
    int num = Integer.parseInt(System.console().readLine());
    
    while (num >= 10){
      num = num - (num%10);
      num = num / 10;
    }
    System.out.println("");
    System.out.printf("La primera cifra del numero es: %d ", num);
  }
}

