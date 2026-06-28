public class TestStrategy {

    public static void main(String[] args) {

        PaymentContext creditPayment =
                new PaymentContext(new CreditCardPayment());

        creditPayment.executePayment(5000);

        PaymentContext paypalPayment =
                new PaymentContext(new PayPalPayment());

        paypalPayment.executePayment(3000);
    }
}