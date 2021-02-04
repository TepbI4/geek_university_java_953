package ru.geekbrains.terentev;

public abstract class Animal {

    private static Integer countAnimals = 0;

    private String name;

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    public String getName() {
        return name;
    }

    public static Integer getCountAnimals() {
        return countAnimals;
    }

    abstract public void run(Integer distance);
}
