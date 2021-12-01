package com.company.humans;

public abstract class Human {

    int countTicket;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void go(String destination) {
        if (countTicket >= 1) {
            System.out.println("Едем на поезде в " + destination + "Еще есть " + countTicket);
        } else System.out.println(ANSI_RED + "Надо купить билет на поезд!" + ANSI_RESET);
    }

    public void byTickets(int ticket) {
        countTicket += ticket;
    }

    protected boolean spendTicket(int tickets) {
        int newCountTicket = countTicket - tickets;
        if (newCountTicket < 0) return false;
        countTicket = newCountTicket;
        return true;
    }

    public void transportation(Object cargo, String destination) {
        System.out.println(
                spendTicket(1) ?
                        String.format("Перевожу посылку %s в %s\n",  cargo, destination)
                        : "Нет билета!");
    }

    public abstract void ticketVerification(int ticket);


}