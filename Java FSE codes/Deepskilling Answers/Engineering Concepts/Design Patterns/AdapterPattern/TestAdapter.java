public class TestAdapter {

    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalAdapter();
        PaymentProcessor stripe = new StripeAdapter();

        paypal.processPayment(1000);
        stripe.processPayment(2000);
    }
}