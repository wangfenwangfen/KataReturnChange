import org.assertj.core.api.Assertions;
import org.junit.Test;

public class OptimalChangeTest {
    @Test
    public void should_return_null_if_not_possible_given_change() {
        Solution solution = new Solution();

        Change result = solution.optimalChange(1);

        Assertions.assertThat(result).isEqualTo(null);
    }

    @Test
    public void should_return_one_coin2_if_sum_is_2() {
        Solution solution = new Solution();

        Change result = solution.optimalChange(2);

        Change expected = new Change(1,0,0);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_one_bill5_if_sum_is_5() {
        Solution solution = new Solution();

        Change result = solution.optimalChange(5);

        Change expected = new Change(0, 1,0);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_one_bill10_if_sum_is_10() {
        Solution solution = new Solution();

        Change result = solution.optimalChange(10);

        Change expected = new Change(0, 0, 1);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_3_coin2_if_sum_is_6() {
        Solution solution = new Solution();

        Change result = solution.optimalChange(6);

        Change expected = new Change(3,0,0);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_2_bill10_if_sum_is_20() {
        Solution solution = new Solution();

        Change result = solution.optimalChange(20);

        Change expected = new Change(0,0,2);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_1_bill10_1_bill5_if_sum_is_15() {
        Solution solution = new Solution();

        Change result = solution.optimalChange(15);

        Change expected = new Change(0,1,1);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}

