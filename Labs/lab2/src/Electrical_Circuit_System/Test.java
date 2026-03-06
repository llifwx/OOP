package Electrical_Circuit_System;

public class Test {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        double R = circuit.getResistance();
        System.out.println("Equivalent resistance: " + R + " Ohm");

        circuit.applyPotentialDiff(12.0);

        System.out.println("Total potential difference: " + circuit.getPotentialDiff() + " V");
        System.out.println("Total current: " + circuit.getCurrent() + " A");
        System.out.println("Total power: " + circuit.getPower() + " W");

        System.out.println("\n--- Individual components ---");
        System.out.println("a: R=" + a.getResistance() + ", V=" + a.getPotentialDiff() + ", I=" + a.getCurrent());
        System.out.println("b: R=" + b.getResistance() + ", V=" + b.getPotentialDiff() + ", I=" + b.getCurrent());
        System.out.println("c: R=" + c.getResistance() + ", V=" + c.getPotentialDiff() + ", I=" + c.getCurrent());
        System.out.println("d: R=" + d.getResistance() + ", V=" + d.getPotentialDiff() + ", I=" + d.getCurrent());
        System.out.println("e: R=" + e.getResistance() + ", V=" + e.getPotentialDiff() + ", I=" + e.getCurrent());
    }
}