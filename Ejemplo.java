import java.util.Scanner;
public class Ejemplo
{
   public static void main(String[] args)
   {
      Scanner entrada = new Scanner(System.in); 
      int numero1;
      int numero2;
      int multiplicacion;
      System.out.println("Introduce un n�mero:");
      numero1=entrada.nextInt();
      System.out.println("Introduce el segundo n�mero:");
      numero2=entrada.nextInt();
      multiplicacion=numero1*numero2;
      System.out.println("La multiplicaci�n es= "+multiplicacion);
   }
}
   
         