package com.company.humans;

public class Machinist extends Human {

    @Override
    public void transportation(Object cargo, String destination) {
        System.out.println("Я управляю поездов, такими вещами не занимаюсь. Обратитесь к проводнику!");
    }

    @Override
    public void ticketVerification(int ticket) {

    }

    @Override
    public void go(String destination) {
        System.out.println("Едем в " + destination);
    }
}
