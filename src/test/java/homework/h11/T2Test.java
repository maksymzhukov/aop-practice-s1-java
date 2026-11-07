package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void returnsThreeForFirstLeetCodeExample() {
    assertThat(solution.majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
  }

  @Test
  void returnsTwoForSecondLeetCodeExample() {
    assertThat(solution.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
  }

  @Test
  void returnsOnlyElementForMinimumInputSize() {
    assertThat(solution.majorityElement(new int[] {42})).isEqualTo(42);
  }

  @Test
  void returnsNegativeMajority() {
    assertThat(solution.majorityElement(new int[] {-4, 7, -4, 7, -4})).isEqualTo(-4);
  }

  @Test
  void returnsMajorityAfterCandidateCountResets() {
    assertThat(solution.majorityElement(new int[] {2, 1, 1})).isEqualTo(1);
  }

  @Test
  void returnsMajorityWhenAllElementsAreEqual() {
    assertThat(solution.majorityElement(new int[] {5, 5, 5, 5})).isEqualTo(5);
  }

  @Test
  void returnsMajorityForMaximumInputSizeAndValueBounds() {
    int[] nums = new int[50_000];
    Arrays.fill(nums, -1_000_000_000);
    nums[0] = 1_000_000_000;

    assertThat(solution.majorityElement(nums)).isEqualTo(-1_000_000_000);
  }
}
