// Chapter 2, Exercise 17
// Jan Bogoryja-Zakrzewski, Dat19i
// no more magic numbers...jk there is one less magic number now.

public class PlusHash2{

   final static int HEIGHT = 8;

   public static void main(String[] args)
   {  
      // I got lazy, was gonna use it like in the previous Exercise but it borked hard so I did these vars
      int plusCounter = 2;
      int arrowCounter = HEIGHT*2-2;
      
      for (int i = HEIGHT; i > 0; i--)
      {
         for( int j = arrowCounter; j > 0 ; j--)
         {
               System.out.print("<");
         }
         for( int j = plusCounter; j > 0 ; j--)
         {
            System.out.print("+");
         }
         for( int j = arrowCounter; j > 0 ; j--)
         {
               System.out.print(">");
         }
         
         plusCounter += 4;
         arrowCounter -= 2;
         System.out.println();
      }
   }
}