// Fitness Exercise, member setup
// Jan Bogoryja-Zakrzewski, Dat19i

public class Member{

   final int BASIC_COST = 199;
   final int FULL_COST = 299;
   
   String membershipType;
   String cpr;
   String name;
   int monthlyPayment;
   boolean payed;
   
   public Member(String type, String id, String paymentStatus, String name)
   {
      if (type.equals("basic"))
      {
         setUserType("basic");
         setPayment(BASIC_COST);
      }
      else
      {
         setUserType("full");
         setPayment(FULL_COST);
      }
      
      if (paymentStatus.equals("true")) setStatus(true);
      else setStatus(false);
      
      setName(name);
      setCPR(id);  
   }
   
   public Member()
   {
      setUserType("basic");
      setPayment(BASIC_COST);
      setStatus(false);
      setCPR("69420");
   }
   
   public String toString()
   {
      String buffer = "";
      int maxNameLength = 15;
      int nameLength = this.name.length();
      for (int i = 0; i < (maxNameLength-nameLength); i++)
      {  buffer += " "; };
      return this.name + buffer + " | " + this.cpr + " | Membership: " + this.membershipType.toUpperCase();
   }
   
   //REGION - setters & getters
   //-------------------------------------------------------------
   public void setUserType(String type)
   {  this.membershipType = type;   }
   public String getUserType()
   {  return this.membershipType;   }
   
   public void setPayment(int cost)
   {  this.monthlyPayment = cost;   }
   public int getPayment()
   {  return this.monthlyPayment;   }
   
   public void setCPR(String id)
   {  this.cpr = id;    }
   public String getCPR()
   {  return this.cpr;  }
   
   public void setName(String name)
   {  this.name = name; }
   public String getName()
   {  return this.name; }
   
   public void setStatus(boolean status)
   {  this.payed = status;  }
   public boolean getStatus()
   {  return this.payed;  }
   
   //-------------------------------------------------------------
   
   
   
   
   
   




}
