/**
 * Tabla de multiplicar del numero por teclado
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio8 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca el número del cual quiere saber la tabla: ");
    int num = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i <= 9;i++) {
      System.out.println("" + i + "x" + num + "= " + i*num);
    }
  }
}
