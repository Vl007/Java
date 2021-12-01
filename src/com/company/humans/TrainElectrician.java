package com.company.humans;

public class TrainElectrician extends Human {

    @Override
    public void transportation(Object cargo, String destination) {
        System.out.println("Я поездной электромеханик, отвечаю за контроль по эксплуатации вагонного оборудования и оказание необходимой технической помощи.");
    }

    @Override
    public void ticketVerification(int ticket) {

    }

    @Override
    public void go(String destination) {
        System.out.println("Едем в " + destination);
    }
}
