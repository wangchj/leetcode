/**
 * Author: Chih-Jye Wang
 * Date  : March 17, 2015
 *
 * N-Queens Total Accepted: 26314 Total Submissions: 100371 My Submissions Question Solution 
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
 *
 * For example,
 * There exist two distinct solutions to the 4-queens puzzle:
 *
 * [
 *  [".Q..",  // Solution 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 *
 *  ["..Q.",  // Solution 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 */
 
import java.util.*;

public class NQueens {
    
    private int n;

    public List<String[]> solveNQueens(int n) {
        this.n = n;

        //Number of diagonals: n * 2 - 1
        int diagonals =  (n * 2) - 1;

        LinkedList<Integer> queenPos = new LinkedList<>();

        //Diagonals that are occupied
        boolean[] dd = new boolean[diagonals]; //Slope down from left to right
        boolean[] du = new boolean[diagonals]; //Slope down from right to left

        //Rows and columns that are occupied
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[n];

        ArrayList<String[]> res = new ArrayList<>();
        solveRecursive(n, 0, row, col, dd, du, queenPos, res);
        return res;
    }

    public void solveRecursive(int count, int startPos, boolean[] row, boolean[] col, boolean[] dd, boolean[] du, LinkedList<Integer> queenPos, ArrayList<String[]> res) {
        for(int i = startPos; i < n * n; i++) {
            if(!row[getRow(i)] && !col[getCol(i)] && !dd[getDd(i)] && !du[getDu(i)]) {
                if(count == 1) {
                    //Found a solution
                    queenPos.addLast(i);
                    addSolution(queenPos, res);
                }
                else {
                    queenPos.add(i);
                    row[getRow(i)] = col[getCol(i)] = dd[getDd(i)] = du[getDu(i)] = true;

                    //Recursive call count - 1,
                    //Set startPos to next row
                    solveRecursive(count - 1, i + (n - getCol(i)), row, col, dd, du, queenPos, res); 
                }

                row[getRow(i)] = col[getCol(i)] = dd[getDd(i)] = du[getDu(i)] = false;
                queenPos.removeLast();
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

    private void addSolution(LinkedList<Integer> queenPos, ArrayList<String[]> res) {
        String[] board = new String[n];

        for(int row = 0; row < n; row++) {
            StringBuilder rowStr = new StringBuilder(n);
            for(int col = 0; col < n; col++) {
                int i = row * n + col;
                if(queenPos.contains(i))
                    rowStr.append('Q');
                else
                    rowStr.append('.');
            }
            board[row] = rowStr.toString();
        }
        res.add(board);
    }
}