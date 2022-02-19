public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        float LoanAmount = 1_000_000;
        float InterestRate = (float) 9.99;
        float LoanPeriod = 24;
        float MonthlyPayment = service.calculate(LoanAmount, InterestRate, LoanPeriod);
        System.out.println("Размер ежемесячного платежа: " + MonthlyPayment);
    }
}

