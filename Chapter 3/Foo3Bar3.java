// Chapter 3, Exercise 3
// Jan Bogoryja-Zakrzewski, Dat19i

public class Foo3Bar3{

   public static void printPowersOfN(int base, int exponent)
   {
      if (exponent > 50)
      {
         System.out.println("N too big");
         return;
      }
      
      for(int i = 0; i <= exponent ; i++)
      {
         System.out.print( power(base, i) + " ");
      }
      System.out.println();
   }
   
   public static int power(int base, int exponent)
   {
      int result = base;
      
      if ( exponent == 0 ) return 1;
      
      for(int i = 1; i < exponent ; i++)
      {
         result *= base;
      }
      return result;
   }
   

   public static void main(String[] args)
   {
      printPowersOfN(4, 3);
      printPowersOfN(5, 6);
      printPowersOfN(-2, 8);
   }
}