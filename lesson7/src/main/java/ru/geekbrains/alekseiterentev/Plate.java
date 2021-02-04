package ru.geekbrains.alekseiterentev;

public class Plate {

    private int foodValue;

    public int getFoodValue() {
        return foodValue;
    }

    void addFood(int value) {
        foodValue += value;
    }

    void reduceFood(int value) {
        foodValue -= value;
    }
}
