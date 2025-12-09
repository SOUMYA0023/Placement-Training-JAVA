abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void makePayment();

    void generateReceipt() {
        System.out.println("Receipt generated for $" + amount);
    }
}

class CreditCardPayment extends Payment {

    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class UPIPayment extends Payment {

    UPIPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Processing UPI payment of $" + amount);
    }
}

public class BankPaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(500.00);
        p1.makePayment();
        p1.generateReceipt();

        Payment p2 = new UPIPayment(300.00);
        p2.makePayment();
        p2.generateReceipt();
    }
}