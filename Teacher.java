package org.example;

public class Teacher {
    private String name;
    private String course;
    private int age;

    public Teacher(String name, String course, int age) {
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }
}
