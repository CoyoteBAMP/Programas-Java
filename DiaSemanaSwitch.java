public class DiaSemanaSwitch
{
   public static void main(String[] args)
   {
      int dia=6;
      switch(dia)
      {
         case 1:
               System.out.println("El d�a es Lunes");
               break;
         case 2:
               System.out.println("El d�a es Martes");
               break;
         case 3:
               System.out.println("El d�a es Miercoles");
               break;
         case 4:
               System.out.println("El d�a es Jueves");
               break;
         case 5:
               System.out.println("El d�a es Viernes");
               break;
         case 6:
               System.out.println("El d�a es Sabado");
               break;
         case 7:
               System.out.println("El d�a es Domingo");
               break;
         default:
               System.out.println("Ese d�a no existe");
      }
   }
}