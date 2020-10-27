/**
 *  1ºDAM - Ejercicios de programación
 * Cuestionario del curso
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio12 { 
  public static void main(String[] args) {
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE 1º DAM");
    
    System.out.println("1.¿Cual de los siguientes es un factor de riesgo ergonomico?");
    System.out.println("a) El ruido");
    System.out.println("b) Los virus"); 
    System.out.println("c) La postura");  
    System.out.print("Respuesta ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos = puntos +1;
    }
    System.out.println("Has obtenido " + puntos + " puntos.");
  }
}
