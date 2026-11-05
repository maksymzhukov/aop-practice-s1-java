package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void example1_returnsSortedSquares() {
    assertThat(solution.sortedSquares(new int[] {-4, -1, 0, 3, 10}))
        .containsExactly(0, 1, 9, 16, 100);
  }

  @Test
  void example2_returnsSortedSquaresAcrossZero() {
    assertThat(solution.sortedSquares(new int[] {-7, -3, 2, 3, 11}))
        .containsExactly(4, 9, 9, 49, 121);
  }

  @Test
  void handlesSingleElementArray() {
    assertThat(solution.sortedSquares(new int[] {-100})).containsExactly(10_000);
  }

  @Test
  void handlesArrayWithOnlyNonNegativeValues() {
    assertThat(solution.sortedSquares(new int[] {0, 1, 2, 3})).containsExactly(0, 1, 4, 9);
  }

  @Test
  void handlesArrayWithOnlyNegativeValues() {
    assertThat(solution.sortedSquares(new int[] {-4, -3, -2, -1})).containsExactly(1, 4, 9, 16);
  }

  @Test
  void handlesMaximumArrayLengthAndValues() {
    int[] input = new int[10_000];
    Arrays.fill(input, -10_000);

    int[] result = solution.sortedSquares(input);

    assertThat(result).hasSize(10_000).containsOnly(100_000_000);
  }
}
