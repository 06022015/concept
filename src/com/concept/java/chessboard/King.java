package com.concept.java.chessboard;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class King extends Piece {

    private boolean initialPosition;

    public King(boolean isDead, int x, int y) {
        super(isDead, x, y);
    }

    public boolean isInitialPosition() {
        return initialPosition;
    }

    public void setInitialPosition(boolean initialPosition) {
        this.initialPosition = initialPosition;
    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if (!super.isValid(board, fromX, fromY, toX, toY)) {
            return false;
        }
        if (fromX != Math.abs(toX - 1) && fromX != Math.abs(toX + 1))
            return false;
        if (fromY != Math.abs(toY - 1) && fromY != Math.abs(toY + 1))
            return false;
        return true;

    }
}
