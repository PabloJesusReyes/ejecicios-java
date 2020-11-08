/**
 * fibonacci
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio12 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    int n = Integer.parseInt(System.console().readLine());
    int a = 0;
    int b = 1;
    int total = 0;
    while(n > 0) {
      System.out.printf("" + total +", ");
      total = a + b;
      a = b;
      b = total;
      n--;
    }
  }
}
