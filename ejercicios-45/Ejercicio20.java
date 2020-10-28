/**
 *  1ºDAM - Ejercicios de programación
 * Primera cifra
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio20 { 
  public static void main(String[] args) {
    
    int num;
    boolean capicua = false;
    
    System.out.print("Por favor, introduzca un número entero de 5 cifras como máximo: ");
    num = Integer.parseInt(System.console().readLine());
    
    if (num < 10) {
      capicua = true;
    } else if (num < 100) {
      if ((num / 10) == (num % 10)) {
        capicua = true;
      }
    } else if (num < 1000) {
      if ((num / 100) == (num % 10)) {
        capicua = true;
      } else if (num < 10000)
      if(((num / 1000)  == (num % 10)) && ((num / 10) % 10) == (num % 100) / 10){
        capicua = true;
      } else if (num < 100000){
        if(((num / 10000) == (num % 10)) && (num / 1000) == (num % 100)){
        capicua = true;
        }
      } else {
        System.out.println("el número es mayor de 5 cifras");
      }
    }
    if (capicua == true) {
      System.out.println("El número introducido es capicua.");
    } else {
      System.out.println("El número introducido no es capicua.");
    }
  }
}
