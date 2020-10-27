import java.util.Scanner;
/**
 * Dia en funcion del número
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio4 { 
  public static void main(String[] args) {
    
    int horas;

    System.out.print("Introduzca el número de horas: ");
    horas = Integer.parseInt(System.console().readLine());
    int horasExtras = horas - 40;
    int total;
    
    if(horasExtras > 0)  {
      total = 40*12 + horasExtras*16;
    } else {
        total = horas*12;
    }
    System.out.printf("El sueldo semanal que le corresponde es de %d euros", total);
  } 
}
