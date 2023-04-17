package org.example;

import java.util.Scanner;

public class OOPConcepts {

    static Scanner input = new Scanner(System.in);

    static Person[] persons;

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Adam", 69);
        Person person3 = new Person("John", 21);
        Person person4 = new Person("Yamuna", 20);

        persons = new Person[]{person1, person2, person3, person4};

        person2=person3;

        for (Person person : persons) {
            System.out.println(person.toString());
        }

        sortAge();

        System.out.println("\nAfter sorting\n");

        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    public static void modifyPerson(Person person, String name, int age) {
        person.setName(name);
        person.setAge(age);
    }

    public static void sortAge() {
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1; j++) {
                if (persons[j].getAge() > persons[j + 1].getAge()) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
}

