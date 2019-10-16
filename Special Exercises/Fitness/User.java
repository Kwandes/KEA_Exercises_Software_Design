// Fitness Exercise, user setup
// Jan Bogoryja-Zakrzewski, Dat19i

public class User{

   String userType;     // Admin, Instructor, Full, Basic
   String cpr;
   String name;
   
   // Member only
   final int BASIC_COST = 199;
   final int FULL_COST = 299;
   
   int monthlyPayment;
   
   // Employee Only
   final int ADMIN_HOURLY_WAGE = 23000 / (37 * 4);
   final int INSTRUCTOR_HOURLY_WAGE = 199;
   
   int hourlyWage;      
   int vacationDays;
   
   public User(String id, String type, String name)
   {
      setUserType(type);
      setCPR(id);
      setName(name);
      
      switch(type)
      {
         case "admin":
            setWage(ADMIN_HOURLY_WAGE);
            setVacation(5);
            break;
         case "instructor":
            setWage(INSTRUCTOR_HOURLY_WAGE);   
            setVacation(0);
            break;
         case "basic":
            setPayment(BASIC_COST);
            break;
         case "full":
            setPayment(FULL_COST);
            break;
      }
   }
   
   public User()
   {
      setUserType("basic");
      setPayment(BASIC_COST);
      setCPR("CPR69420");
   }
   
   public String toString()
   {
      String buffer = "";
      int maxNameLength = 15;
      int nameLength = this.name.length();
      for (int i = 0; i < (maxNameLength-nameLength); i++)
      {  buffer += " "; };
      return getName() + buffer + " | " + getCPR() + " | Type: " + getUserType().toUpperCase();
   }
   
   public String toStringFileFormat()
   {
      String cpr = getCPR();
      String userID = getUserType().toUpperCase().charAt(0) + "" + getName().charAt(0) + "" +  cpr.charAt(3) + "" + cpr.charAt(5) + "" + cpr.charAt(7);
      return userID + " " + getCPR() + " " + getUserType() + " " + getName() + "\n";
   }
   
   
   
   //REGION - setters & getters
   //-------------------------------------------------------------
   public void setCPR(String id)
   {  this.cpr = id;    }
   public String getCPR()
   {  return this.cpr;  }
   
   public void setName(String name)
   {  this.name = name; }
   public String getName()
   {  return this.name; }
   
   public void setUserType(String type)
   {  this.userType = type;   }
   public String getUserType()
   {  return this.userType;   }
   
   public void setPayment(int cost)
   {  this.monthlyPayment = cost;   }
   public int getPayment()
   {  return this.monthlyPayment;   }
   
   public void setWage(int wage)
   {  this.hourlyWage = wage;   }
   public int getWage()
   {  return this.hourlyWage;   }
   
   public void setVacation(int days)
   {  this.vacationDays = days;  }
   public int getvacation()
   {  return this.vacationDays;  }
   //-------------------------------------------------------------
   
   
   
}
