package ru.geekbrains.alekseiterentev;

public class Cat {

    private String name;
    private int eatToBeSatiety;
    private boolean satiety;

    public Cat(String name, int eatToBeSatiety) {
        this.name = name;
        this.eatToBeSatiety = eatToBeSatiety;
        this.satiety = false;
    }

    public void eatFromPlate(Plate plate) {
        if (plate.getFoodValue() < eatToBeSatiety) {
            return;
        }
        plate.reduceFood(eatToBeSatiety);
        satiety = true;
    }

    public void printSatiety() {
        if (satiety) {
            System.out.println(name + " сыт");
        } else {
            System.out.println(name + " голоден");
        }
    }
}
