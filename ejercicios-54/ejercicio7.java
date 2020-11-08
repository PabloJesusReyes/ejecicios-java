/**
 * Muestra los numeros del 0 al 100 de 5 en 5.
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio7 {
  public static void main(String[] args) {
    int i = 0;
    int combinacion;
    boolean abierta = false;
    while(i <= 3 && abierta == false) {
      System.out.print("Introduzca la combinación: ");
      combinacion = Integer.parseInt(System.console().readLine());
      if (combinacion == 1234){
        abierta = true;
      } else{
        System.out.println("Lo siento, esa no es la combinación");
        i++;
      }
    }
    if (abierta){
       System.out.println("La caja fuerte se ha abierto satisfactoriamente");
    } else{
         System.out.println("Agotado el numero de intentos");
    }
  }
}
