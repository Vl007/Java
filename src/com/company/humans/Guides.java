package com.company.humans;

import com.company.interfaces.Transferer;

public class Guides extends Human implements Transferer {

    @Override
    public void transportation(Object cargo, String destination) {
        System.out.println(
                spendTicket(1) ?
                        String.format("Перевожу багаж %s в %s\n",  cargo, destination)
                        : "Нет билета!\n");
    }

    @Override
    public void ticketVerification(int ticket) {

    }

    @Override
    public void go(String destination) {
        System.out.println("Едем в " + destination);
    }

    @Override
    public void transfer(Object cargo, String destination) {
        System.out.println("Перевожу " + cargo + " в " + destination);
    }
}
