public class RewardValue {

    private static final  double MILES_TO_CASH_RATE=0.0035;
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }
    public RewardValue(double milesValue, boolean isMiles){
        if(isMiles){
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE;
        }
    }
    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return milesValue;
    }
}
