/**
 * Author: Chih-Jye Wang
 * Date  : Dec 21, 2014
 *
 * Compare two version numbers version1 and version1.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 *
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 *
 * Here is an example of version numbers ordering:
 *
 * 0.1 < 1.1 < 1.2 < 13.37
 */
public class CompareVersionNumbers
{ 
    public int compareVersion(String ver1, String ver2)
    {
        String[] parts1 = ver1.split("\\.");
        String[] parts2 = ver2.split("\\.");
        int i = 0, j = 0;
        for(; i < parts1.length && j < parts2.length; i++, j++)
        {
            int int1 = Integer.parseInt(parts1[i]);
            int int2 = Integer.parseInt(parts2[j]);
            
            if(int1 < int2)
                return -1;
            if(int1 > int2)
                return 1;
        }
        
        if(i < parts1.length && !isZeroTail(parts1, i))
            return 1;
        if(j < parts2.length && !isZeroTail(parts2, j))
            return -1;
        else return 0;
    }
    
    /**
     * checks if the rest of the array is all zero.
     * @param parts array of integers representing version numbers
     * @param pos the position to start checking
     * @return true if from pos to end of array is all integer 0; false otherwise.
     */
    public boolean isZeroTail(String[] parts, int pos)
    {
        for(int i = pos; i < parts.length; i++)
        {
            int val = Integer.parseInt(parts[pos]);
            if(val != 0)
                return false;
        }
        return true;
    }
}