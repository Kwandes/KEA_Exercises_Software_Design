// Chapter 2, Exercise 6
// Jan Bogoryja-Zakrzewski, Dat19i
// Filler, boring exercises

public class Foo6{
   
   final static int HARDCODED_VAR = 7; // How many numbers are suppsoed to display

   public static void main(String[] args)
   {
   
      for (int  i = HARDCODED_VAR; i >= 1; i-- )
      {
         for (int j = 0; j < i ; j++)
         {
            System.out.print(i);
         }
         System.out.println();
      }   
   }
}