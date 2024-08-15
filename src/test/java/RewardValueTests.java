import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 100;
        var rewardValue = new  RewardValue(milesValue,true);
        System.out.println(rewardValue.getMilesValue());
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
    double cashValue=1000.00;
    var rewardsValue = new RewardValue(cashValue);
    assertEquals(cashValue, rewardsValue.getCashValue());

    }

    @Test
    void convert_from_miles_to_cash() {
    double milesValue=10000;
    var rewardsValue = new RewardValue(milesValue,true);
    assertEquals(milesValue, rewardsValue.getMilesValue());
    }
}
