package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Чих-пых, едем...");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Пассажиры в автобусе. ");

    }

    @Override
    public int refuel(int litres) {
        return 0;
    }
}
