/**
 * Author: Chih-Jye Wang
 * Date  : Oct 7, 2015
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Strategy: compute Fibonacci's number from the bottom up O(n).
 */

#include <stdio.h>

int climbStairs(int n) {
    int a = 0, b = 1, i, f;
    for(i = 1; i <= n; i++) {
        f =  a + b;
        a = b;
        b = f;
    }
    return b;
}