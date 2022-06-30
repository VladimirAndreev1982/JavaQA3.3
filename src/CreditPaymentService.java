public class CreditPaymentService {
    public double calculate(int credit, int period, double percent) {
        double payment = credit*((percent/100/12) + (percent/100/12) / (Math.pow((1+(percent/100/12)),period*12) -1) ); // формула расчета ежемесячного платежа
        return payment;
    }
}
