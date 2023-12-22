package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Let's go!");
    }

    @Override
    public void numPassengers(int passengers) {
        System.out.println("Number of passengers: " + passengers);
    }

    @Override
    public float refill(int gas) {
        float pay = 99.99F;
        return gas * pay;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.numPassengers(14);
        bus.refill(100);
    }
}
