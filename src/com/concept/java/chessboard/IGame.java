package com.concept.java.chessboard;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/4/17
 * Time: 9:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IGame {


    void start();

    void restart();

    void pause();

    void resume();

    void stop();

    void over();

    boolean move(Player player, Piece piece, int toX, int toY);

    Board getState();



}
