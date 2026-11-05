package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private final T2.Solution solution = new T2().new Solution();

  @Test
  void example1_recognizesAnagram() {
    assertThat(solution.isAnagram("anagram", "nagaram")).isTrue();
  }

  @Test
  void example2_rejectsDifferentLetterCounts() {
    assertThat(solution.isAnagram("rat", "car")).isFalse();
  }

  @Test
  void handlesEmptyStrings() {
    assertThat(solution.isAnagram("", "")).isTrue();
  }

  @Test
  void rejectsDifferentLengths() {
    assertThat(solution.isAnagram("a", "ab")).isFalse();
  }

  @Test
  void handlesMaximumLengthAndAllLetters() {
    String input = "abcdefghijklmnopqrstuvwxyz".repeat(3_846);

    assertThat(input).hasSize(99_996);
    assertThat(solution.isAnagram(input, input)).isTrue();
  }
}
