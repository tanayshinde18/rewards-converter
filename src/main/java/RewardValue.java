public class RewardValue {

    public static final  double MILES_TO_CASH_RATE=0.0035;
    public static double cashValue;
    public static double milesValue;

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
    public static double getCashValue() {
        return cashValue;
    }
    public static double getMilesValue() {
        return milesValue;
    }
}
