package com.concept.java.chessboard;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Spot {

    private int x;
    private int y;
    private Piece piece;
    private Player player;

    public Spot(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        this.piece = null;
    }

    public void occupy(Player player, Piece piece) {
        if (null != this.piece)
            this.piece.setDead(true);
        this.piece = piece;
        this.player = player;
    }

    public boolean isOccupied() {
        return null != piece;
    }

    public Player getPlayer(){
        return this.player;
    }

    public Piece release() {
        Piece releasedPiece = this.piece;
        this.piece = null;
        return releasedPiece;
    }

}
