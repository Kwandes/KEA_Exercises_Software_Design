// Chapter 2, Exercise 5
// Jan Bogoryja-Zakrzewski, Dat19i
// Jumping back because that is the easiest one of of all I have left

public class Foo5{

   final static int HEIGHT = 5;

   public static void main(String[] args)
   {
      for(int i = 0; i < HEIGHT; i++)
      {
         for(int j = HEIGHT-i; i > 0; i--)
         {
            System.out.print(" ");
         }
         for(int j = i; i < HEIGHT; i++)
         {
            System.out.print("+");
         }
         System.out.println();
      }  
   }
}