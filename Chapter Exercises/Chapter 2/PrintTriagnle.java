// Chapter 2, Exercise 15
// Jan Bogoryja-Zakrzewski, Dat19i
// magic numbers ftw

public class PrintTriagnle{

   public static void main(String[] args)
   {  
      for (int i = 5; i > 0; i--)
      {
         for( int j = 0; j < i ; j++)
         {
               System.out.print("-");
         }
         for( int j = 1; j <= 11 - 2 * i ; j++)
         {
            System.out.print(j);
         }
         for( int j = 0; j < i ; j++)
         {
               System.out.print("-");
         }
         System.out.println();
      }
   }
}