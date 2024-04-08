import java.util.Scanner;
public class FibonacciIModificado
{
   public static void main(String[] args)
   {
      Scanner entrada = new Scanner(System.in); 
      int decision=1;
      while (decision==1)
      { 
         int numsRequeridos=0;
         do
         {
            System.out.println("Ingresa un número entero y positivo");
            System.out.println("¿Cuantos números quieres ver de la serie fibonacci?");
            numsRequeridos=entrada.nextInt();
            if (numsRequeridos<=0)
            {
               System.out.println("Este número no es valido");
            }
         }while (numsRequeridos<1);
         {
            int numeroPenultimo=0;
            int numeroUltimo=1;
            System.out.println("Los primeros "+numsRequeridos+" de la serie fibonacci son: ");
            for (int i=1;i<=numsRequeridos;i++)
            {
               System.out.print(numeroPenultimo+",");
               int numeroActual=numeroPenultimo+numeroUltimo;
               numeroPenultimo=numeroUltimo;
               numeroUltimo=numeroActual;
            }
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