// Fitness Exercise, User Interface setup
// Jan Bogoryja-Zakrzewski, Dat19i

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App{


   public static void main(String[] args)
   {
       SwingUtilities.invokeLater(new Runnable()
       {
         public void run()
         {
            new MainFrame("Suh", 600, 500);         
         }
      });
      System.out.println(">>>Frame created");
   }
}