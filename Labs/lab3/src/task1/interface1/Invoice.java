package task1.interface1;

public class Invoice implements Payable{
    private String product;
    private int quantity;
    private double pricePerUnit;

    public Invoice(String product, int quantity, double pricePerUnit) {
        this.product = product;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public double calculatePayment() {
        return quantity * pricePerUnit;
    }

    public String getProduct() {
        return product;
    }
}
