package ru.job4j.pojo;

public class Book {
    private String name;
    private int page;

    public Book(String name, int page) {
        this.name = name;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return page;
    }

    public void setCount(int count) {
        this.page = count;
    }
}
