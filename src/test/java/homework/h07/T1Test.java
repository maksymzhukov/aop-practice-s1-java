package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1 solution = new T1();

  @Test
  void example1_returnsFizzBuzzSequenceThroughFifteen() {
    assertThat(solution.fizzBuzz(15))
        .containsExactly(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz");
  }

  @Test
  void example2_returnsSequenceThroughOne() {
    assertThat(solution.fizzBuzz(1)).containsExactly("1");
  }

  @Test
  void handlesFizzBuzzBranchesAtMaximumInput() {
    var result = solution.fizzBuzz(10_000);

    assertThat(result).hasSize(10_000);
    assertThat(result.get(2)).isEqualTo("Fizz");
    assertThat(result.get(4)).isEqualTo("Buzz");
    assertThat(result.get(14)).isEqualTo("FizzBuzz");
    assertThat(result.get(9_999)).isEqualTo("Buzz");
  }
}
