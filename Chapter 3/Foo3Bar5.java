// Chapter 3, Exercise 5
// Jan Bogoryja-Zakrzewski, Dat 19i

public class Foo3Bar5{

   public static void printReverseGrid(int rows, int columns)
   {
      int total = rows * columns;
      
      for (int i = 0; i < rows; i++)
      {
         for (int j = 0; j < columns; j++)
         {
            if ( total >=10)  System.out.print(total-- + " ");
            else System.out.print(total-- + "  ");
         }
         System.out.println();      
      }   
   }


   

   
   public static void main(String[] args)
   {
      printReverseGrid(4, 3);
   }
}