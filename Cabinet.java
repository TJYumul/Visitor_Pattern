public class Cabinet implements Furniture {
    private double weight, size;

    public Cabinet(double weight, double size) {
        this.weight = weight;
        this.size = size;
    }

    public double getWeight() { return weight; }
    public double getSize() { return size; }

    @Override
    public double accept(ShippingCalculator calculator) {
        return calculator.computeShipping(this);
    }
}