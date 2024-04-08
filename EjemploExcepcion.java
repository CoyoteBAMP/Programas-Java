public class EjemploExcepcion 
{
   public static void main(String[] args)
   {
      try
      {
         int numerador=4;
         int denominador=0;
         float division=numerador/denominador;
         System.out.println("El resultado de dividir "+numerador+" entre "+denominador+" es: "+division);
      }
      catch(ArithmeticException ex)
      {
         System.out.println("ERROR:"+ex.getMessage());
         System.out.println("No se puede dividir un numero entre 0");
      }
   }
}