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

        Change expected = new Change(1);
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
