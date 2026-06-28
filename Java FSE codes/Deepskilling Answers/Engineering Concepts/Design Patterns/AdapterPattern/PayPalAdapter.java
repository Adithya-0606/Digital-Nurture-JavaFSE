class PayPalAdapter implements PaymentProcessor {

    private final PayPalGateway paypal;

    public PayPalAdapter() {
        paypal = new PayPalGateway();
    }

    @Override
    public void processPayment(int amount) {
        paypal.sendPayment(amount);
    }
}