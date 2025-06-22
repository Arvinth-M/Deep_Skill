public class StripeGateway {
    public void charge(double amount) {
        System.out.println("Charging $" + amount + " using Stripe.");
    }

    public void initiateRefund(double amount) {
        System.out.println("Requesting refund of $" + amount + " through Stripe.");
    }
}