package visitorPatternAssign;

public class Sofa implements Furniture {
    private double weight;

    public Sofa(double weight) {
        this.weight = weight;
    }

    @Override
    public double accept(FurnitureVisitor visitor, double value) {
        return visitor.visit(this, value);
    }

    @Override
    public double calculateShippingCost(double distance) {
        return this.weight * distance * 0.5;
    }

    @Override
    public String getInfo() {
        return "Sofa with weight: " + weight + " kg";
    }
}
