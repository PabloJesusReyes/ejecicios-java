import java.util.Scanner;
/**
 * Dia en funcion del número
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio3 { 
  public static void main(String[] args) {
    
    int dia;

    System.out.print("Introduzca el número del dia, número entre 1 y 7: ");
    dia = Integer.parseInt(System.console().readLine());

    switch(dia) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miercoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("Ese dia no hay clase.");
    }
  }
}
