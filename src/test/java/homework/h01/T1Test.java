package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void returnsTenForFirstExample() {
    assertThat(solution.smallestEvenMultiple(5)).isEqualTo(10);
  }

  @Test
  void returnsSixForSecondExample() {
    assertThat(solution.smallestEvenMultiple(6)).isEqualTo(6);
  }

  @Test
  void returnsTwoForMinimumInput() {
    assertThat(solution.smallestEvenMultiple(1)).isEqualTo(2);
  }

  @Test
  void returnsMaximumInputWhenItIsEven() {
    assertThat(solution.smallestEvenMultiple(150)).isEqualTo(150);
  }
}
