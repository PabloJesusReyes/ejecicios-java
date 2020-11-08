/**
 * calculo de media
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class ejercicio10 {
  public static void main(String[] args) {
    int div = 0;
    int num = 0;
    int suma = 0;
    while(num >= 0){
    System.out.println("Introduzca numeros para la media (para parar introduzca un número negativo: ");
    num = Integer.parseInt(System.console().readLine());
    suma = suma + num;
    div++;
    }
    System.out.printf("La media de los números positivos es: %f" , (double) (suma - num) / (div - 1));
 
  }
}
