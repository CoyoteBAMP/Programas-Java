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
            System.out.println("Elegiste la operaci�n suma");
            System.out.println("El resultado de "+numeroUno+" "+"mas "+numeroDos+" "+"es= "+resultado);
            break;
         case 2:
            resultado=numeroUno-numeroDos;
            System.out.println("Elegiste la operaci�n resta");
            System.out.println("El resultado de "+numeroUno+" "+"menos "+numeroDos+" "+"es= "+resultado);
            break;
         case 3:
            resultado=numeroUno*numeroDos;
            System.out.println("Elegiste la operaci�n multiplicaci�n");
            System.out.println("El resultado de "+numeroUno+" "+"por "+numeroDos+" "+" es= "+resultado);
            break;
         case 4:
            resultado=numeroUno/numeroDos;
            System.out.println("Elegiste la operaci�n divisi�n");
            System.out.println("El resultado de "+numeroUno+" "+"entre "+numeroDos+" "+"es= "+resultado);
            break;
         default:
            System.out.println("Operaci�n no disponible");
      }
   }
}