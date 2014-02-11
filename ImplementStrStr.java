public class ImplementStrStr
{
    public static String strStr(String haystack, String needle)
    {
        if(haystack == null || needle == null || needle.length() > haystack.length())
            return null;
            
        if(needle.equals("") || haystack.equals(needle))
            return haystack;
            
        //The result
        int res = -1;
        //Haystack index
        int h = 0;
        //Needle index
        int n = 0;
         
        while(h < haystack.length() && n < needle.length())
        {
            if(haystack.charAt(h) == needle.charAt(n))
            {
                if(res == -1)
                    res = h;
                n++;
                h++;
            }
            else
            {
                if(res != -1)
                    h = res + 1;
                else
                    h++;    
                res = -1;
                n = 0;
            }
        }
        
        return res != -1 && haystack.length() - res >= needle.length() ? 
            haystack.substring(res, haystack.length()) : null;
    }
    
    public static void main(String[] args)
    {
        String r = strStr("abcd", "cd");
        r = strStr("abcd", "ab");
        r = strStr("abc", "aba");
        r = strStr("mississippi", "issip");
    }
}
