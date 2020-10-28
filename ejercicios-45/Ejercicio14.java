/**
 *  1ºDAM - Ejercicios de programación
 * Dice si un numero entero es par y/o divisible entre 5
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio14 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa dice si un numero entero es par y/o divisible entre 5.");
    
    System.out.print("Por favor, introduzca el número:");
    int num = Integer.parseInt(System.console().readLine());
    String paridad, entreCinco;
    
    if(num%2 == 0){
      paridad = "El numero es par ";
    } else {
      paridad ="El numero es impar ";
    }
    if (num%5 == 0){
      entreCinco = "el numero es divisble entre 5.";
    }else{
      entreCinco = "el numero no es divisible entre 5.";
    }
    
    System.out.print("" + paridad + "y " + entreCinco);
  }
}
