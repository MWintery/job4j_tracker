package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int rsl = Calculator.sum(10);
        System.out.println(rsl);

        Calculator calculator = new Calculator();
        rsl = calculator.multiply(5);
        System.out.println(rsl);

        rsl = Calculator.minus(17);
        System.out.println(rsl);

        Calculator calculator1 = new Calculator();
        rsl = calculator1.divide(25);
        System.out.println(rsl);

        Calculator calculator2 = new Calculator();
        rsl = calculator2.sumAllOperation(50);
        System.out.println(rsl);
    }
}
