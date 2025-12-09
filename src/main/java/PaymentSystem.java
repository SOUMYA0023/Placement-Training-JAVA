abstract class Payment {
    protected double amount;
    protected String transactionId;
    
    public Payment(double amount) {
        this.amount = amount;
        this.transactionId = generateTransactionId();
    }
    
    // Abstract methods to be implemented by subclasses
    public abstract boolean processPayment();
    public abstract String getPaymentType();
    
    // Concrete methods
    public double getAmount() {
        return amount;
    }
    
    public String getTransactionId() {
        return transactionId;
    }
    
    private String generateTransactionId() {
        return "TXN" + System.currentTimeMillis();
    }
    
    public void displayPaymentInfo() {
        System.out.println("Payment Type: " + getPaymentType());
        System.out.println("Amount: $" + amount);
        System.out.println("Transaction ID: " + transactionId);
    }
}

class BankCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    
    public BankCardPayment(double amount, String cardNumber, String cardHolderName, String expiryDate) {
        super(amount);
        this.cardNumber = maskCardNumber(cardNumber);
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }
    
    @Override
    public boolean processPayment() {
        // Simulate payment processing
        System.out.println("Processing bank card payment...");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Expiry Date: " + expiryDate);
        
        // Simple validation
        if (amount > 0) {
            System.out.println("Bank card payment successful!");
            return true;
        } else {
            System.out.println("Bank card payment failed!");
            return false;
        }
    }
    
    @Override
    public String getPaymentType() {
        return "Bank Card";
    }
    
    private String maskCardNumber(String cardNumber) {
        if (cardNumber.length() > 4) {
            return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
        }
        return cardNumber;
    }
}

class UPIPayment extends Payment {
    private String upiId;
    private String payerName;
    
    public UPIPayment(double amount, String upiId, String payerName) {
        super(amount);
        this.upiId = upiId;
        this.payerName = payerName;
    }
    
    @Override
    public boolean processPayment() {
        // Simulate UPI payment processing
        System.out.println("Processing UPI payment...");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Payer Name: " + payerName);
        
        // Simple validation
        if (amount > 0) {
            System.out.println("UPI payment successful!");
            return true;
        } else {
            System.out.println("UPI payment failed!");
            return false;
        }
    }
    
    @Override
    public String getPaymentType() {
        return "UPI";
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        // Demonstrate bank card payment
        System.out.println("=== Bank Card Payment ===");
        BankCardPayment cardPayment = new BankCardPayment(
            150.75, 
            "1234567890123456", 
            "soumya kar", 
            "12/25"
        );
        cardPayment.displayPaymentInfo();
        cardPayment.processPayment();
        
        System.out.println("\n=== UPI Payment ===");
        UPIPayment upiPayment = new UPIPayment(
            89.50, 
            "soumya.kar@upi", 
            "soumya kar"
        );
        upiPayment.displayPaymentInfo();
        upiPayment.processPayment();
    }
}