/**
 * digitos de un número por teclado
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio9 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca el número: ");
    int num = Integer.parseInt(System.console().readLine());
    int dig = 1;
    
    while(num >= 10) {
        num = num / 10;
        dig++;
    }
    System.out.print("El número es de " + dig + " digitos");
  }
}
