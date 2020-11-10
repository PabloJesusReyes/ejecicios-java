/**
 * calculo de primo
 * 
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio17 {
  public static void main(String[] args) {
  
      System.out.print("Introduzca el número: ");
      int num = Integer.parseInt(System.console().readLine());
      if(num < 0) {
        System.out.print("El número introducido es negativo");
      } else {
          int total = num; 
          
          for(int i = num; i < num + 99; i++){
          total = total + num + i;  
          }
          System.out.print("La suma es: " + total);
      }
  }
}
