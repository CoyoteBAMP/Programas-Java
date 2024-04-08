import java.util.Scanner;
public class FibonacciII
{
   public static void main(String[] args)
   {
      Scanner entrada = new Scanner(System.in); 
      int numero2=1;
      int numero;
      int valor1=0;
      int valor2=1;
      int suma=0;
      do
      {
         System.out.println("Ingresa un número entero y positivo");
         System.out.println("¿Cuál número quieres ver de la serie fibonacci?");
         numero=entrada.nextInt();
         if (numero<=0)
         {
            System.out.println("Este número no es valido");
         }
         else
         {
         }
      }
      while (numero<1);
      {
         System.out.println("El numero "+numero+" de la serie fibonacci es: ");
         for (int i=2;i<=numero;i++)
         {
            suma=valor1+valor2;
            valor1=valor2;
            valor2=suma;
         }
         System.out.print(valor1);
      }   
   }
}