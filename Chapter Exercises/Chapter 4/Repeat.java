// Chapter 4, Exercise 2
// Jan Bogoryja-Zakrzewski, Dat19i

public class Repeat{

   final static String STRING = "FaisalIsTheGreatest\n"; //the output will be one Faisal per line. ha gotcha. Remove `\n` to get normal output

   public static String repeat(String string)
   {
      String ogString = string;
      for (int i = 0; i < ogString.length(); i++)
      {
         string += ogString;
      }
      
      return string;      
   }

   public static void main(String[] args)
   {
      System.out.print(repeat(STRING));
   
   }
}