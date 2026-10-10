package homework.h04;

// advanced
// https://leetcode.com/problems/number-complement/
public class T2 {
    public int findComplement(int num) {
        long mask = 1;
        while (mask <= num) {
            mask = mask << 1;
        }
        return (int) ((mask - 1) ^ num);
    }
}
