package com.company.types_of_trains;

public class Passenger extends Train {

    private static final int LIMIT_CARGO_FOR_ONE_TRANSPORTATION = 3;
    private static final int LIMIT_CARGO = 1;

    public Passenger() {
        super(LIMIT_CARGO, LIMIT_CARGO_FOR_ONE_TRANSPORTATION);
    }
}
