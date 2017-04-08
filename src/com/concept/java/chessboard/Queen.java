package com.concept.java.chessboard;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Queen extends Piece {


    public Queen(boolean isDead, int x, int y) {
        super(isDead, x, y);
    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if (!super.isValid(board, fromX, fromY, toX, toY)) {
            return false;
        }
        return Math.abs(toX - fromX) == Math.abs(toY - fromY) || fromX == toX || fromY == toY;
    }
}
