// Chapter 4 Exercise 5
// Jan Bogoryja-Zakrzewski, Dat19i

public class Pow{
   
   public static int pow(int base, int exponent)
   {
      int result = base;
      for(int i = 1; i < exponent; i++)
      {
         result *= base;
      }
      return result;
   }
   
   public static void main(String[] args)
   {
      System.out.print(pow(0,4));
   }
}