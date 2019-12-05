/**
 * Author: Chih-Jye Wang
 * Date  : Dec 15, 2013
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 *
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 *
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome
{
    public boolean isPalindrome(String s)
    {
        if(s == null || s.isEmpty())
            return true;
        int front = getNextAlphaNumIndex(s, 0, 1);
        int rear  = getNextAlphaNumIndex(s, s.length() - 1, -1);
        while(front != rear)
        {
            if (Character.toUpperCase(s.charAt(front)) !=
                Character.toUpperCase(s.charAt(rear)))
                return false;
            front = getNextAlphaNumIndex(s, front + 1, 1);
            rear  = getNextAlphaNumIndex(s, rear - 1, -1);   
        }
        return true;    
    }
    
    /**
     * Gets the index of next alpha-numeric character, including start.
     * Returns -1 if not found
     */
    int getNextAlphaNumIndex(String s, int start, int dir)
    {
        for(int i = start; i >= 0 && i < s.length(); i += dir)
        {
            if(Character.isLetterOrDigit(s.charAt(i)) && s.charAt(i) != ' ')
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        ValidPalindrome sol = new ValidPalindrome();
        System.out.println(sol.isPalindrome("a ba"));
    }    
}