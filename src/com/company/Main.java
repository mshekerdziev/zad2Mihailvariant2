package com.company;

public class Main {

    public static void main(String[] args) {
        Fisch fish = new Fisch("Zlatna ribka");
        Snake snake = new Snake(3);
        AnimalHouse<Fisch> fishHouse = new AnimalHouse<>(fish);
        AnimalHouse<Snake> snakeHouse = new AnimalHouse<>(snake);
        System.out.println(fishHouse.animal.name);
        System.out.println(snakeHouse.animal.length);
    }
}
