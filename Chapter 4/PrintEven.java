// Chapter 4, Exercise 6
// Jan Bogoryja-Zakrzewski, Dat19i

public class PrintEven{

   public static void printEven(int min, int max)
   {
      if (min > max)
      {
         System.out.print("[ ");
         for(int i = min; i >= max; i--)
         {
            if (i%2 == 0) System.out.print(i + " ");
         }
         System.out.print("]\n");
      }
      else
      {
         System.out.print("[ ");
         for(int i = min; i <= max; i++)
         {
            if (i%2 == 0) System.out.print(i + " ");
         }
         System.out.print("]\n");
      }
   }

   public static void main(String[] args)
   {
      printEven(1, 7);
      printEven(21, 15);
      printEven(2, 2);
   }
}
