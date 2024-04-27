package visitorPatternAssign;

public class DiningTable implements Furniture {
    private double weight;

    public DiningTable(double weight) {
        this.weight = weight;
    }

    @Override
    public double accept(FurnitureVisitor visitor, double value) {
        return visitor.visit(this, value);
    }

    @Override
    public double calculateShippingCost(double distance) {
        return this.weight * distance * 0.75;
    }

    @Override
    public String getInfo() {
        return "DiningTable with weight: " + weight + " kg";
    }
}
