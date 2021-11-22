package com.company.types_of_trains;

public class Military extends Train {

    private static final int LIMIT_CARGO_FOR_ONE_TRANSPORTATION = 5;
    private static final int LIMIT_CARGO = 3;

    public Military() {
        super(LIMIT_CARGO, LIMIT_CARGO_FOR_ONE_TRANSPORTATION);
    }
}
