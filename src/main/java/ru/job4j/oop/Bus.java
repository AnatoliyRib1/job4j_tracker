package ru.job4j.oop;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ползет по городским пробкам...");

    }

    @Override
    public void repair() {
        System.out.println(getClass().getSimpleName() + " до сих пор с мотором от КРАЗа, без ремонта никуда");

    }
}
