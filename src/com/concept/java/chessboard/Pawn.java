package com.concept.java.chessboard;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 9:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Pawn extends Piece {

    private boolean initialPosition;

    public Pawn(boolean isDead, int x, int y) {
        super(isDead, x, y);
        this.initialPosition = true;
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
        if(this.initialPosition){
            if((fromY == toY-2 && fromX==toX) || (fromY==toY-1 && (fromX==toX || fromX+1==toX || fromX-1 == toX))){
                return true;
            }
        }else{
           if(fromY==toY-1 && (fromX==toX || fromX+1==toX || fromX-1 == toX)){
               return true;
           }
        }
        return false;
    }
}
