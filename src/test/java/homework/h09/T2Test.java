package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {

    private final T2 solution = new T2();

    @Test
    void example1_returnsExpectedResult() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;

        int actual = solution.numIdenticalPairs(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example2_returnsExpectedResult() {
        int[] nums = {1, 1, 1, 1};
        int expected = 6;

        int actual = solution.numIdenticalPairs(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example3_returnsExpectedResult() {
        int[] nums = {1, 2, 3};
        int expected = 0;

        int actual = solution.numIdenticalPairs(nums);

        assertThat(actual).isEqualTo(expected);
    }
}