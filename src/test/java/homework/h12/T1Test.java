package homework.h12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void alreadySorted() {
    assertEquals(0, solution.heightChecker(new int[] {1, 2, 3, 4, 5}));
  }

  @Test
  void allHeightsEqual() {
    assertEquals(0, solution.heightChecker(new int[] {3, 3, 3, 3}));
  }

  @Test
  void oneStudent() {
    assertEquals(0, solution.heightChecker(new int[] {100}));
  }

  @Test
  void twoStudentsSwapped() {
    assertEquals(2, solution.heightChecker(new int[] {2, 1}));
  }

  @Test
  void allPositionsWrong() {
    assertEquals(5, solution.heightChecker(new int[] {5, 1, 2, 3, 4}));
  }

  @Test
  void repeatedHeightsWithSomeWrongPositions() {
    assertEquals(3, solution.heightChecker(new int[] {1, 1, 4, 2, 1, 3}));
  }
}
