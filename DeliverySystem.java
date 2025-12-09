abstract class Delivery {
    double baseCost;
    
    Delivery(double baseCost) {
        this.baseCost = baseCost;
    }
    
    abstract double calculateTotalCost();
    
    void printDeliveryDetails() {
        System.out.println("Base Cost: $" + String.format("%.2f", baseCost));
        System.out.println("Total Cost: $" + String.format("%.2f", calculateTotalCost()));
    }
}

class StandardDelivery extends Delivery {
    
    StandardDelivery(double baseCost) {
        super(baseCost);
    }
    
    @Override
    double calculateTotalCost() {
        return baseCost;
    }
}

class ExpressDelivery extends Delivery {
    
    ExpressDelivery(double baseCost) {
        super(baseCost);
    }
    
    @Override
    double calculateTotalCost() {
        // 10% extra/express delivery
        return baseCost * 1.10;
    }
}

public class DeliverySystem {
    public static void main(String[] args) {
        Delivery d1 = new StandardDelivery(100.00);
        System.out.println("=== Standard Delivery ===");
        d1.printDeliveryDetails();
        
        Delivery d2 = new ExpressDelivery(100.00);
        System.out.println("\n=== Express Delivery ===");
        d2.printDeliveryDetails();
    }
}