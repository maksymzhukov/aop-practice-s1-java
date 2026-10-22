package homework.h05;
import java.util.Arrays;

// base
// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
public class T1 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - 1] * nums[n - 2] - nums[0] * nums[1];
    }
}

