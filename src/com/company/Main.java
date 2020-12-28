package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    String[] firstName = {"Ion", "Caleb", "Tom","Jack", "Nick","Rodrygo","Matheus"};
    String[] lastName = {"Pinzari", "Curry", "Ford","Jobs","Mane","Goes","Demiral"};
    String[] grade ={"8", "10", "5", "7","9","10","7.5"};
    List<User> users = new ArrayList<User>();

     for(int i = 0;i < firstName.length; i++){
         User u = new User();
         u.setFirstName(firstName[i]);
         u.setLastName(lastName[i]);
         u.setGrade(grade[i]);
         users.add(u);
     }
        System.out.println("***List***");
     for(User u : users)
     {
         System.out.println(u.getFullName());
     }

    }
}
