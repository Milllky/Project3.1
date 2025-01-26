public class CreditPaymentService {
    public int calculate(int sum, int time, double per) {
        double monthPercent = (per / (100 * time));
        double x = (1 - (Math.pow((1 + monthPercent), -time)));
        int result = (int) (sum * (monthPercent / x));
        return result;
    }
}
