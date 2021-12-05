package com.company;

public class TransportationFormatException extends RuntimeException {

    public TransportationFormatException( String wrongInput) {
        super("Вам нужно указать место доставки, куда груз будет доставлен, а у вас: " + wrongInput);
    }

}
