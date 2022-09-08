package ru.job4j.oop;

public class Airplane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " мчит в небеса!");

    }

    @Override
    public void repair() {
        System.out.println(getClass().getSimpleName() + " ломается редко, регламент есть регламент.");

    }
}
