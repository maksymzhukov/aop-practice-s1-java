package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void example1_returnsComplementWithinNumberWidth() {
    assertThat(solution.findComplement(5)).isEqualTo(2);
  }

  @Test
  void example2_returnsComplementForSingleSetBit() {
    assertThat(solution.findComplement(1)).isZero();
  }

  @Test
  void handlesSmallestPositiveInput() {
    assertThat(solution.findComplement(1)).isZero();
  }

  @Test
  void handlesMaximumInput() {
    assertThat(solution.findComplement(100_000)).isEqualTo(31_071);
  }
}
