import java.util.Scanner;
/**
 * Calcula la nota a sacar en un examen para una nota final deseada
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio12 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la nota del primer examen: ");
    double exam = s.nextDouble();
    
    System.out.print("Introduce la nota que quieres en el trimestre: ");
    double total= s.nextDouble();
    
    System.out.printf("Tienes que sacar un %.2f en el segundo examen" , ((total-exam*0.4)/0.6));
  }
}
