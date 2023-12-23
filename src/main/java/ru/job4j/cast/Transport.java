package ru.job4j.cast;

public class Transport {
    public static void main(String[] args) {
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle train = new Train();
        Vehicle subway = new Train();
        Vehicle plane = new Plane();
        Vehicle boing = new Plane();

        Vehicle[] transport = new Vehicle[]{bus1, bus2, train, subway, plane, boing};
        for (Vehicle object : transport) {
            object.move();
        }
    }
}
