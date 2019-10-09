// Chapter 5, Exercise 1
// Jan Bogoryja-Zakrzewski, Dat19i

public class ShowTrees{

   public static void showTrees(int n)
   {
      System.out.print( n + " = ");
      int divider = 3;
      
      if ( n % 3 != 0) System.out.print(n);  // Is the number even dividable by 3?
      else
      {
         while( divider != 1)
         {
            if ( n % divider == 0)
            {
               n /= divider;
               System.out.print(divider + " * ");
            }
            else divider--;
            if (divider == 1) System.out.print(divider);
         }
      }
      System.out.println();
   }   

   public static void main(String[] args)
   {
      showTrees(6);
      showTrees(18);
      showTrees(27);
      showTrees(68);   
   }
}