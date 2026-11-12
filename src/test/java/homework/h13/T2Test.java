package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void returnsThreeForFirstLeetCodeExample() {
    assertThat(solution.maximumCount(new int[] {-2, -1, -1, 1, 2, 3})).isEqualTo(3);
  }

  @Test
  void returnsThreeForSecondLeetCodeExample() {
    assertThat(solution.maximumCount(new int[] {-3, -2, -1, 0, 0, 1, 2})).isEqualTo(3);
  }

  @Test
  void returnsFourForThirdLeetCodeExample() {
    assertThat(solution.maximumCount(new int[] {5, 20, 66, 1314})).isEqualTo(4);
  }

  @Test
  void ignoresZeros() {
    assertThat(solution.maximumCount(new int[] {-2, 0, 0, 0, 1})).isEqualTo(1);
  }

  @Test
  void returnsZeroWhenAllValuesAreZero() {
    assertThat(solution.maximumCount(new int[2000])).isZero();
  }

  @Test
  void handlesSingleSmallestNegativeValue() {
    assertThat(solution.maximumCount(new int[] {-2000})).isEqualTo(1);
  }

  @Test
  void handlesSingleLargestPositiveValue() {
    assertThat(solution.maximumCount(new int[] {2000})).isEqualTo(1);
  }
}
