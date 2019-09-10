// Chapter 2, Exercise 1
// Jan Bogoryja-Zakrzewski, Dat19i

public class Acceleration{
   
   public static double calcAcceleration(double velocity, double radius)
   {
      return (velocity*velocity)/radius;
   }

   public static void main(String[] args)
   {
      double velocity = 10.0;
      double radius = 3.0;
      System.out.println("Acceleration: " + calcAcceleration(velocity, radius));
   }
}