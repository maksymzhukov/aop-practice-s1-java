package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void example1_reducesDigitsToOne() {
    assertThat(solution.addDigits(38)).isEqualTo(2);
  }

  @Test
  void example2_returnsSingleDigitUnchanged() {
    assertThat(solution.addDigits(0)).isZero();
  }

  @Test
  void repeatedlySumsDigitsUntilOneDigitRemains() {
    assertThat(solution.addDigits(999)).isEqualTo(9);
  }

  @Test
  void handlesMaximumInput() {
    assertThat(solution.addDigits(Integer.MAX_VALUE)).isEqualTo(1);
  }
}
