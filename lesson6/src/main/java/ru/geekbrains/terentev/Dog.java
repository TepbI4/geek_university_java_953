package ru.geekbrains.terentev;

public class Dog extends Animal {

    private static final Integer RUN_LIMIT = 500;
    private static final Integer SWIM_LIMIT = 10;

    private static Integer countDogs = 0;

    public Dog(String name) {
        super(name);
        countDogs++;
    }

    public static Integer getCountDogs() {
        return countDogs;
    }

    @Override
    public void run(Integer distance) {
        Integer ranDistance = distance > RUN_LIMIT ? RUN_LIMIT : distance;
        System.out.println(getName() + " ran " + ranDistance);
    }

    public void swim(Integer distance) {
        Integer swamDistance = distance > SWIM_LIMIT ? SWIM_LIMIT : distance;
        System.out.println(getName() + " swam " + swamDistance);
    }
}
