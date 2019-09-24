// Chapter 3, Exercise 4
// Jan Bogoryja-Zakrzewski, Dat19i

public class Foo3Bar4{

   public static void printDecrSquare(int max, int min)
   {      
      int lazyVar = max;
      
      for(int i = 0; i <= max - min ; i++)
      {
         for(int j = 0; j <= max - min ; j++)
         {
            System.out.print(lazyVar);
            lazyVar--;
            if (lazyVar < 4) lazyVar = 8;
         }
         lazyVar--;
         System.out.println();
      }
      System.out.println();
   }

   public static void main(String[] args)
   {
      printDecrSquare(8,4);
   }
}