import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploNumero
{
   public static void main(String[] args)
   {
      BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
      double numero=-1;
      do
      {
         try
         {
            System.out.println("Ingrese un número entre 1 y 10");
            numero=Double.parseDouble(entrada.readLine());
         }
         catch(IOException ex)
         {
            System.out.println("Tenemos un error al leer el teclado");
         }
         catch(NumberFormatException ex2) 
         {
            System.out.println("No introduciste un número");
         }
      }while(numero<=0 || numero>10);
      {
         System.out.println("El numero elegido fue "+numero);
      }
   }
}
