class StripeAdapter implements PaymentProcessor {

    private final StripeGateway stripe;

    public StripeAdapter() {
        stripe = new StripeGateway();
    }

    @Override
    public void processPayment(int amount) {
        stripe.makeCharge(amount);
    }
}