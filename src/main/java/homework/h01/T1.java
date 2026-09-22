package homework.h01;

// https://leetcode.com/problems/smallest-even-multiple/
public class T1 {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return 2 * n;
    }
}
