/**
 * Author: Chih-Jye Wang
 * Date  : Oct 17, 2015
 *
 * Find the area covered by two rectangles, R1 and R2. R1 and R2 may overlap.
 * R1 is defined by lower-left corner and upper right corner (a, b), (c, d)
 * R2 is defined by lower-left corner and upper right corner (e, f), (g, h)
 *
 * https://leetcode.com/problems/rectangle-area/
 */

public class RectangleArea {
    public int computeArea(
        int a, int b, int c, int d,
        int e, int f, int g, int h)
    {
        int a1 = (c - a) * (d - b);
        int a2 = (g - e) * (h - f);

        int dx = getdx(a, c, e, g);
        int dy = getdy(b, d, f, h);

        return a1 + a2 - (dx * dy);
    }

    public int getdx(int a, int c, int e, int g) {
        //R2 in R1
        if(e >= a && g <= c)
            return  g - e;
        
        //R1 in R2
        if(a >= e && c <= g)
            return c - a;

        //R2 right clip
        if(e >= a && e <= c && g >= c)
            return c - e;

        //R2 left clip
        if(e <= a && g <= c && g >= a)
            return g - a;

        return 0;
    }

    public int getdy(int b, int d, int f, int h) {
        //R2 in R1
        if(f >= b && h <= d)
            return  h - f;
        
        //R1 in R2
        if(b >= f && d <= h)
            return d - b;

        //R2 top clip R1
        if(f >= b && f <= d && h >= d)
            return d - f;

        //R2 down clip R1
        if(f <= b && h <= d && h >= b)
            return h - b;

        return 0;
    }
    
    public static void main(String[] args) {
        RectangleArea s = new RectangleArea();
        s.computeArea(-2, -2, 2, 2, 3, 3, 4, 4);
    }
}