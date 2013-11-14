/**
 * Author:  Chih-Jye Wang
 * Date:    Nov 14, 2013
 * 
 * Unique Binary Search Trees:
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 *
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 * 
 *   1         3     3      2      1
 *    \       /     /      / \      \
 *     3     2     1      1   3      2
 *    /     /       \                 \
 *   2     1         2                 3
 */
public class UniqueBinarySearchTrees
{
   public static int numTrees(int n)
   {
      if(n == 1) return 1;
      if(n == 2) return 2;
      if(n == 3) return 5;
      
      int sum = 0;
      
      for(int i = 0; i < n; i++)
      {
         int right, left;
         
         //Calculate sum for left subtree
         if(i == 0) left = 1;
         else left = numTrees(i);
         
         //Calculate sum for right subtree
         if(i == n - 1) right = 1;
         else right = numTrees(n - 1 - i);
         
         sum += left * right;
      }
      
      return sum;
   }
   
   public static void main(String[] args)
   {
      System.out.println(numTrees(4));
   }
}