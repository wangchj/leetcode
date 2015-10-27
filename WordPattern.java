/**
 * Given a pattern and a string str, find if str follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 *
 * Examples:
 * pattern = "abba", str = "dog cat cat dog" should return true.
 * pattern = "abba", str = "dog cat cat fish" should return false.
 * pattern = "aaaa", str = "dog cat cat dog" should return false.
 * pattern = "abba", str = "dog dog dog dog" should return false.
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 *
 * @author Chih-Jye Wang
 * @since  2015-10-26
 */

import java.util.Scanner;
import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        Scanner s = new Scanner(str);
        HashMap<Character, String> a = new HashMap<>();
        HashMap<String, Character> b = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            if(!s.hasNext())
                return false;
            char   c = pattern.charAt(i);
            String d = s.next();
            if(a.containsKey(c)) {
                if(!a.get(c).equals(d))
                    return false;
            }
            else if(b.containsKey(d)) {
                if(b.get(d) != c)
                    return false;
            }
            else {
                a.put(c, d);
                b.put(d, c);
            }
        }

        return !s.hasNext();
    }

    public static void main(String[] args) {
        String p = "abba";
        String s = "dog cat cat dog";
        WordPattern w = new WordPattern();
        System.out.println(w.wordPattern(p, s));

        s = "dog cat cat fish";
        System.out.println(w.wordPattern(p, s));

        p = "aaaa";
        s = "dog cat cat dog";
        System.out.println(w.wordPattern(p, s));

        p = "abba";
        s = "dog dog dog dog";
        System.out.println(w.wordPattern(p, s));
    }
}