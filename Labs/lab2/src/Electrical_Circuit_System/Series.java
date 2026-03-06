package Electrical_Circuit_System;

public class Series extends Circuit {
    private Circuit first;
    private Circuit second;
    private double potentialDifference;

    public Series(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance() {
        return first.getResistance() + second.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;

        double totalResistance = getResistance();
        double current = V / totalResistance;

        double v1 = current * first.getResistance();
        double v2 = current * second.getResistance();

        first.applyPotentialDiff(v1);
        second.applyPotentialDiff(v2);
    }

    @Override
    public String toString() {
        return "Series{R=" + getResistance() + " Ohm, V=" + potentialDifference + " V}";
    }
}
