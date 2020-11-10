/**
 * Lista de números
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio13 {
  public static void main(String[] args) {
    int pos = 0;
    int neg = 0;
    for(int i = 0; i <=9;i++) { 
      
      System.out.print("Introduzca un número: ");
      int num = Integer.parseInt(System.console().readLine());
      
      if(num < 0)  {
        
        neg++;
        
      } else  {
        
        pos++;
        
      }
    }
    System.out.print("Has introducido " + pos + " números positivos y " + neg + " números negativos");
  }
}
