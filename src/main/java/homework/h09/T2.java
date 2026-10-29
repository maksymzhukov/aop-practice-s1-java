package homework.h09;

// https://leetcode.com/problems/number-of-good-pairs/
public class T2 {
  public int numIdenticalPairs(int[] nums) {
    int[] count = new int[101];
    int pairs = 0;

    for (int n : nums) {
      pairs += count[n];
      count[n]++;
    }

    return pairs;
  }
}
