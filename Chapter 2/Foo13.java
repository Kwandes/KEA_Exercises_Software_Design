// Chapter 2, Exercise 13
// Jan Bogoryja-Zakrzewski, Dat19i
// magic numbers ftw

public class Foo13{

   public static void main(String[] args)
   {  
      for (int i = 0; i < 5; i++)
      {
         for( int j = 0; j < 9 ; j += 2)
         {
            for(int k = 0; k < 10 ; k++)
            {
               System.out.print(j);
            }
         }
         System.out.println();
      }
   }
}