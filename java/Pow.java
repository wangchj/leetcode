/**
 * Author: Chih-Jye Wang
 * Date  : March 18, 2015
 *
 * Pow(x, n)
 *
 * Implement pow(x, n).
 *
 * Implemented using Exponentiation by squaring (http://en.wikipedia.org/wiki/Exponentiation_by_squaring)
 */

public class Pow {
    public double pow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(x == 1) return 1;
        if(x == -1) {
            if(n % 2 == 0) return 1;
            else return -1;
        }

        if(n < 0) //n is negative
            return pow(1 / x, -n);

        if(n % 2 == 0) //if n is even
            return pow(x * x, n / 2);
        else           //if n is odd
            return x * pow(x * x, (n - 1) / 2);       
    }
}