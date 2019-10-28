// Fitness Exercise, main Activity
// Jan Bogoryja-Zakrzewski, Dat19i

import java.util.ArrayList;

public class FitnessMain {

   public static void main(String[] args)
   {
      // a set of tests of all backend features. Creates multiple files.
      UnitTesting unit = new UnitTesting();
      unit.runUnitTests(true);
      
      Interface menu  = new Interface("Fitness Club");
      //menu.display();
      
   }
   
}