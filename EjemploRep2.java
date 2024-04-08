import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploRep2
{
   public static void main(String[] args)
   {
      BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
      float numero=0;
      boolean repetir=true;
      while(repetir)
      {
         try
         {
            System.out.println("Ingrese un número");
            numero=Float.parseFloat(entrada.readLine());
            repetir=false;
         }
         catch(IOException ex)
         {
            System.out.println("Tenemos un error al leer el teclado");
            repetir=true;
         }
         catch(NumberFormatException ex2) 
         {
            System.out.println("No introduciste un número");
            repetir=true;
         }
      }
      System.out.println("El numero elegido fue "+numero);
   }
}