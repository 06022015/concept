package com.concept.java.chessboard;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Piece {

    private boolean dead;
    private int x;
    private int y;

    public Piece(boolean isDead, int x, int y) {
        super();
        this.dead = isDead;
        this.x = x;
        this.y = y;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if (toX == fromX && toY == fromY)
            return false; //cannot move nothing
        if (toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY < 0 || fromY > 7)
            return false;
        return true;
    }
}
