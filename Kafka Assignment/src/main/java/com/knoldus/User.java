package com.knoldus;

public class User {
    private int id;
    private String name;
    private int age;
    private String course;

    public User() {
        this.id = 1;
        this.name = "Alka Vats";
        this.age = 23;
        this.course = "MCA";
    }

    public User(int id, String name, int age, String course) {
        this.id = id ;
        this.name = name;
        this.age = age;
        this.course= course;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCourse() {
        return this.course;
    }


}
