/**
 *  1ºDAM - Ejercicios de programación
 * Construir una piramide
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio15 { 
  public static void main(String[] args) {
    
    System.out.println("Pinta una piramide con el caracter introducido");
    
    System.out.print("Por favor, introduzca el caracter:");
    String c = System.console().readLine();
    System.out.println("Por favor, elija a donde quiere que este el vertice de la piramide:");
    System.out.println("1. Arriba:");
    System.out.println("2. Abajo:");
    System.out.println("3. Izquierda:");
    System.out.println("4. Derecha:");
    System.out.print("Opcion: ");
    int op = Integer.parseInt(System.console().readLine());
    
    switch (op) {
      case 1:
        System.out.println("  " + c);
        System.out.println(" " + c + c + c);
        System.out.println("" + c + c + c + c + c);
        break;
      case 2:
        System.out.println("" + c + c + c + c + c);
        System.out.println(" " + c + c + c);
        System.out.println("  " + c);
        break;
      case 3:
        System.out.println("  " + c);
        System.out.println(" " + c + c);
        System.out.println("" + c + c + c);
        System.out.println(" " + c + c);
        System.out.println("  " + c);
        break;
      case 4:
        System.out.println("" + c);
        System.out.println("" + c + c);
        System.out.println("" + c + c + c);
        System.out.println("" + c + c);
        System.out.println("" + c);
        break;
    }
  }
}
