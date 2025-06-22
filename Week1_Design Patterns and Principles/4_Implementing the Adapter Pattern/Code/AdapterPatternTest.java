public class AdapterPatternTest {
    public static void main(String[] args) {
        System.out.println("--- Integrating with PayPal via Adapter ---");
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        payPalProcessor.processPayment(100.50);

        System.out.println("\n--- Integrating with Stripe via Adapter ---");
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        stripeProcessor.processPayment(250.75);

        System.out.println("\n--- Demonstrating polymorphism ---");
        processPaymentWithAnyGateway(payPalProcessor, 50.00);
        processPaymentWithAnyGateway(stripeProcessor, 120.00);
    }

    public static void processPaymentWithAnyGateway(PaymentProcessor processor, double amount) {
        System.out.println("Client initiating payment through unified interface...");
        processor.processPayment(amount);
    }
}