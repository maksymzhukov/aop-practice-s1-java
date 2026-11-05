package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class T2Test {
  private final T2 solution = new T2();

  @Test
  void example1_countsPairsBelowTarget() {
    assertThat(solution.countPairs(List.of(-1, 1, 2, 3, 1), 2)).isEqualTo(3);
  }

  @Test
  void example2_returnsZeroWhenNoPairIsBelowTarget() {
    assertThat(solution.countPairs(List.of(1, 2, 3, 4, 5), 1)).isZero();
  }

  @Test
  void returnsZeroForFewerThanTwoValues() {
    assertThat(solution.countPairs(List.of(0), 1)).isZero();
  }

  @Test
  void handlesMaximumInputSizeAndCountsEveryPair() {
    List<Integer> values = new ArrayList<>(Collections.nCopies(50, 0));

    assertThat(solution.countPairs(values, 1)).isEqualTo(1_225);
  }
}
