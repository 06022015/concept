package com.concept.java.chessboard;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rook extends Piece {

    private boolean initialPosition;

    public Rook(boolean isDead, int x, int y) {
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
        return fromX == toX || fromY == toY;
    }
}
