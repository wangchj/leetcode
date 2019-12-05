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

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        //Find first non-zero from back
        int z = nums.length - 1;
        while(z > 0 && nums[z] == 0)
            z--;
        //Search for zeros from back
        for(int i = z - 1; i >= 0; i--) {
            if(nums[i] == 0) {
                for(int j = i; j < z; j++)
                    swap(nums, j, j + 1);
                z--;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }

    public static void main(String[] args) {
        MoveZeroes s = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        
        nums = new int[] {1, 0, 5, 0};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        
        nums = new int[] {};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        
        nums = new int[] {1};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}