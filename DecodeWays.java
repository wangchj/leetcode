/**
 * Author: Chih-Jye Wang
 * Date  : Jan 26, 2014
 *
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 *
 * Given an encoded message containing digits, determine the total number of ways to decode it.
 *
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 *
 * The number of ways decoding "12" is 2.
 */
 
import java.util.HashMap;

public class DecodeWays
{
    public static int numDecodings(String s)
    {
        return ways(s, 0, new HashMap<Integer, Integer>());
    }
    
    /**
     * Recursive version of numDecodings() using DP (map).
     */
    public static int ways(String s, int start, HashMap<Integer, Integer> map)
    {
        if(s == null || s.length() == 0 || s.charAt(start) == '0' || start >= s.length())
            return 0;
        if(start == s.length() - 1)
            return 1;
        if(map.containsKey(start))
            return map.get(start);
        
        //Take one character
        int one = ways(s, start + 1, map);
        
        //Take two characters
        int i = Integer.valueOf(s.substring(start, start + 2));
        int two = 0;
        if(i > 0 && i < 27)
        {
            if(start == s.length() - 2)
                two = 1;
            else
                two = ways(s, start + 2, map);
        }
        
        map.put(start, one + two);
        return one + two;
    }
    
    public static void main(String[] args)
    {
        int r = DecodeWays.numDecodings("9371597631128776948387197132267188677349946742344217846154932859125134924241649584251978418763151253");
        System.out.println(r);
    }
}