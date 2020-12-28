package com.company;

public class User {
    private String firstName;
    private String lastName;
    private String grade;


   public String getFirstName(){
        return firstName.toUpperCase();
   }

   public void setFirstName(String fn){
        firstName = fn;
   }

   public String getLastName(){
        return lastName.toUpperCase();
   }

   public void setLastName(String gg){
        lastName = gg;
   }

   public String getGrade(){
        return grade;
   }

   public void setGrade(String ff){
        grade = ff;
   }


   public String getFullName(){
        return getFirstName() + " " + getLastName() + " " + getGrade();
   }

}
