package com.company.types_of_trains;

public class Cargo extends Train {

    private static final int LIMIT_CARGO_FOR_ONE_TRANSPORTATION = 7;
    private static final int LIMIT_CARGO = 5;

    public Cargo() {
        super(LIMIT_CARGO, LIMIT_CARGO_FOR_ONE_TRANSPORTATION);
    }
}
