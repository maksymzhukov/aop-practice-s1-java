package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void example1_returnsDifferenceOfDivisibleAndNonDivisibleSums() {
    assertThat(solution.differenceOfSums(10, 3)).isEqualTo(19);
  }

  @Test
  void example2_handlesDivisorLargerThanRange() {
    assertThat(solution.differenceOfSums(5, 6)).isEqualTo(15);
  }

  @Test
  void handlesSmallestRange() {
    assertThat(solution.differenceOfSums(1, 1)).isEqualTo(-1);
  }

  @Test
  void handlesMaximumRangeAndDivisor() {
    assertThat(solution.differenceOfSums(10_000, 10_000)).isEqualTo(49_985_000);
  }
}
