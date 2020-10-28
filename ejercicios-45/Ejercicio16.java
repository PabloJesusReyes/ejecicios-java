/**
 *  1ºDAM - Ejercicios de programación
 * Test de fidelidad
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio16 { 
  public static void main(String[] args) {
    
    System.out.println("Responda a las siguientes preguntas con verdadero o falso");
    
    System.out.print("Tu pareja parece estar más inquieta de lo normal sin ");
    System.out.println("ningún motivo aparente");
    System.out.println("Verdadero(v) o falso (f)");
    String res = System.console().readLine();
    int puntos = 0;
    if (res.equals("v")) {
      puntos = puntos +3;
    }
    System.out.println("Ha aumentado sus gastos de vestuario");
    System.out.println("Verdadero(v) o falso (f)");
    res = System.console().readLine();
    if (res.equals("v")) {
      puntos = puntos +3;
    }
    System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    System.out.println("Verdadero(v) o falso (f)");
    res = System.console().readLine();
    if (res.equals("v")) {
      puntos = puntos +3;
    }
     System.out.print("Ahora se afeita y se asea con más frecuencia (si es hombre) ");
    System.out.print("o ahora se arregla el pelo y se asea con más frecuencia ");
    System.out.println("si es mujer");
    System.out.println("Verdadero(v) o falso (f)");
    res = System.console().readLine();
    if (res.equals("v")) {
      puntos = puntos +3;
    }
    System.out.println("No te deja que mires la agenda de su telefono movil");
    System.out.println("Verdadero(v) o falso (f)");
    res = System.console().readLine();
    if (res.equals("v")) {
      puntos = puntos +3;
    }
    System.out.println("Tiene llamadas que dice no querer contestar cuando estas delante");
    System.out.println("Verdadero(v) o falso (f)");
    res = System.console().readLine();
    if (res.equals("v")) {
      puntos = puntos +3;
    }
    System.out.println("Ultimamente se preocupa mas en cuidar la línea y/o estar bronceado/a");
    System.out.println("Verdadero(v) o falso (f)");
    res = System.console().readLine();
    if (res.equals("v")) {
      puntos = puntos +3;
    }
    System.out.println("Muchos días viene tarde de trabajar porque dice tener más trabajo");
    System.out.println("Verdadero(v) o falso (f)");
    res = System.console().readLine();
    if (res.equals("v")) {
      puntos = puntos +3;
    }
    System.out.println("Has notado que uĺtimamente se perfuma más");
    System.out.println("Verdadero(v) o falso (f)");
    res = System.console().readLine();
    if (res.equals("v")) {
      puntos = puntos +3;
    }
    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    System.out.println("Verdadero(v) o falso (f)");
    res = System.console().readLine();
    if (res.equals("v")){
      puntos = puntos +3;
    }
    
    if (puntos <10){
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel");
      } else if (puntos <22) {
        System.out.print("Quizás exista el preligro de otra persona en su vida ");
        System.out.print("o en su mente, aunque seguramente será algo sin importancia. ");
        System.out.println("No bajes la guardia");
      } else {
        System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo ");
        System.out.print("un romance con otra persona. Te aconsejamos que indagues ");
        System.out.print("un poco más y averigues que es lo que esta pasando por su cabeza");
      }
  }
}

