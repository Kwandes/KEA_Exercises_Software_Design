// Chapter 2, Exercise 16
// Jan Bogoryja-Zakrzewski, Dat19i
// magic numbers ftw

public class PlusHash{

   public static void main(String[] args)
   {  
      for (int i = 1; i < 12; i+=2)
      {
         for( int j = 10-i; j > 0 ; j-=2)
         {
               System.out.print("<<");
         }
         for( int j = 2*i; j > 0 ; j--)
         {
            System.out.print("+");
         }
         for( int j = 10-i; j > 0 ; j-=2)
         {
               System.out.print(">>");
         }
         System.out.println();
      }
   }
}