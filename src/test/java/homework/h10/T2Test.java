package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T2Test {
  private static final int MAX_LENGTH = 100_000;

  private final T2 solution = new T2();

  @Test
  void reversesOddLengthArrayFromExampleOne() {
    char[] characters = {'h', 'e', 'l', 'l', 'o'};
    solution.reverseString(characters);
    assertThat(characters).containsExactly('o', 'l', 'l', 'e', 'h');
  }

  @Test
  void reversesEvenLengthArrayFromExampleTwo() {
    char[] characters = {'H', 'a', 'n', 'n', 'a', 'h'};
    solution.reverseString(characters);
    assertThat(characters).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
  }

  @Test
  void keepsSingleElementArrayUnchanged() {
    char[] characters = {'x'};
    solution.reverseString(characters);
    assertThat(characters).containsExactly('x');
  }

  @Test
  void swapsTwoElements() {
    char[] characters = {'a', 'b'};
    solution.reverseString(characters);
    assertThat(characters).containsExactly('b', 'a');
  }

  @Test
  void reversesArrayOfMaximumLength() {
    char[] characters = new char[MAX_LENGTH];
    char[] expected = new char[MAX_LENGTH];
    for (int i = 0; i < MAX_LENGTH; i++) {
      characters[i] = (char) ('a' + i % 26);
      expected[MAX_LENGTH - 1 - i] = characters[i];
    }
    solution.reverseString(characters);
    assertThat(characters).containsExactly(expected);
  }
}
