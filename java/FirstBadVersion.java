/**
 * Author: Chih-Jye Wang
 * Date  : Oct 15, 2015
 *
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(right >= left) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) {
                if(mid == 1)
                    return mid;
                if(!isBadVersion(mid - 1))
                    return mid;
                right = mid - 1;
            }
            else {
                if(isBadVersion(mid + 1))
                    return (int)(mid + 1);
                left = mid + 1;
            }
        }
        return - 1;
    }

    public static void main(String[] args) {
        FirstBadVersion s = new FirstBadVersion();
        System.out.println(s.firstBadVersion(2126753390));
    }
}

class VersionControl {
    public boolean isBadVersion(int version) {
        return version >= 1702766719;
    }
}