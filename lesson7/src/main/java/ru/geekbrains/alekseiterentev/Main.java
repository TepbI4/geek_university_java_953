package ru.geekbrains.alekseiterentev;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate();
        plate.addFood(100);

        Cat[] cats = {new Cat("Барсик", 50),
                new Cat("Мурзик", 40),
                new Cat("Персик", 20)};

        for (int i = 0; i < cats.length; i++) {
            cats[i].eatFromPlate(plate);
            cats[i].printSatiety();
        }
    }
}
