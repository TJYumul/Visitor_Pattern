public class FurnitureShipping implements ShippingCalculator {
    @Override
    public double computeShipping(Chair chair) {
        return chair.getFlatRate();
    }

    @Override
    public double computeShipping(Table table) {
        return table.getWidth() * table.getLength() * 0.3;
    }

    @Override
    public double computeShipping(Cabinet cabinet) {
        return (cabinet.getWeight() * 1.5) + (cabinet.getSize() * 0.4);
    }
}
