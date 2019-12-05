/**
 * Author: Chih-Jye Wang
 * Date  : Oct 18, 2015
 *
 * Find the area covered by two rectangles, R1 and R2. R1 and R2 may overlap.
 * R1 is defined by lower-left corner and upper right corner (a, b), (c, d)
 * R2 is defined by lower-left corner and upper right corner (e, f), (g, h)
 *
 * https://leetcode.com/problems/rectangle-area/
 */

#include <iostream>
#include <algorithm>

using namespace std;

class RectangleArea {
public:
    int computeArea(
        int A, int B, int C, int D,
        int E, int F, int G, int H)
    {
        int a1 = (C - A) * (D - B);
        int a2 = (G - E) * (H - F);
        
        if(C < E || A > G || D < F || B > H)
            return a1 + a2;

        int left = max(A, E);
        int right = min(C, G);
        int top = min(D, H);
        int bot = max(B, F);

        return a1 + a2 - (right - left) * (top - bot);
    }
};

int main() {
    RectangleArea s;
    cout << s.computeArea(-2, -2, 2, 2, 3, 3, 4, 4) << endl;
    return 0;
}