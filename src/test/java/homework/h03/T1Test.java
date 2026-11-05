package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void example1_excludesMinimumAndMaximumSalary() {
    assertThat(solution.average(new int[] {4000, 3000, 1000, 2000})).isEqualTo(2500.0);
  }

  @Test
  void example2_averagesInteriorSalaries() {
    assertThat(solution.average(new int[] {1000, 2000, 3000})).isEqualTo(2000.0);
  }

  @Test
  void handlesMinimumNumberOfSalaries() {
    assertThat(solution.average(new int[] {1000, 1001, 1002})).isEqualTo(1001.0);
  }

  @Test
  void handlesMaximumSalaryValues() {
    assertThat(solution.average(new int[] {100_000, 99_999, 1000, 2000, 3000}))
        .isEqualTo(34_999.666666666664);
  }
}
