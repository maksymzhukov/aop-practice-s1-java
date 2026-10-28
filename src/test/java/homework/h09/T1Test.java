package homework.h09;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class T1Test {

    private final T1 solution = new T1();

    @Test
    void example1_returnsExpectedResult() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expected = List.of(true, true, true, false, true);

        List<Boolean> actual = solution.kidsWithCandies(candies, extraCandies);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example2_returnsExpectedResult() {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expected = List.of(true, false, false, false, false);

        List<Boolean> actual = solution.kidsWithCandies(candies, extraCandies);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example3_returnsExpectedResult() {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> expected = List.of(true, false, true);

        List<Boolean> actual = solution.kidsWithCandies(candies, extraCandies);

        assertThat(actual).isEqualTo(expected);
    }
}