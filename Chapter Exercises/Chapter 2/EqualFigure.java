// Chapter 2, Exercise 20
// Jan Bogoryja-Zakrzewski, Dat19i
// So I wrote this, then overwrote it by accident with EqualFigures2 and THEN I overwrote it with Foo5...
// I hate JGrasp

public class EqualFigure{

   final static int HEIGHT = 5;

   public static void main(String[] args)
   {  
      // I got lazy, was gonna use it like in the previous Exercise but it borked hard so I did these vars
      int plusCounter = (HEIGHT-1) * 8;
      int arrowCounter = 0;
      
      for (int i = HEIGHT-1; i >= 0; i--)
      {
         for( int j = arrowCounter; j > 0 ; j--)
         {
               System.out.print("<");
         }
         for( int j = plusCounter; j > 0 ; j--)
         {
            System.out.print("=");
         }
         for( int j = arrowCounter; j > 0 ; j--)
         {
               System.out.print(">");
         }
         
         plusCounter -= 8;
         arrowCounter += 4;
         System.out.println();
      }
   }
}