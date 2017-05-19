package com.concept.java.solution;

import com.concept.java.Base;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/16/17
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class NQueensProb extends Base {

    public int[] result;

    public int[][] solution;

    public NQueensProb(int size) {
        this.result = new int[size];
        this.solution = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.solution[i][j] = 0;
            }
        }
    }

    public boolean canPlace(int x, int y) {
        for (int i = 0; i < x; i++) {
            if ((this.result[i] == y) || (Math.abs(i - x) == Math.abs(this.result[i] - y))) {
                return false;
            }
        }
        return true;
    }

    /*
    * Space complexity; O{N}
    * */
    public void solve(int queen, int size) {
        for (int i = 0; i < size; i++) {
            if (canPlace(queen, i)) {
                this.result[queen] = i;
                if (queen == size - 1) {
                    System.out.println("Order of " + size + " Queens " + Arrays.toString(result));
                }
                solve(queen + 1, size);
            }
        }
    }

    /*
   * Bruit force method
   * Space complexity: O(N2)
   * */
    public void solve(int size) {
        if (placeQueens(0, size)) {
            printArray(this.solution);
        } else {
            System.out.println("No Result found");
        }
    }

    public boolean placeQueens(int queen, int size) {
        if (queen == size)
            return true;
        for (int row = 0; row < size; row++) {
            if (canPlace(this.solution, row, queen)) {
                this.solution[row][queen] = 1;
                if (placeQueens(queen + 1, size))
                    return true;
                this.solution[row][queen] = 0;
            }
        }
        return false;
    }

    public boolean canPlace(int[][] board, int row, int column) {
        for (int i = 0; i < column; i++)
            if (board[row][i] == 1)
                return false;
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        for (int i = row, j = column; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        NQueensProb nQueensProb = new NQueensProb(8);
        nQueensProb.solve(0,8);
        nQueensProb.solve(8);
    }
}
