package ru.job4j.oop;

public class AllVehicle {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle airplane = new Airplane();

        Vehicle[] vehicles = new Vehicle[] {train, bus, airplane};
        for (Vehicle a : vehicles) {
            a.move();
            a.repair();

        }
    }
}
