package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void returnsTwoForFirstLeetCodeExample() {
    assertThat(solution.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
  }

  @Test
  void returnsTwoForSecondLeetCodeExample() {
    assertThat(solution.missingNumber(new int[] {0, 1})).isEqualTo(2);
  }

  @Test
  void returnsEightForThirdLeetCodeExample() {
    assertThat(solution.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
  }

  @Test
  void returnsZeroForSingleElementOne() {
    assertThat(solution.missingNumber(new int[] {1})).isZero();
  }

  @Test
  void returnsOneForSingleElementZero() {
    assertThat(solution.missingNumber(new int[] {0})).isEqualTo(1);
  }

  @Test
  void returnsLastValueWhenItIsMissing() {
    assertThat(solution.missingNumber(new int[] {0, 1, 2, 3, 4})).isEqualTo(5);
  }

  @Test
  void returnsMissingValueForMaximumInputSize() {
    int missing = 9876;
    int[] nums = new int[10_000];
    int index = 0;

    for (int value = 0; value <= 10_000; value++) {
      if (value != missing) {
        nums[index++] = value;
      }
    }

    assertThat(solution.missingNumber(nums)).isEqualTo(missing);
  }
}
