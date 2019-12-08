// Read From File exercise
// Jan Bogoryja-Zakrzewski, Dat19i
// Done on 08/12/2019 (DD/MM/YYYY) because it was too easy to bother with earlier

import java.io.File;
import java.util.Scanner;

public class ReadStudiesporovenOpinionen{
   
   private static File file;
   private static Scanner stupidScanner;
   private static final String FILE_NAME = "faisal.txt";
   
   public static void main(String[] args)
   {
      file = new File(FILE_NAME);
      try
      {
         stupidScanner = new Scanner(file);
      } catch (Exception e) {}
      
      System.out.println("First Exercise\n-----------------------");
      while(stupidScanner.hasNextLine())
      {
         System.out.println(stupidScanner.nextLine().toUpperCase());
      }
      
      
      System.out.println("Second Exercise\n-----------------------");
      int counter = 0;
      
      try
      {
         stupidScanner = new Scanner(file);
      } catch (Exception e) {}
      
      while(stupidScanner.hasNext())
      {
         if(stupidScanner.next().toLowerCase().equals("the")) counter++;
      }
      System.out.println("There are " + counter + " \"the\"'s in " + FILE_NAME);
      
      
      System.out.println("Third Exercise\n-----------------------");
      Scanner console = new Scanner(System.in);
      System.out.println("Try to guess a file");
      boolean correctAnswer = false;
      
      // Guessing input loop
      while(!correctAnswer)
      {
         file = new File(console.nextLine());
         if(file.exists())
         {
            System.out.println("Lucky, you guessed it");
            correctAnswer = true;
         }
         else
         {
            System.out.println("Wrong. Try again. Hint: it begins with \"Fai\" and ends with \"l.txt\"");
         }
      }
   }   
}