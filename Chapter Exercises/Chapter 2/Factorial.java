// Chapter 2, Exercise 3
// Jan Bogoryja-Zakrzewski, Dat19i

public class Factorial{

   // recursive method for factorial calculation
   public static int factorial(int n)
   {
      if ( n == 0) return 1;
      else return factorial(n-1)*n;
   }

   public static void main(String[] args)
   {
      // Is this the loop I was supposed to use ? /s
      for(int i = 1; i<=7; i++)
      {
      System.out.println("!" + i + " = " + factorial(i));
      }
   }
}