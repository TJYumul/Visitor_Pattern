public class Table implements Furniture {
    private double width, length;

    public Table(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() { return width; }
    public double getLength() { return length; }

    @Override
    public double accept(ShippingCalculator calculator) {
        return calculator.computeShipping(this);
    }
}
