/**
 * tres columnas con el número, su cuadrado y el cubo.
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio11 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());

    for (int i = num; i < (num + 5); i++) {
      System.out.printf("%4d %6d %8d \n", i, (i * i), (i * i * i));
    }
  }
}
