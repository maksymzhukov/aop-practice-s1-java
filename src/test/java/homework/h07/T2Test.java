package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void example1_returnsSixSteps() {
    assertThat(solution.numberOfSteps(14)).isEqualTo(6);
  }

  @Test
  void example2_returnsFourSteps() {
    assertThat(solution.numberOfSteps(8)).isEqualTo(4);
  }

  @Test
  void example3_returnsZeroForZero() {
    assertThat(solution.numberOfSteps(0)).isZero();
  }

  @Test
  void handlesMaximumInput() {
    assertThat(solution.numberOfSteps(1_000_000)).isEqualTo(26);
  }
}
