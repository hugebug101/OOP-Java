package org.example;

//Nik Danish Rifqi Bin Nik Reduan 2215205
//Muhammad Anas Daniel Bin Mohd Satria 2217581

public class Animal {
    protected String name;

    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Dog dog = new Dog("Ellie");
        Cat cat = new Cat("Tabby");

        animal.eat();
        dog.eat();
        cat.eat();

        animal.sound();
        dog.sound();
        cat.sound();
        System.out.println();

        Animal animal2 = new Dog("Ella");
        animal2.sound();
        if (animal2 instanceof Dog) {
            Dog dog2 = (Dog) animal2;
            dog2.sound();
        }




    }




    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sound() {
        System.out.println(name + " is making a sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);

    }

    @Override
    public void eat() {
        System.out.println(name + " is eating Dog food");
    }

    @Override
    public void sound() {
        System.out.println(name + " is barking");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " is meowing");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating Cat food");
    }
}