package homework.h10;

// https://leetcode.com/problems/reverse-string/
public class T2 {
  public void reverseString(char[] characters) {
    int left = 0;
    int right = characters.length - 1;
    while (left < right) {
      char temp = characters[left];
      characters[left] = characters[right];
      characters[right] = temp;
      left++;
      right--;
    }
  }
}
