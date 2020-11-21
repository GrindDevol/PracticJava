package com.company;

public class People implements AcceptableToCombat {
protected int age;
protected String name;
    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void fitForMilitaryService() {
        if (age<21)
            System.out.println("Не годен");
        else
            System.out.println("Годен");
    }

    @Override
    public String Report() {
    return name;
    }
}
