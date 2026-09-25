package homework.h02;

// advanced
// https://leetcode.com/problems/a-number-after-a-double-reversal/
public class T2 {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }
        if (num % 10 == 0) {
            return false;
        }
        return true;
    }
}
