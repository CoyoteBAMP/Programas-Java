public class DiaSemana
{
   public static void main(String[] args)
   {
      int dia=3;
      if (dia<1 || dia>7)
      {
         System.out.println("No existe dia para ese número");
      }
      else
      {
         if (dia==1)
         {
            System.out.println("El dia es Lunes");
         }
         else
         {
            if (dia==2)
            {
               System.out.println("El dia es Martes");
            }
            else
            {
               if (dia==3)
               {
                  System.out.println("El dia es Miercoles");
               }
               else
               {
                  if (dia==4)
                  {
                     System.out.println("El dia es Jueves");
                  }
                  else
                  {
                     if (dia==5)
                     {
                        System.out.println("El dia es Viernes");
                     }
                     else
                     {
                        if (dia==6)
                        {
                           System.out.println("El dia es Sabado");
                        }
                        else
                        {
                           if (dia==7)
                           {
                              System.out.println("El dia es Domiengo");
                           }
                           else
                           {
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
