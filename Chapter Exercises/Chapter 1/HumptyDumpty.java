// Exercise 16
// creator: Jan Bogoryja-Zakrzewski
// each command is in a seperate line
// ignoring comments and brackets, the code is 9 lines long
// 5 statements, 2 methods (humptyDumpty and main), 1 class

public class HumptyDumpty{

   static int timer = 0;
   
   public static void humptyDumpty()
   {
      System.out.println("Humpty Dumpty had a great fall");
      timer++;
      if(timer != 60) humptyDumpty();
   }

   public static void main(String[] args)
   {
   humptyDumpty();
   }
}