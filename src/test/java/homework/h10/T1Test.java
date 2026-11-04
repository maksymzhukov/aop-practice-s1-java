package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void returnsAForFirstPositionAtMinimumBound() {
    assertThat(solution.kthCharacter(1)).isEqualTo('a');
  }

  @Test
  void returnsBForFifthPositionFromExampleOne() {
    assertThat(solution.kthCharacter(5)).isEqualTo('b');
  }

  @Test
  void returnsCForTenthPositionFromExampleTwo() {
    assertThat(solution.kthCharacter(10)).isEqualTo('c');
  }

  @Test
  void returnsHForPositionAtMaximumBound() {
    assertThat(solution.kthCharacter(500)).isEqualTo('h');
  }
}
