public class NuemeroPar
{
   public static void main(String[] args)
   {
      int numero=7;
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