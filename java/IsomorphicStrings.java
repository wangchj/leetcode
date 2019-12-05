/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 *
 * For example,
 * Given "egg", "add", return true.
 *
 * Given "foo", "bar", return false.
 *
 * Given "paper", "title", return true.
 *
 * Note:
 * You may assume both s and t have the same length.
 *
 * @author Chih-Jye Wang
 * @since  2015-10-28
 */

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Character> a = new HashMap<>();
        HashMap<Character, Character> b = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(a.containsKey(c) && a.get(c) != d)
                return false;
            else if(b.containsKey(d) && b.get(d) != c)
                return false;
            else {
                a.put(c, d);
                b.put(d, c);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings i = new IsomorphicStrings();
        String s = "egg";
        String t = "add";
        System.out.println(i.isIsomorphic(s, t));
        
        s = "foo";
        t = "bar";
        System.out.println(i.isIsomorphic(s, t));
    
        s = "paper";
        t = "title";
        System.out.println(i.isIsomorphic(s, t));
    }
}