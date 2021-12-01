package com.company;

import com.company.trains.*;
import com.company.humans.*;

public class Main {

      public static void main(String[] args) {

          Passenger Peregrine = new Passenger();
          Peregrine.refuel(11);
          Peregrine.transportation("10 почтовых мешков", "Санкт-Петербург");

          Household b512 = new Household();
          b512.refuel(20);
          b512.transportation("Песок", "Сочи");

          Sanitary venetka = new Sanitary();
          venetka.refuel(12);
          venetka.transportation("3 единицы мед. оборудования", "Уфа");

          Military warm324 = new Military();
          warm324.refuel(13);
          warm324.transportation("1700 единиц боевой техники", "Ростовская область");

          Cargo tygach1 = new Cargo();
          tygach1.refuel(10);
          tygach1.transportation("100 машин", "Москву");

          Passengers Alex = new Passengers();
          Alex.go("China");
          Alex.byTickets(13);
          Alex.go("Arabia");
          Alex.travel("Париж\n");

          Guides Abdulis = new Guides();
          Abdulis.go("China\n");
          Abdulis.transportation("Мешок писем", "Москву\n");
          Abdulis.transfer("Чемодан", "Сочи\n");

      }

}
