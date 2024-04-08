import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploBuffered
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Ingrese su nombre:");
      String nombre=entrada.readLine();
      System.out.println("Ingrese el primer número: ");
      int numero=Integer.parseInt(entrada.readLine());
      System.out.println("Ingrese el segundo número: ");
      int numero2=Integer.parseInt(entrada.readLine());
      int suma=numero+numero2;
      System.out.println("Hola "+nombre);
      System.out.println("La suma de "+numero+" + "+numero2+" es igual= "+suma);
   }
}