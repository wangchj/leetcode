/**
 * Author: Chih-Jye Wang
 * Date  : March 18, 2015
 *
 * N-Queens II
 *
 * Follow up for N-Queens problem.
 *
 * Now, instead outputting board configurations, return the total number of distinct solutions.
 */
 
import java.util.*;

public class NQueens2 {
    
    private int n;
    private int res;

    public int totalNQueens(int n) {
        this.n = n;
        this.res = 0;

        //Number of diagonals: n * 2 - 1
        int diagonals =  (n * 2) - 1;

        LinkedList<Integer> queenPos = new LinkedList<>();

        //Diagonals that are occupied
        boolean[] dd = new boolean[diagonals]; //Slope down from left to right
        boolean[] du = new boolean[diagonals]; //Slope down from right to left

        //Rows and columns that are occupied
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[n];

        solveRecursive(n, 0, row, col, dd, du);

        return res;
    }

    public void solveRecursive(int count, int startPos, boolean[] row, boolean[] col, boolean[] dd, boolean[] du) {
        for(int i = startPos; i < n * n; i++) {
            if(!row[getRow(i)] && !col[getCol(i)] && !dd[getDd(i)] && !du[getDu(i)]) {
                if(count == 1) {
                    res++;
                }
                else {
                    row[getRow(i)] = col[getCol(i)] = dd[getDd(i)] = du[getDu(i)] = true;

                    //Recursive call count - 1,
                    //Set startPos to next row
                    solveRecursive(count - 1, i + (n - getCol(i)), row, col, dd, du); 
                }

                row[getRow(i)] = col[getCol(i)] = dd[getDd(i)] = du[getDu(i)] = false;
            }
        }    
    }

    private int getRow(int i) {
        return i / n;
    }

    private int getCol(int i) {
        return i % n;
    }

    private int getDd(int i) {
        return ((n - 1) - getCol(i)) + getRow(i);
    }

    private int getDu(int i) {
        return getCol(i) + getRow(i);
    }
}