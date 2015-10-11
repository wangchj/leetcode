/**
 * Author: Chih-Jye Wang
 * Date  : Oct 10, 2015
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 *
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */

#include <stdio.h>

void swap(int nums[], int i, int j) {
    nums[i] ^= nums[j];
    nums[j] ^= nums[i];
    nums[i] ^= nums[j];
}

void moveZeroes(int* nums, int numsSize) {
    //Find first non-zero
    int z = numsSize - 1;
    while(z >= 0 && nums[z] == 0)
        z--;
    //Search for zeros from back
    int i, j;
    for(i = z - 1; i >= 0; i--) {
        if(nums[i] == 0) {
            for(j = i; j < z; j++)
                swap(nums, j, j + 1);
            z--;
        }
    }
}

void main() {
    int nums[] = {0, 1, 0, 3, 12};
    moveZeroes(nums, 5);
    int i;
    for(i = 0; i < 5; i++)
        printf("%d ", nums[i]);
}

