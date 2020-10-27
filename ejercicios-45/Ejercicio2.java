import java.util.Scanner;
/**
 * Saludo en funcion de la hora
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio2 { 
  public static void main(String[] args) {
    
    int hora;

    System.out.print("Introduzca la hora: ");
    hora = Integer.parseInt(System.console().readLine());
     
    if((hora <= 12) && (hora >= 6)) {
      System.out.print("Buenos días");
    }
    
    if ((hora <= 20) && (hora >= 13)) {
      System.out.println("Buenas tardes");
    }
    
    if (((hora <= 24) && (hora >= 21)) || ((hora <= 5) && (hora >= 0))) {
      System.out.println("Buenas noches");
    } 
    
    if ((hora < 0) || (hora > 24)) {
      System.out.println("Hora incorrecta");
    }
  }
}
