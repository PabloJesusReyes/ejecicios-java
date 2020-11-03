/**
 *  1ºDAM - Ejercicios de programación
 * Primera cifra
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio21 { 
  public static void main(String[] args) {
    
    double control1, control2;
    
    System.out.print("Nota del primer control: ");
    control1 = Integer.parseInt(System.console().readLine());
    System.out.print("Nota del segundo control: ");
    control2 = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    double nota = (control1 + control2) / 2;
    
    if (nota >= 5) {
      System.out.println("Tu nota de Programación es " + nota);
    } else {
      System.out.print("¿Cúal ha sido el resultado de la recuperación? ");
      System.out.println("apto/no apto");
      String rec = System.console().readLine();
      
      if(rec.equals("apto")) {
        System.out.println("Tu nora de Programación es 5");
      } else {
        System.out.println("Tu nota de Programación es " + nota);
      }
    }
  }
}

