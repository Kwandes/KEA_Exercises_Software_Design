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
   boolean payed;
   
   // Employee Only
   final int ADMIN_HOURLY_WAGE = 23000 / (37 * 4);
   final int INSTRUCTOR_HOURLY_WAGE = 199;
   
   int hourlyWage;      
   int vacationDays;
   
   
   public User(String type, String id, String paymentStatus, String name)
   {
      
      setUserType(type);
      
      if (type.equals("basic"))  setPayment(BASIC_COST);
      else  setPayment(FULL_COST);
      
      setCPR(id);
      
      if (paymentStatus.equals("true")) setStatus(true);
      else setStatus(false);
      
      setName(name);
   }
   
   public User(String type, String id, String name)
   {
      setUserType(type);
      
      if(userType.equals("admin"))
      {
         setWage(ADMIN_HOURLY_WAGE);
         setVacation(5);
      }
      else
      {
         setWage(INSTRUCTOR_HOURLY_WAGE);   
         setVacation(0);
      }
      
      setCPR(id);
      setName(name);
   }
   
   public User()
   {
      setUserType("basic");
      setPayment(BASIC_COST);
      setStatus(false);
      setCPR("CPR69420");
   }
   
   public String toString()
   {
      String buffer = "";
      int maxNameLength = 15;
      int nameLength = this.name.length();
      for (int i = 0; i < (maxNameLength-nameLength); i++)
      {  buffer += " "; };
      return this.name + buffer + " | " + this.cpr + " | Type: " + this.userType.toUpperCase();
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
   
   public void setStatus(boolean status)
   {  this.payed = status;  }
   public boolean getStatus()
   {  return this.payed;  }
   
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
