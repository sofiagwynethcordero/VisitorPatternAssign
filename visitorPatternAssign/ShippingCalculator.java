package visitorPatternAssign;

public class ShippingCalculator implements FurnitureVisitor {
    @Override
    public double visit(Furniture furniture, double distance) {
        return furniture.calculateShippingCost(distance);
    }
}
