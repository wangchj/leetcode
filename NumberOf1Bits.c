/**
 * Author: Chih-Jye Wang
 * Date  : Oct 6, 2015
 *
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 *
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */

#include <stdint.h>

int hammingWeight(uint32_t n) {
    uint32_t m = 1;
    int count = 0, i;
    for(i = 0; i < 32; i++) {
        if(n & m)
            count++;
        m <<= 1;
    }
    return count;
}