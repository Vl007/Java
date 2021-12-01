package com.company.humans;

import com.company.interfaces.Traveller;

public class Passengers extends Human implements Traveller {

    @Override
    public void transportation(Object cargo, String destination) {
        System.out.println("Я пассажир грузы ни какие не перевожу и не занимаюсь этим!");
    }

    @Override
    public void ticketVerification(int ticket) {

    }

    @Override
    public void go(String destination) {
        System.out.println(
                spendTicket(1) ?
                        "Едем в " + ANSI_BLUE + destination + ANSI_RESET + " и у нас осталось еще " + ANSI_BLUE + countTicket + getTicketAddition(countTicket) + ANSI_RESET : ANSI_RED + "Надо купить билет на поезд!\n" + ANSI_RESET);
    }

    public String getTicketAddition(int num) {
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1) {
            return " билетов!\n";
        }
        switch (num % 10) {
            case 1:
                return " билет!\n";
            case 2:
            case 3:
            case 4:
                return " билета!\n";
            default:
                return " билетов!\n";
        }
    }

    @Override
    public void travel(String destination) {
        System.out.println("Я еду на шикарном поезде в " + destination);
    }
}
