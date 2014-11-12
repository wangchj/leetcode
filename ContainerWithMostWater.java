/**
 * Author: Chih-Jye Wang
 * Date  : Nov 12, 2014
 *
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container.
 */
public class ContainerWithMostWater
{
    public int maxArea(int[] height)
    {
        int max = 0;
        int front = 0;
        int rear = height.length - 1;
        
        while(front < rear)
        {
            int h = Math.min(height[front], height[rear]) * (rear - front);
            if(h > max)
                max = h;
            if(height[front] < height[rear])
                front++;
            else
                rear--;
        }
        
        return max;
    }
}