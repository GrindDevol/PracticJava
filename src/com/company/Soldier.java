package com.company;

public class Soldier extends People{
    private String whoIsTheCommander;
    public Soldier(int age, String name, String whoIsTheCommander) {
        super(age, name);
        this.whoIsTheCommander = whoIsTheCommander;
    }

    public String getWhoIsTheCommander() {
        return whoIsTheCommander;
    }

    @Override
    public void fitForMilitaryService() {
        if (age<21)
            System.out.println("Не годен");
        else
            System.out.println("Годен");
    }
    @Override
    public String  Report() {
    return whoIsTheCommander;
    }
}
