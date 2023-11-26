package ru.job4j.oop;

public class Max {
    public static int max(int one, int two) {
        return one > two ? one : two;
    }

    public static int max(int one, int two, int three) {
        return max(one, max(two, three));
    }

    public static int max(int one, int two, int three, int four) {
        return max(one, max(two, max(three, four)));
    }
}
