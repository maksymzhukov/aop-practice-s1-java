package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
  private final T1.Solution solution = new T1().new Solution();

  @Test
  void example1_recognizesAlphanumericPalindrome() {
    assertThat(solution.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
  }

  @Test
  void example2_rejectsNonPalindrome() {
    assertThat(solution.isPalindrome("race a car")).isFalse();
  }

  @Test
  void example3_acceptsStringWithoutLettersOrDigits() {
    assertThat(solution.isPalindrome(" ")).isTrue();
  }

  @Test
  void handlesEmptyString() {
    assertThat(solution.isPalindrome("")).isTrue();
  }

  @Test
  void handlesMaximumLengthPalindrome() {
    assertThat(solution.isPalindrome("a".repeat(200_000))).isTrue();
  }
}
