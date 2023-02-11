package org.example;
import java.util.List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List people = new ArrayList<Human>();
        Human grand1 = new Human.EmployeeBuilder("Александр").setYear(1965).setSex("М").build();
        Human grand2 = new Human.EmployeeBuilder("Галина").setYear(1960).build();
        Human parent1 = new Human.EmployeeBuilder("Александр").setYear(1965).setSex("М").setFaather(grand1).setmather(grand2).build();
        people.add(grand1);
        people.add(grand2);
        people.add(parent1);
        System.out.println("У человека:" + parent1);
        System.out.println("Родители: " + parent1.getParents());
    }

}