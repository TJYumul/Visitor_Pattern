public class Chair implements Furniture {
    private double weight, flat_rate;

    public Chair(double weight, double flat_rate) {
        this.weight = weight;
        this.flat_rate = flat_rate;
    }

    public double getWeight() {
        return weight;
    }

    public double getFlatRate() {
        return flat_rate;
    }

    @Override
    public double accept(ShippingCalculator visitor) {
        return visitor.computeShipping(this);
    }
}