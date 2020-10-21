/**
 * Uniendo varios char en un string
 *
 * @author Pablo Jesús Reyes Podadera
 */
public class Ejerc8 {
  public static void main(String[] args) {
   char a = 'T';
   char b = 'e';
   char c = 's';
   char d = 'i';
   char e = '*';
   //me da un error de tipo de datos int
   //String nombre = e + a + b + c + c + d + b + e;
   //Añadimos comillas dobles al principio
   //supongo que asi toma los valores de las variables como char y no como int
   String nombre = "" + e + a + b + c + c + d + b + e;
   System.out.printf(nombre);
  }
}
