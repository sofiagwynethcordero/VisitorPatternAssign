package visitorPatternAssign;

public interface Furniture {
    double accept(FurnitureVisitor visitor, double value);
    double calculateShippingCost(double distance);
    String getInfo();
}
