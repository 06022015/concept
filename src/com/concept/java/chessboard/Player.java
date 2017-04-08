package com.concept.java.chessboard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Player {

    enum PlayerType {
        BLACK, WHITE
    }

    private final int PAWNS = 8;
    private final int KING = 1;
    private final int QUEEN = 1;
    private final int ROOK = 2;
    private final int BiSHOP = 2;
    private final int Knight = 2;

    private boolean isWhite;
    private List<Piece> pieces;

    public Player(boolean isWhite) {
        super();
        this.isWhite = isWhite;
        this.pieces = new ArrayList<Piece>();

    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public void initialize() {
        if (this.isWhite) {
            for (int i = 0; i < PAWNS; i++) {
                this.pieces.add(new Pawn(true, i, 1));
            }
            this.pieces.add(new Rook(true, 0, 0));
            this.pieces.add(new Knight(true, 1, 0));
            this.pieces.add(new Bishop(true, 2, 0));
            this.pieces.add(new Queen(true, 3, 0));
            this.pieces.add(new King(true, 4, 0));
            this.pieces.add(new Bishop(true, 5, 0));
            this.pieces.add(new Knight(true, 6, 0));
            this.pieces.add(new Rook(true, 7, 0));
        } else {
            for (int i = 0; i < PAWNS; i++) {
                this.pieces.add(new Pawn(true, i, 6));
            }
            this.pieces.add(new Rook(true, 0, 7));
            this.pieces.add(new Knight(true, 1, 7));
            this.pieces.add(new Bishop(true, 2, 7));
            this.pieces.add(new Queen(true, 3, 7));
            this.pieces.add(new King(true, 4, 7));
            this.pieces.add(new Bishop(true, 5, 7));
            this.pieces.add(new Knight(true, 6, 7));
            this.pieces.add(new Rook(true, 7, 7));
        }
    }

}
