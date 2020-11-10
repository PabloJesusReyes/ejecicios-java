/**
 * calculo de potencia
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio14 {
  public static void main(String[] args) {
    
      System.out.print("Introduzca la base: ");
      int base = Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduzca el exponente: ");
      int exp = Integer.parseInt(System.console().readLine());
      
      int pot = base;
      
    for(int i = exp; i > 1 ;i--) { 
      pot = pot*base;
    }
    System.out.print("La potencia es " + pot);
  }
}
