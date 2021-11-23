package com.company;

import com.company.types_of_trains.*;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

      public static void main(String[] args) {

          Passenger Peregrine = new Passenger();
          Peregrine.addFraightWagon(1);
          Peregrine.transportation("10 почтовых мешков", "Санкт-Петербург");

          Household b512 = new Household();
          b512.addFraightWagon(10);
          b512.transportation("Песок", "Сочи");

          Sanitary venetka = new Sanitary();
          venetka.addFraightWagon(2);
          venetka.transportation("3 единицы мед. оборудования", "Уфа");

          Military warm324 = new Military();
          warm324.addFraightWagon(3);
          warm324.transportation("1700 единиц боевой техники", "Ростовская область");

          Cargo tygach1 = new Cargo();
          tygach1.addFraightWagon(10);
          tygach1.transportation("100 машин", "Москву");
      }
}
