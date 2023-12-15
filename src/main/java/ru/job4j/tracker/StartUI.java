package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item data = new Item();
        LocalDateTime d = data.getCreated();
        System.out.println("Текущие дата и время: " + d);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = d.format(formatter);
        System.out.println("Дата и время после форматирования: " + currentDateTimeFormat);
    }
}
