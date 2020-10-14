/**
 * Muestra por pantalla mi horario
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio5 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Hora\tLunes\tMartes\tMierc\tJueves\tViernes");
    System.out.println("--------------------------------------------------");
    System.out.printf("8:15\033[31m\tED\033[35m\tPro\tPro\tPro");
    System.out.println("\033[34m\tFOL\033[37m");
    System.out.printf("9:15\033[31m\tED");
    System.out.println("\033[35m\tPro\tPro\033[32m\tLM\033[34m\tFOL\033[37m");
    System.out.printf("10:15\033[31m\tED\033[32m\tLM\033[35m\tPro");
    System.out.println("\033[32m\tLM\033[34m\tFOL\033[37m");
    System.out.println("11:15\tDesc\tDesc\tDesc\tDesc\tDesc\033[37m");
    System.out.printf("11:45\033[35m\tPro\033[32m\tLM");
    System.out.println("\033[33m\tBBDD\033[36m\tSIn\tSIn\033[37m");
    System.out.printf("12:45\033[35m\tPro\033[33m\tBBDD");
    System.out.println("\tBBDD\033[36m\tSIn\tSIn\033[37m");
  }
}
