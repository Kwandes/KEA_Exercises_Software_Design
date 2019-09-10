// Exercise 8
// creator: Jan Bogoryja-Zakrzewski

public class Introduction1{

   // Introducaiton printing
   static void printIntro()
   {
      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
      System.out.println("!!   Introduction to Java Programming   !!");
      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");  
   }
   
   // Overloaded Intro method to allow the user to specify how many times to print the Intro text
   static void printIntro(int howManyTimes)
   {
   
      // parameter checking
      if ( howManyTimes < 1) return;
      else if (howManyTimes > 42)
      {
         howManyTimes = 42;
         System.out.println("That is too much for poor Jgrasp, chill. Limited you to 42 prints");
      }
      
      // Actual function
      for(int i = 0; i < howManyTimes ; i++)
      {
         System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
         System.out.println("!!   Introduction to Java Programming   !!");
      }
      
      // Finishing line
      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");   
   }

   public static void main(String[] args)
   {
      printIntro(5);
   }
}