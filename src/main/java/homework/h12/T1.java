package homework.h12;

// https://leetcode.com/problems/height-checker/
public class T1 {
  public int heightChecker(int[] heights) {
    int[] count = new int[101];

    for (int height : heights) {
      count[height]++;
    }

    int mismatches = 0;
    int index = 0;

    for (int height = 1; height <= 100; height++) {
      while (count[height] > 0) {
        if (heights[index] != height) {
          mismatches++;
        }
        index++;
        count[height]--;
      }
    }

    return mismatches;
  }
}
