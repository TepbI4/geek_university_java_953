package ru.geekbrains.terentev;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");

        cat.run(300);
        cat.run(150);

        Dog dog = new Dog("Rex");
        dog.run(600);
        dog.swim(9);
        dog.run(400);

        System.out.println(Cat.getCountCats());
        System.out.println(Dog.getCountDogs());
        System.out.println(Animal.getCountAnimals());
    }
}
