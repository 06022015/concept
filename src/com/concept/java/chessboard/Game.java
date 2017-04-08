package com.concept.java.chessboard;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game {

    private Board board;
    private Player white;
    private Player black;

    public Game() {
        super();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getWhite() {
        return white;
    }

    public void setWhite(Player white) {
        this.white = white;
    }

    public Player getBlack() {
        return black;
    }

    public void setBlack(Player black) {
        this.black = black;
    }

    public void startGame(){
        initializeGameForGivenPlayers();
    }

    public boolean initializeGameForGivenPlayers() {
        if (null == this.white || null == this.black) {
            return false;
        }
        this.board = new Board();
        for (int i = 0; i < this.black.getPieces().size(); i++) {
            this.board.getSpot(this.black.getPieces().get(i).getX(), this.black.getPieces().get(i).getY()).occupy(this.black,this.black.getPieces().get(i));
        }
        for (int i = 0; i < this.white.getPieces().size(); i++) {
            this.board.getSpot(this.white.getPieces().get(i).getX(), this.white.getPieces().get(i).getY()).occupy(this.white,this.white.getPieces().get(i));
        }
        return true;
    }

    public boolean move(Player player, Piece piece, int toX, int toY){
        return this.board.move(player,piece,piece.getX(), piece.getY(), toX,toY);
    }
}
