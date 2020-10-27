import java.util.Scanner;
/**
 * Dia de la semana con java
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio1 { 
  public static void main(String[] args) {
    
    String dia;

    System.out.print("Introduzca un día de la semana en minusculas: ");
    dia = (System.console().readLine()); 
     
    switch(dia) {
      case "lunes":
        System.out.println("Programación");
        break;
      case "martes":
        System.out.println("Programación");
        break;
      case "miércoles":
        System.out.println("Programación");
        break;
      case "jueves":
        System.out.println("Sistemas Informáticos");
        break;
      case "viernes":
        System.out.println("Bases de Datos");
        break;
      default:
        System.out.println("Ese dia no hay clase.");
    }
  }
}
