package task1.interface1;

public class Freelancer implements Payable{
    private String name;
    private int hoursWorked;
    private double hourlyRate;

    public Freelancer(String name, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePayment() {
        return hoursWorked * hourlyRate;
    }

    public String getName() {
        return name;
    }
}
