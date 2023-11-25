package ru.job4j.oop;

public class Max {
    public static int max(int one, int two) {
        int result = one > two ? one : two;
        return result;
    }

    public static int max(int one, int two, int three) {
        return max(
                one,
                max(two, three));
    }

    public static int max(int one, int two, int three, int four) {
        return max(
                one,
                max(
                        two,
                        max(three, four)));
    }
}
