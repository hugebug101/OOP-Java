package org.example;

public class Person {

    private String name;
    private int age;

    private static int numPersons = 0;

    public Person() {

        name = null;
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numPersons++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNumPersons() {
        return numPersons;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
    //static independent of object
}
