package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2.Solution solution = new T2().new Solution();

  @Test
  void example1_countsOddNumbersInInclusiveRange() {
    assertThat(solution.countOdds(3, 7)).isEqualTo(3);
  }

  @Test
  void example2_countsOddNumbersInEvenRange() {
    assertThat(solution.countOdds(8, 10)).isEqualTo(1);
  }

  @Test
  void returnsZeroWhenRangeContainsOnlyOneEvenNumber() {
    assertThat(solution.countOdds(0, 0)).isZero();
  }

  @Test
  void handlesMaximumEndpoint() {
    assertThat(solution.countOdds(0, 1_000_000_000)).isEqualTo(500_000_000);
  }
}
