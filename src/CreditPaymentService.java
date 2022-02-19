public class CreditPaymentService {
    public float calculate(float LoanAmount, float InterestRate, float LoanPeriod) {
        float P=(InterestRate/100/InterestRate);
                float B= (float) Math.pow(1 + P, LoanPeriod)-1;
        return (float) (LoanAmount * (P+ P/B));
    }

}
