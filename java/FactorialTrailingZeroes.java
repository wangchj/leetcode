/**
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Note: Your solution should be in logarithmic time complexity.
 *
 * Author: Chih-Jye Wang
 * Date  : March 24, 2015
 *
 * Strategy: counting the factor of 5s of n!
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        if(n < 5)
            return 0;

        int i = n;
        int count = 0;

        do {
            count += i / 5;
            i /= 5;
        } while(i >= 5);

        return count;
    }

    /**
     * Print out the result for n = 0 ... 1000.
     */
    public static void main(String[] args) {
        FactorialTrailingZeroes f = new FactorialTrailingZeroes();
        System.out.println("   n   Result");
        System.out.println("-------------");
        for(int i = 0; i <= 1000; i ++)
            System.out.printf("%4d  %5d \n", i, f.trailingZeroes(i));
    }
}