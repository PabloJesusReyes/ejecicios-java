/**
 * dibujar una piramide
 * 
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio19 {
  public static void main(String[] args) {
  
      System.out.print("Introduzca la altura: ");
      int alt = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el caracter ");
      String car = System.console().readLine();
      for(int i = 0; i < alt * 2; i = i + 2)  {
        for(int j = 0; j <= alt - i - 1; j++) {
          System.out.print(" ");
        }
        
        for (int j = 0; j <= i  ;j++) {
           System.out.print(car);
        }
        System.out.println("");
      }
  }
}
