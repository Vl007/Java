package com.company.types_of_trains;

public class Sanitary extends Train {

    private static final int LIMIT_CARGO_FOR_ONE_TRANSPORTATION = 1;
    private static final int LIMIT_CARGO = 1;

    public Sanitary() {
        super(LIMIT_CARGO, LIMIT_CARGO_FOR_ONE_TRANSPORTATION);
    }
}