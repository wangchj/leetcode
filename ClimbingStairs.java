/**
 * Author:  Chih-Jye Wang
 * Date:    Dec 5, 2013
 * 
 * Problem (Climbing Stairs):
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
public class ClimbingStairs
{
   public int climbStairs(int n)
   {
      int[] ans = {
         1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
         144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946,
         17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269
      };
      
      if(n <= ans.length)
         return ans[n-1];
      
      int result = climbStairs(n - 1);
      result += climbStairs(n - 2);
      return result;
   }
}