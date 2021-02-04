package ru.geekbrains.terentev;

public class Cat extends Animal {

    private static final Integer RUN_LIMIT = 200;

    private static Integer countCats = 0;

    public Cat(String name) {
        super(name);
        countCats++;
    }

    public static Integer getCountCats() {
        return countCats;
    }

    @Override
    public void run(Integer distance) {
        Integer ranDistance = distance > RUN_LIMIT ? RUN_LIMIT : distance;
        System.out.println(getName() + " ran " + ranDistance);
    }
}
