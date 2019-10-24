// Debugging class, containg logic regarding debugging
//  mainly console messages, for now

public class Debug {

   private boolean debugOrNot = true;
   
   public Debug(boolean state)
   {
      setDebug(state);
   }
   
   public void setDebug(boolean state)
   {
      this.debugOrNot = state;
   }
   
   public void log(String message)
   {
      if(debugOrNot) System.out.println(">>> LOG MESSAGE : " + message);
   }
}