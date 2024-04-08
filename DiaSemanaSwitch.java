public class DiaSemanaSwitch
{
   public static void main(String[] args)
   {
      int dia=6;
      switch(dia)
      {
         case 1:
               System.out.println("El día es Lunes");
               break;
         case 2:
               System.out.println("El día es Martes");
               break;
         case 3:
               System.out.println("El día es Miercoles");
               break;
         case 4:
               System.out.println("El día es Jueves");
               break;
         case 5:
               System.out.println("El día es Viernes");
               break;
         case 6:
               System.out.println("El día es Sabado");
               break;
         case 7:
               System.out.println("El día es Domingo");
               break;
         default:
               System.out.println("Ese día no existe");
      }
   }
}