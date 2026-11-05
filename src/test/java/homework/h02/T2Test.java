package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void example1_returnsTrueForZero() {
    assertThat(solution.isSameAfterReversals(0)).isTrue();
  }

  @Test
  void example2_returnsTrueForNumberWithoutTrailingZero() {
    assertThat(solution.isSameAfterReversals(526)).isTrue();
  }

  @Test
  void example3_returnsFalseForPositiveNumberWithTrailingZero() {
    assertThat(solution.isSameAfterReversals(1800)).isFalse();
  }

  @Test
  void handlesMaximumInput() {
    assertThat(solution.isSameAfterReversals(1_000_000_000)).isFalse();
  }
}
