/**
 * Muestra por pantalla mi horario
 *
 * @author Pablo Jesús Reyes Podadera
 */

public class AnimacionPrueba { // Clase principal
  public static void main(String[] args) {
    int step;
    long Time0;
    long Time1;
    long runTime;
    for(step=0; step<10; step++){
      System.out.print("\033[H\033[2J");
      System.out.flush();
      if(step%2==0){
        System.out.println("        \033[32m ████");
        System.out.println("     \033[32m  ████████  \033[92m████");
        System.out.println("    \033[32m █████████████\033[92m█  ██");
        System.out.println("    \033[32m █████████████\033[92m█████");
        System.out.println("   \033[92m██\033[32m█████████████\033[92m███");
        System.out.println("     \033[92m████████████");
        System.out.println("    \033[92m ████    ████");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
      }
      else{
        System.out.println("        \033[32m ████");
        System.out.println("     \033[32m  ████████  \033[92m████");
        System.out.println("    \033[32m █████████████\033[92m█  ██");
        System.out.println("    \033[32m █████████████\033[92m█████");
        System.out.println("   \033[92m██\033[32m█████████████\033[92m███");
        System.out.println("     \033[92m████████████");
        System.out.println("  \033[92m  ████    ████");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
      }
      //A partir de aqui es para esperar entre fotogramas
      runTime=0;
      Time0 = System.currentTimeMillis();
      while (runTime<1000){
        Time1 = System.currentTimeMillis();
        runTime = Time1 -Time0;
      }
      
    }
  }
}
