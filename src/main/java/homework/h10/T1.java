package homework.h10;

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {
  public char kthCharacter(int position) {
    StringBuilder word = new StringBuilder("a");
    while (word.length() < position) {
      int length = word.length();
      for (int i = 0; i < length; i++) {
        word.append((char) ((word.charAt(i) - 'a' + 1) % 26 + 'a'));
      }
    }
    return word.charAt(position - 1);
  }
}
