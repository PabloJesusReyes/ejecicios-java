/**
 *  1ºDAM - Ejercicios de programación
 * signo
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejercicio10 { 
  public static void main(String[] args) {
    
    String signo = "";
    System.out.print("Por favor, introduzca el número del mes de nacimiento(1-12): ");
    int mes = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor introduzca el día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
  
    switch(mes) {
      case 1:
        if (dia < 21) {
          signo = "capricornio";
        } else {
          signo = "acuario";
        }
        break;
      case 2:
        if (dia < 21) {
          signo = "acuario";
        } else {
          signo = "piscis";
        }
        break;
      case 3:
        if (dia < 21) {
          signo = "piscis";
        } else {
          signo = "aries";
        }
        break;
      case 4:
        if (dia < 21) {
          signo = "aries";
        } else {
          signo = "tauro";
        }
        break;
      case 5:
        if (dia < 21) {
          signo = "tauro";
        } else {
          signo = "géminis";
        }
        break;
      case 6:
        if (dia < 21) {
          signo = "géminis";
        } else {
          signo = "cáncer";
        }
        break;
      case 7:
        if (dia < 21) {
          signo = "cáncer";
        } else {
          signo = "Leo";
        }
        break;
      case 8:
        if (dia < 21) {
          signo = "leo";
        } else {
          signo = "virgo";
        }
        break;
      case 9:
        if (dia < 21) {
          signo = "virgo";
        } else {
          signo = "libra";
        }
        break;
      case 10:
        if (dia < 21) {
          signo = "libra";
        } else {
          signo = "escorpio";
        }
        break;
      case 11:
        if (dia < 21) {
          signo = "escorpio";
        } else {
          signo = "sagitario";
        }
        break;
      case 12:
        if (dia < 21) {
          signo = "sagitario";
        } else {
          signo = "capricornio";
        }
        break;
      default:
    }
    System.out.print("Su signo es " + signo);
  }
}
