package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void example1_returnsDifferenceBetweenPairProducts() {
    assertThat(solution.maxProductDifference(new int[] {5, 6, 2, 7, 4})).isEqualTo(34);
  }

  @Test
  void example2_returnsDifferenceForSecondExample() {
    assertThat(solution.maxProductDifference(new int[] {4, 2, 5, 9, 7, 4, 8})).isEqualTo(64);
  }

  @Test
  void handlesMinimumArrayLength() {
    assertThat(solution.maxProductDifference(new int[] {1, 2, 3, 4})).isEqualTo(10);
  }

  @Test
  void handlesMaximumValues() {
    assertThat(solution.maxProductDifference(new int[] {10_000, 10_000, 10_000, 10_000})).isZero();
  }
}
