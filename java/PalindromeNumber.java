public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String str = "" + x;
        for (int left = 0, right = str.length() - 1; left < right; left++, right--) {
            if (str.charAt(left) != str.charAt(right))
                return false;
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0)
            return false;
        for (int left = getHighestPlace(x); left > 0; left -= 2) {
            int leftDigit = (int)(x / Math.pow(10, left));
            int rightDigit = x % 10;
            if (leftDigit != rightDigit)
                return false;
            x = (int)(x - (leftDigit * Math.pow(10, left)));
            x = x / 10;
        }
        return true;
    }

    public int getHighestPlace(int x) {
        for (int i = 0; true; i++) {
            int quotient = (int)(x / (Math.pow(10, i)));
            if (quotient == 0)
                return i - 1;
        }
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome2(1));
    }
}