package task3.devices;

import task3.interfaces.SellableAndPluggable;

public class iPhone implements SellableAndPluggable {

    @Override
    public void sell() {
        System.out.println("iPhone is sold.");
    }

    @Override
    public void plugIn() {
        System.out.println("iPhone is plugged in.");
    }
}
