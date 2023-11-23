package ru.job4j.checkstyle;

public class Broken {
    public static final String NEW_VALUE = "";
    private final int sizeOfEmpty = 10;
    public String surname;
    String name;

    void method(int a, int b, int c) { }

    void broken() { }

    void echo() { }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}
