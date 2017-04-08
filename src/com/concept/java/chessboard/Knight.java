package com.concept.java.chessboard;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Knight extends Piece {


    public Knight(boolean isDead, int x, int y) {
        super(isDead, x, y);
    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if (!super.isValid(board, fromX, fromY, toX, toY)) {
            return false;
        }
        if (fromX != Math.abs(toX - 1) && fromX != Math.abs(toX + 1) && fromX != Math.abs(toX - 2) && fromX != Math.abs(toX + 2))
            return false;
        if (fromY != Math.abs(toY - 1) && fromY != Math.abs(toY + 1) && fromY != Math.abs(toY - 2) && fromY != Math.abs(toY + 2))
            return false;
        return true;
    }
}
