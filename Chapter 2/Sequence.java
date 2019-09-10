// Chapter 2, Exercise 2
// jan Bogoryja-Zakrzewski, Dat19i

public class Sequence{
   
   final static int DECREMENT_BASE = 33;
   
   public static void main(String[] args)
   {
      int startValue = 289;
      
      for (int i = 0; i < 18; i+=2)    // Decrements by 2 because it is being used to affect the value printed
         {
            System.out.print(startValue + " ");
            startValue -= DECREMENT_BASE - i;
         }
   }
}