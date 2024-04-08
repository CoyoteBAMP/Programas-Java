public class OperacionesAritmeticasSwitch
{
   public static void main(String[] args)
   {
      float numeroUno=8;
      float numeroDos=2;
      int operacion=4;
      float resultado;
      switch(operacion)
      {
         case 1:
            resultado=numeroUno+numeroDos;
            System.out.println("Elegiste la operación suma");
            System.out.println("El resultado de "+numeroUno+" "+"mas "+numeroDos+" "+"es= "+resultado);
            break;
         case 2:
            resultado=numeroUno-numeroDos;
            System.out.println("Elegiste la operación resta");
            System.out.println("El resultado de "+numeroUno+" "+"menos "+numeroDos+" "+"es= "+resultado);
            break;
         case 3:
            resultado=numeroUno*numeroDos;
            System.out.println("Elegiste la operación multiplicación");
            System.out.println("El resultado de "+numeroUno+" "+"por "+numeroDos+" "+" es= "+resultado);
            break;
         case 4:
            resultado=numeroUno/numeroDos;
            System.out.println("Elegiste la operación división");
            System.out.println("El resultado de "+numeroUno+" "+"entre "+numeroDos+" "+"es= "+resultado);
            break;
         default:
            System.out.println("Operación no disponible");
      }
   }
}