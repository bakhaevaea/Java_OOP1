package org.example;
import java.util.List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List people = new ArrayList<Human>();
        Human grand1 = new Human("Александр", "М", 1965, null, null);
        Human grand2 = new Human("Гилина", "Ж", 1960, null, null);
        Human grand3 = new Human("Валерий", "М", 1958, null, null);
        Human grand4 = new Human("Гилина", "Ж", 1962, null, null);
        people.add(grand1);
        people.add(grand2);
        people.add(grand3);
        people.add(grand4);

        Human parent1 = new Human("Александр", "М", 1987, grand1, grand2);
        Human parent2 = new Human("Екатерина", "Ж", 1988, grand3, grand4);
        people.add(parent1);
        people.add(parent2);

        Human child1 = new Human("Павел", "М", 2018, parent1, parent2);
        Human child2 = new Human("Дарья", "Ж", 2013, parent1, parent2);
        people.add(child1);
        people.add(child2);

        System.out.println("У человека:" + parent1);
        System.out.println("Родители: " + parent1.getParents());
        System.out.println("Дети: " + parent1.getChilds(people));
        System.out.println("");
        System.out.println("бабушка/ дедушка человека: " + child1);
        System.out.println(child1.getGrands());
        System.out.println("Его братья/сестры: " + child1.getBrothersSisters(people));
    }
}