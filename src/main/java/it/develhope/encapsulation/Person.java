package it.develhope.encapsulation;

public class Person {
    private String name;
    private String surname;
    private double height;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Height: " + String.format("%.2f", getHeight()));
        System.out.println("Age: " + getAge());
    }
}