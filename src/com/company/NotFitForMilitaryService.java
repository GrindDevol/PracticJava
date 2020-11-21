package com.company;

public class NotFitForMilitaryService extends Throwable{

    public NotFitForMilitaryService (String errorMassage) {
        super(errorMassage);
    }
}
