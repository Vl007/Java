package com.company.trains;

import com.company.interfaces.Transferer;

public abstract class Train implements Transferer {

    private int fuel;

    public abstract void transportation(Object cargo, String destination);

    public abstract void toGo(String destination);

    @Override
    public abstract void transfer(Object cargo, String destination);

    public void refuel(int liters) {
        fuel += liters;
    }

    protected boolean useUpFuel(int liters) {
        int newFuelLevel = fuel - liters;
        if (newFuelLevel < 0) return false;
        fuel = newFuelLevel;
        return true;
    }

}
