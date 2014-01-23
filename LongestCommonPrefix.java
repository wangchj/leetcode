/**
 * Author: Chih-Jye Wang
 * Date  : Jan 22, 2014
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix
{
    public String longestCommonPrefix(String[] strs)
    {
        if(strs == null || strs.length == 0)
            return "";
        
         
        if(strs.length == 1)
            return strs[0];
        
        int len = 0;
        
        for(int i = 0; i < strs[0].length(); i++)
        {
            for(int j = 1; j < strs.length; j++)
            {
                if(strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0, len);
            }
            len++;
        }
        
        return strs[0];
    }
}