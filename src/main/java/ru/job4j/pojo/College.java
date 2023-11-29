package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Jan Zin Yu");
        student.setGroup("47");
        student.setStart(new Date());

        System.out.println(student.getFio() + ": "
                + student.getGroup() + ", "
                + student.getStart());
    }
}
