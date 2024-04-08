import java.util.Scanner;
public class FibonacciI
{
   public static void main(String[] args)
   {
      Scanner entrada = new Scanner(System.in); 
      int numero;
      int valor1=0;
      int valor2=1;
      int suma=0;
      do
      {
         System.out.println("Ingresa un número entero y positivo");
         System.out.println("¿Cuantos números quieres ver de la serie fibonacci?");
         numero=entrada.nextInt();
         if (numero==0)
         {
            System.out.println("El número cero no es considerado positivo");
         }
         else
         {
         }
      }
      while (numero<1);
      {
         System.out.println("Los primeros "+numero+" de la serie fibonacci son: ");
         for (int i=1;i<=numero;i++)
         {
            System.out.print(valor1+",");
            suma=valor1+valor2;
            valor1=valor2;
            valor2=suma;
         }
      }
   }
}
