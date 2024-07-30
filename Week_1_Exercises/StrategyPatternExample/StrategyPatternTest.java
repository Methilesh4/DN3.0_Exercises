public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment("1234-5678-9012-3456"));
        context.executePayment(100.00);

        context = new PaymentContext(new PayPalPayment("user@example.com"));
        context.executePayment(200.00);
    }
}
