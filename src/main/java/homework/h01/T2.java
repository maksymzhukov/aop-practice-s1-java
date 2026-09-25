package homework.h01;

// advanced
//  https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
public class T2 {
    class Solution {
        public int countOdds(int low, int high) {
            if (low % 2 == 0 && high % 2 == 0)
                return (high - low) / 2;
            else
                return ((high - low) / 2) + 1;
        }
    }
}
