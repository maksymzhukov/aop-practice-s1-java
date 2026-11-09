package homework.h12;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void followsOrderFromArr2() {
    assertArrayEquals(
        new int[] {2, 2, 1, 1},
        solution.relativeSortArray(new int[] {1, 2, 1, 2}, new int[] {2, 1}));
  }

  @Test
  void sortsValuesMissingFromArr2() {
    assertArrayEquals(
        new int[] {3, 1, 4, 5}, solution.relativeSortArray(new int[] {5, 3, 4, 1}, new int[] {3}));
  }

  @Test
  void keepsAllDuplicates() {
    assertArrayEquals(
        new int[] {7, 7, 7, 2, 2},
        solution.relativeSortArray(new int[] {2, 7, 2, 7, 7}, new int[] {7}));
  }

  @Test
  void handlesZero() {
    assertArrayEquals(
        new int[] {0, 0, 2, 3}, solution.relativeSortArray(new int[] {3, 0, 2, 0}, new int[] {0}));
  }

  @Test
  void handlesLargestAllowedValue() {
    assertArrayEquals(
        new int[] {1000, 1000, 1, 5},
        solution.relativeSortArray(new int[] {5, 1000, 1, 1000}, new int[] {1000}));
  }

  @Test
  void singleElement() {
    assertArrayEquals(new int[] {4}, solution.relativeSortArray(new int[] {4}, new int[] {4}));
  }
}
