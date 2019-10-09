// Chapter 4, Exercise 7
// Jan Bogoryja-Zakrzewski, Dat19i

public class XO{

   public static void xo(int size)
   {
      for(int i  = 1; i <= size; i++)
      {
         for(int j = 1; j <= size; j ++)
         {  
            if (j == i || j == size-i+1) System.out.print("x");
            else System.out.print("o");
         }
         System.out.println();
      }
   
   
   }
   
   public static void main(String[] args)
   {
      xo(5);
      System.out.println("---------------------");
      xo(6);
   }
}