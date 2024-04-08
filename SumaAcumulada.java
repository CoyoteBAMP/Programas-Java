public class SumaAcumulada
{
   public static void main(String[] args)
   {
      int suma=0,suma1;
      for(int i=1;i<=100;i++)
      {  
         suma1=suma;
         suma=suma+i;
         System.out.println(suma1+"+"+i+"="+suma);
      }
      System.out.println("\nLa suma acumulada total es= "+suma);
   }
}
          