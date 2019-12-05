/**
 * Author: Chih-Jye Wang
 * Date  : Jan 21, 2013
 *
 * There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
 *
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.
 *
 * Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.
 *
 * Note:
 * The solution is guaranteed to be unique.
 */
public class GasStation
{
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = gas[0] - cost[0];
        int min = sum;
        int result = 0;
        
        for(int i = 1; i < gas.length; i++)
        {
            sum += gas[i] - cost[i];
            if(sum < min)
            {
                min = sum;
                result = i;
            }
        }
        return sum < 0 ? -1 : (result + 1) % gas.length;
    }
}