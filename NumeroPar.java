public class NumeroPar
{
   public static void main(String[] args)
   {
      int numero=11;
      int residuo;
      residuo=numero%2;
      if (residuo==0)
      {
         System.out.println("El número es par");
      }
      else
      {
         System.out.println("El número es impar");
      }
   }
}