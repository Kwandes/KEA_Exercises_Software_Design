// Chapter 3, Exercise 2
// Jan Bogoryja-Zakrzewski, Dat19i

public class Foo3Bar2{

   final static int MAX_POWER = 4;

   public static void printPowersOf10(int n)
   {
      if (n > 5)
      {
         System.out.println("N too big");
         return;
      }
      
      int power;
      
      for(int i = MAX_POWER; i >= n-1 ; i--)
      {
         power = 10;
         for(int j = 0; j < i ; j++)
         {
            power *= 10;
         }
         System.out.print(power + " ");
      }
   
   }

   public static void main(String[] args)
   {
      printPowersOf10(2);
   }
}