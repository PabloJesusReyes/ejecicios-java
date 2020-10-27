/**
 *  1ºDAM - Ejercicios de programación
 * Tiempo que tarda en caer un objeto
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio6 { 
  public static void main(String[] args) {
    
    double h,t,g;
    
    g = 9.81;
    System.out.print("Por favor, introduzca ela altura h:");
    h = Double.parseDouble(System.console().readLine());
    
    if (h > 0){
      t = Math.sqrt(2*h/g); 
      System.out.printf("Tarda  en caer %.2f segundos", t);
    } else {
      System.out.printf("Esa ecuacion no tiene solución real");
    }
  }
}
