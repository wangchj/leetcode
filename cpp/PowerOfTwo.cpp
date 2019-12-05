/**
 * Author: Chih-Jye Wang
 * Date  : Oct 12, 2015
 *
 * Given an integer, write a function to determine if it is a power of two.
 */
 
#include <iostream>

using namespace std;

class PowerOfTwo {
public:
    bool isPowerOfTwo(int n) {
        if(n < 0)
            return false;
        int m = 1;
        int c = 0;
        for(int i = 0; i < 31; i++) {
            if((n & m) != 0)
                c++;
            m <<= 1;
        }
        return c == 1;
    }
};

int main() {
    PowerOfTwo s;
    cout << s.isPowerOfTwo(-2147483648) << endl;
}