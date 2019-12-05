/**
 * Author: Chih-Jye Wang
 * Date  : Oct 24, 2015
 *
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 *
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
 */

import java.util.ArrayList;
import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashSet<Character>> r = new ArrayList<>();
        ArrayList<HashSet<Character>> c = new ArrayList<>();
        ArrayList<HashSet<Character>> s = new ArrayList<>();

        for(int i = 0; i < 9; i++) {
            r.add(new HashSet<>());
            c.add(new HashSet<>());
            s.add(new HashSet<>());
        }

        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {
                char val = board[row][col];
                
                if(val == '.')
                    continue;

                if(r.get(row).contains(val))
                    return false;
                else
                    r.get(row).add(val);

                if(c.get(col).contains(val))
                    return false;
                else
                    c.get(col).add(val);

                int square = getSquare(row, col);
                if(s.get(square).contains(val))
                    return false;
                else
                    s.get(square).add(val);
            }
        }
        return true;
    }

    public int getSquare(int row, int col) {
        row /= 3;
        col /= 3;
        return row * 3 + col;
    }

    public static void main(String[] args) {
        String[] a = {
            "53..7....",
            "6..195...",
            ".98....6.",
            "8...6...3",
            "4..8.3..1",
            "7...2...6",
            ".6....28.",
            "...419..5",
            "....8..79"
        };

        char[][] board = new char[9][];
        for(int i = 0; i < 9; i++)
            board[i] = a[i].toCharArray();

        ValidSudoku s = new ValidSudoku();
        System.out.println(s.isValidSudoku(board));
    }
}