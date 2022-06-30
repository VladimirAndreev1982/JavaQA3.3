public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double percent = 9.99; // процентная ставка - в данной задаче это константа

        // Вариант расчёта 1
        System.out.println();
        System.out.println("Вариант расчёта 1");
        System.out.println("Ежемесячный платёж " + (int)service.calculate(1_000_000, 1, percent) + " руб., процентная ставка " + percent + "%");

        // Вариант расчёта 2
        System.out.println();
        System.out.println("Вариант расчёта 2");
        System.out.println("Ежемесячный платёж " + (int)service.calculate(1_000_000, 2, percent) + " руб., процентная ставка " + percent + "%");

        // Вариант расчёта 3
        System.out.println();
        System.out.println("Вариант расчёта 3");
        System.out.println("Ежемесячный платёж " + (int)service.calculate(1_000_000, 3, percent) + " руб., процентная ставка " + percent + "%");
    }
}