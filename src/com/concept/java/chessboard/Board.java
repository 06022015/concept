package com.concept.java.chessboard;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Board {

    private Spot[][] spots = new Spot[8][8];

    public Board() {
        super();
        for (int i = 0; i < spots.length; i++) {
            for (int j = 0; j < spots.length; j++) {
                spots[i][j] = new Spot(i, j);
            }
        }
    }

    public Spot getSpot(int x, int y) {
        return spots[x][y];
    }


    public boolean move(Player player, Piece piece,int fromX, int fromY, int toX, int toY){
        Spot currentSpot = this.getSpot(fromX, fromY);
        if(!currentSpot.getPlayer().equals(player)){
            System.out.println("Pick your piece");
            return false;
        }
        if(piece.isValid(this,fromX,fromY,toX,toY)){
            Spot spot = this.getSpot(toX, toY);
            if(spot.isOccupied() && spot.getPlayer().equals(player)){
                System.out.println("Already Occupied by your own other piece");
                return false;
            }

            spot.occupy(player, piece);
            piece.setX(toX);
            piece.setY(toY);
            currentSpot.release();
        }else{
            System.out.println("Invalid Path");
            return false;
        }
        return true;
    }

    public boolean  tracePath(Piece piece, int toX, int toY){
        if(piece instanceof Queen){

        }else if(piece instanceof Rook){

        } else if(piece instanceof Knight){

        }else if(piece instanceof Bishop){

        }else if(piece instanceof Pawn){

        }else{
            //King
        }
        return true;
    }

    public boolean checkForCheck(){

        return false;
    }
}
