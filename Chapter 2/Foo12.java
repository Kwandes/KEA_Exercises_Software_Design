// Chapter 2, Exercise 12
// Jan Bogoryja-Zakrzewski, Dat19i

public class Foo12{

   public static void main(String[] args)
   {  
      for (int i = 0; i < 3; i++)
      {
         for( int j = 9; j > 0 ; j -= 2)
         {
            for(int k = 0; k < 6 ; k++)
            {
               System.out.print(j);
            }
         }
         System.out.println();
      }
   }
}