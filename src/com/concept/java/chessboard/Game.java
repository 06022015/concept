package com.concept.java.chessboard;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game implements IGame{

    private Board board;
    private Player white;
    private Player black;

    public Game(Player white, Player black) {
        super();
        this.white = white;
        this.black = black;
    }

    public Player getWhite() {
        return white;
    }

    public Player getBlack() {
        return black;
    }

    private boolean initializeGameForGivenPlayers() {
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

    @Override
    public void start() {
        initializeGameForGivenPlayers();
    }

    @Override
    public void restart() {
        start();
    }

    @Override
    public void pause() {
        //TODO: logic to pause game
    }

    @Override
    public void resume() {
        //TODO: logic to resume game
    }

    @Override
    public void stop() {
        //TODO: logic to stop game
    }

    @Override
    public void over() {
        //TODO: logic to finish game
    }

    public boolean move(Player player, Piece piece, int toX, int toY){
        return this.board.move(player,piece,piece.getX(), piece.getY(), toX,toY);
    }

    @Override
    public Board getState() {
        return this.board;
    }
}
