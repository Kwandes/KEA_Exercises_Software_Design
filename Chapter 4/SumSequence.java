// Chapter 4, Exercise 1
// Jan Bogoryja-Zakrzewski, Dat19i
// The description of the exercise sucks. I will simply printout N numbers from the sequence


public class SumSequence{

   public static int sumSequence(int n)
   {
      int result  = 0;
      
      for( int i = 1 ; i <= n ; i++)
      {
         System.out.print(" 1   ");
      }
      System.out.println();
      
      for( int i = 1 ; i <= n ; i++)
      {
         System.out.print("---- ");
      }
      System.out.println();
      
      for( int i = 1 ; i <= n ; i++)
      {
         int seq  = i * (i+2);
         result += seq;
         
         // Checking the size and adjusting the positioning
         if (seq < 10)
         System.out.print(" " + seq + "   ");
         else if (seq < 100) System.out.print(" " + seq + "  ");
         else if (seq < 1000) System.out.print(seq + "  ");
         else System.out.print(seq + " ");
      }
      System.out.println();
      System.out.println();
      
      return result;
   }


   public static void main(String[] args)
   {
      int seqLength = 5;
      System.out.println("Sum of the first " + seqLength + " number in the sequence is " + sumSequence(seqLength));
      // if the exercise wants me to sum up all the 1/n ... nah. 
   }
}
