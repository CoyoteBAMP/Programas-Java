import java.util.Scanner;
public class FibonacciIIReforzado
{
   public static void main(String[] args)
   {
      Scanner entrada = new Scanner(System.in); 
      int decision=1;
      while (decision==1)
      { 
         int numRequerido;
         int numeroPenultimo=0;
         int numeroUltimo=1;
         int numeroActual=0;
         do
         {
            System.out.println("Ingresa un número entero y positivo");
            System.out.println("¿Cuál número quieres ver de la serie fibonacci?");
            numRequerido=entrada.nextInt();
            if (numRequerido<=0)
            {
               System.out.println("Este número no es valido");
            }
         }while (numRequerido<1);
         {
            System.out.println("El numero "+numRequerido+" de la serie fibonacci es: ");
            for (int i=2;i<=numRequerido;i++)
            {
               numeroActual=numeroPenultimo+numeroUltimo;
               numeroPenultimo=numeroUltimo;
               numeroUltimo=numeroActual;
            }
            System.out.print(numeroPenultimo);
            System.out.println("\n¿Quieres ejecutar otra vez el programa?"+"\nSi= 1"+"  No= 0");
            decision=entrada.nextInt();
            if (decision==0)
            {
               System.out.println("Adios campeón");
            }
            else
            {
               System.out.println("Proseguimos campeón");
            }
         }
      }   
   }
}