package edu.clemson.cpsc871;

/* Javadoc comment goes here describing succinctly what the class
   does/represents.
   Consult this for some ref material on writing proper Javadocs:
   https://www.oracle.com/technetwork/java/javase/documentation/index-137868.html
*/
public class Person {

    enum GenderType {
        MALE, FEMALE, OTHER
    }

    private final GenderType g;

    private final String name;
    private int age;

    public static Person createMalePerson(String name, int age) {
        return new Person(name, age, GenderType.MALE);
    }

    public static Person createFemalePerson(String name, int age) {
        return new Person(name, age, GenderType.FEMALE);
    }

    public Person(String name, int age, GenderType gen) {
        this.name = name;
        this.age = age;
        this.g = gen;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person withUpdatedAge(int a) {
        return new Person(name, a, g);
    }

    public GenderType getGender() {
        return g;
    }

    @Override
    public String toString() {
        return "here's " + name + " age: " + age;
    }
}
