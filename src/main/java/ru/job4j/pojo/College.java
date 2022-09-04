package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setDate(new Date());
        student.setGroup("15");
        student.setName("Vasya Sosisochkin");

        System.out.println(student.getName() + " учится в " + student.getGroup() + " группе с " + student.getDate());
    }
}
