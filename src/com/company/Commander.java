package com.company;

public class Commander extends People{
    private String whoIsTheGeneral;
    public Commander(int age, String name, String whoIsTheGeneral) {
        super(age, name);
        this.whoIsTheGeneral = whoIsTheGeneral;
    }

    public String getWhoIsTheGeneral() {
        return whoIsTheGeneral;
    }

    @Override
    public String  Report() {
        return whoIsTheGeneral;
    }
}
