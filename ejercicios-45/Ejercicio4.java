import java.util.Scanner;
/**
 * Salario en funcion de horas
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio4 { 
  public static void main(String[] args) {
    
    int horas;

    System.out.print("Introduzca el número de horas: ");
    horas = Integer.parseInt(System.console().readLine());
    int total;
    
    if(horas > 40)  {
      total = 40*12 + (horas-40)*16;
    } else {
        total = horas*12;
    }
    
    System.out.printf("El sueldo semanal que le corresponde es de %d euros", total);
    
  }
}
