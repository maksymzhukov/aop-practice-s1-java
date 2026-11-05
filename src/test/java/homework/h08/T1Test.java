package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void example1_returnsLongestRunOfOnes() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1})).isEqualTo(3);
  }

  @Test
  void example2_returnsLongestRunAtBeginning() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1})).isEqualTo(2);
  }

  @Test
  void returnsZeroForEmptyArray() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {})).isZero();
  }

  @Test
  void returnsZeroWhenArrayContainsOnlyZeros() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {0, 0, 0})).isZero();
  }

  @Test
  void returnsFullLengthWhenArrayContainsOnlyOnes() {
    assertThat(solution.findMaxConsecutiveOnes(new int[] {1, 1, 1})).isEqualTo(3);
  }

  @Test
  void handlesMaximumArrayLength() {
    int[] input = new int[100_000];
    Arrays.fill(input, 1);

    assertThat(solution.findMaxConsecutiveOnes(input)).isEqualTo(100_000);
  }
}
