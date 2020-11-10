/**
 * calculo de primo
 * 
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio16 {
  public static void main(String[] args) {
    
      System.out.print("Introduzca el número: ");
      int num = Integer.parseInt(System.console().readLine());
      boolean primo = true;
    for(int i = 2; i <= num / 2 ;i++) { 
      if (num % i == 0) {
        primo = false;
        }
    }
    if(primo == true)  {
       System.out.print("El número introducido es primo");
    } else {
         System.out.print("El número no es primo");
    }
  }
}
