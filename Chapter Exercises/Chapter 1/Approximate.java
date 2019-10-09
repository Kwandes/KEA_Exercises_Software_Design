// Exercise 5
// creator: Jan Bogoryja-Zakrzewski
// I got bored of simple prints

import java.lang.Math;     //for the Pow() method

public class Approximate{
  
   public static void main(String[] args)
   {   
      System.out.println("Most of the people think that"
      + "'kilo' in 'kilobytes' means 1000" + "\n"
      + "as in the metric system." + "\n"
      + "But the fact is that" + "\n"
      + "2^10 is \"approximately equal\" to 1000 bytes" + "\n"
      + "It actually equals " + Math.round(Math.pow(2,10)) + " bytes !");  //using round because pow() returns a double
   }
}