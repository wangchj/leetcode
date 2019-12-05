/**
 * Author: Chih-Jye Wang
 * Date  : Dec 23, 2013
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * For example, 
 * Given s = "Hello World",
 * return 5.
 */
public class LengthOfLastWord
{
    public int lengthOfLastWord(String s)
    {
        s = s.trim();
        if(s.length() == 0)
            return 0;
        int i;
        for(i = s.length() - 1; i > 0; i--)
            if(s.charAt(i) == ' ')
                break;
        if(i == 0)
            return s.length();
        return s.length() - 1 - i;                
    }
    
    public static void main(String[] args)
    {
        LengthOfLastWord l = new LengthOfLastWord();
        int r = l.lengthOfLastWord("b a ");
    }
}