package ru.job4j.oop;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Чух - чух");

    }

    @Override
    public void repair() {
        System.out.println(getClass().getSimpleName() + " стоит в депо да капает солярой");

    }
}
