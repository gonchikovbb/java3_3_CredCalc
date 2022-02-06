public class CreditPaymentService {
    public double calculate(double sum, double years, double percent) {
        double payment = sum * ((percent / 100 / 12) + (percent / 100 / 12) / (Math.pow((1 + (percent / 100 / 12)), (years * 12)) - 1));
        return payment;
    }
}
