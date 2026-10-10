package homework.h05;

// advanced
// https://leetcode.com/problems/squares-of-a-sorted-array/
public class T2 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

