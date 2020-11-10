/**
 * calculo de primo
 * 
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio18 {
  public static void main(String[] args) {
  
      System.out.print("Introduzca el número más pequeño: ");
      int menor = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el número más grande: ");
      int mayor = Integer.parseInt(System.console().readLine());
      
      if(menor >= mayor) {
        System.out.print("Los números introducido son incorrectos");
      } else {
          
          for(int i = menor; i <= mayor; i = i + 7){
            System.out.print("" + i + ", ");
          }
          System.out.print("" + mayor + ".");
      }
  }
}
