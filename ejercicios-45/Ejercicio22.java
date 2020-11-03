/**
 *  1ºDAM - Ejercicios de programación
 * Primera cifra
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio22 { 
  public static void main(String[] args) {
    
    int horas, min;
    String dia;
    
    System.out.print("Introduzca el dia de la semana(lunes-viernes): ");
    dia = System.console().readLine();
    System.out.print("Introduzca la hora(sin minutos): ");
    horas = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca los minutos: ");
    min = Integer.parseInt(System.console().readLine());
    
    int numDias = 0;
    switch(dia) {
      case "lunes":
        numDias = 0;
        break;
      case "martes":
        numDias = 1;
        break;
      case "miercoles":
        numDias = 2;
        break;
      case "jueves":
        numDias = 3;
        break;
      case "viernes":
        numDias = 4;
        break;
      default:
        numDias = 0;
      }
      int total= ((4 * 24 * 60) + (15 * 60)) - ((numDias * 24 *60) + (horas * 60) + min);
      
      System.out.print("Faltan " + total + " minutos");
  }
}

