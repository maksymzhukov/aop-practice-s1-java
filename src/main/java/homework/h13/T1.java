package homework.h13;

import java.util.function.IntPredicate;

// https://leetcode.com/problems/first-bad-version/
public class T1 {
  private final IntPredicate badVersion;

  public T1(IntPredicate badVersion) {
    this.badVersion = badVersion;
  }

  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;

    while (left < right) {
      int middle = left + (right - left) / 2;
      if (badVersion.test(middle)) {
        right = middle;
      } else {
        left = middle + 1;
      }
    }

    return left;
  }
}
