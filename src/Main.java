public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double paymentOneYear = service.calculate(1_000_000, 1, 9.9);
        System.out.println(paymentOneYear);

        double paymentTwoYear = service.calculate(1_000_000, 2, 9.9);
        System.out.println(paymentTwoYear);

        double paymentThreeYear = service.calculate(1_000_000, 3, 9.9);
        System.out.println(paymentThreeYear);
    }
}
