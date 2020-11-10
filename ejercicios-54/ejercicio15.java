/**
 * calculo de potencia
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio15 {
  public static void main(String[] args) {
    
      System.out.print("Introduzca la base: ");
      int base = Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduzca el exponente: ");
      int exp = Integer.parseInt(System.console().readLine());
      
      int pot = base;
      int i;
    for(i = 1; i < exp ;i++) { 
      System.out.print("" + base + "^" + i + "= " + pot +", ");
      pot = pot*base;
    }
    System.out.print("" + base + "^" + i + "= " + pot +".");
  }
}
