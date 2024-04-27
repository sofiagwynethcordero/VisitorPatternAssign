package visitorPatternAssign;

public class Client {
    public static void main(String[] args) {
        Furniture sofa = new Sofa(30.5);
        Furniture bed = new Bed(40.0);
        Furniture diningTable = new DiningTable(25.0);

        FurnitureVisitor shippingCalc = new ShippingCalculator();

        double distance = 100.0;

        printFurnitureDetails(sofa, shippingCalc, distance);
        printFurnitureDetails(bed, shippingCalc, distance);
        printFurnitureDetails(diningTable, shippingCalc, distance);
    }

    private static void printFurnitureDetails(Furniture furniture, FurnitureVisitor shippingVisitor, double distance) {
        double shippingCost = furniture.accept(shippingVisitor, distance);
        String details = furniture.getInfo() +
                "\nDistance: " + distance + " km" +
                "\nShipping Cost: PHP " + shippingCost +
                "\n";
        System.out.println(details);
    }
}
