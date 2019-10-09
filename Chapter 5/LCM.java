// Chapter 5, Exercise 2
// Jan Bogoryja-Zakrzewski, Dat19i

public class LCM{

   public static void lcm(int int1, int int2)
   {
      int lcm = 2;
      
      while( (int1 % lcm != 0) || (int2 % lcm != 0))
      {
         if( lcm == int1 ) break;
         lcm++;
      }
      if( (lcm == int1 || lcm == int2) && (int1 != int2)) System.out.println( int1 + " and " + int2 + " have no common lcm");
      else System.out.println("LCM  of " + int1 + " and " + int2 + " is " + lcm);
   
   }

   public static void main(String[] args)
   {
      lcm(3, 3);
      lcm(15, 50);
      lcm(33, 99);
      lcm(109, 5624);
      lcm(61359, 47573);
   }
}