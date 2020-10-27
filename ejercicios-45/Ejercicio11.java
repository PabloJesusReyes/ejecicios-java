/**
 *  1ºDAM - Ejercicios de programación
 * Tiempo hasta la media noche
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio11 { 
  public static void main(String[] args) {
    
    
    System.out.print("Por favor, introduzca la hora actual(sin minutos): ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca los minutos: ");
    int min = Integer.parseInt(System.console().readLine());
    
    int segundosPasados = hora*3600+min*60;

  

  
    System.out.printf("Quedan %d segundos hasta la media noche ",(24*3600 - segundosPasados));
  }
}
