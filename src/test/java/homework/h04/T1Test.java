package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void example1_countsDifferentBits() {
    assertThat(solution.hammingDistance(1, 4)).isEqualTo(2);
  }

  @Test
  void example2_countsSetBitsInDifference() {
    assertThat(solution.hammingDistance(3, 1)).isEqualTo(1);
  }

  @Test
  void returnsZeroForEqualNumbers() {
    assertThat(solution.hammingDistance(0, 0)).isZero();
  }

  @Test
  void handlesMaximumNonNegativeInteger() {
    assertThat(solution.hammingDistance(Integer.MAX_VALUE, 0)).isEqualTo(31);
  }
}
