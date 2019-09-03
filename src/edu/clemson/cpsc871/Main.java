package edu.clemson.cpsc871;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // a simple main program
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(Person.createMalePerson("Tom", 83));
        persons.add(Person.createMalePerson("Jerry", 86));
        persons.add(Person.createFemalePerson("Grace", 86));

        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
