package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

class T1Test {
  @Test
  void returnsFourForFirstLeetCodeExample() {
    T1 solution = new T1(version -> version >= 4);
    assertThat(solution.firstBadVersion(5)).isEqualTo(4);
  }

  @Test
  void returnsOneForSecondLeetCodeExample() {
    T1 solution = new T1(version -> version >= 1);
    assertThat(solution.firstBadVersion(1)).isEqualTo(1);
  }

  @Test
  void findsFirstBadWhenItIsFirst() {
    T1 solution = new T1(version -> version >= 1);
    assertThat(solution.firstBadVersion(8)).isEqualTo(1);
  }

  @Test
  void findsFirstBadWhenItIsLast() {
    T1 solution = new T1(version -> version >= 8);
    assertThat(solution.firstBadVersion(8)).isEqualTo(8);
  }

  @Test
  void handlesLargestVersionWithoutTooManyApiCalls() {
    AtomicInteger calls = new AtomicInteger();
    T1 solution =
        new T1(
            version -> {
              calls.incrementAndGet();
              return version >= Integer.MAX_VALUE;
            });

    assertThat(solution.firstBadVersion(Integer.MAX_VALUE)).isEqualTo(Integer.MAX_VALUE);
    assertThat(calls.get()).isLessThanOrEqualTo(31);
  }
}
