// Chapter 2, Exercise 14
// Jan Bogoryja-Zakrzewski, Dat19i
// magic numbers ftw

public class Foo14{

   public static void main(String[] args)
   {  
      for (int i = 0; i < 5; i++)
      {
         for( int j = 1; j <= 9 ; j += 2)
         {
            for(int k = 0; k < j ; k++)
            {
               System.out.print(j);
            }
         }
         System.out.println();
      }
   }
}