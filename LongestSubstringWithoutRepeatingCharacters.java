/**
 * Author:  Chih-Jye Wang
 * Date:    Dec 11, 2013
 * 
 * Problem:
 * Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeatingCharacters
{
    public int lengthOfLongestSubstring(String s)
    {
        int max = 0;
        StringBuilder p;
        
        for(int i = 0; i < s.length(); i++)
        {
            p = new StringBuilder().append(s.charAt(i));
            for(int j = i + 1; j < s.length(); j++)
            {
                if(contains(p, s.charAt(j)))
                    break;
                p.append(s.charAt(j));
            }
            if(p.length() > max)
                max = p.length();
        }
        
        return max;
    }
    
    boolean contains(StringBuilder s, char c)
    {
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == c)
                return true;
        }
        return false;
    }
}