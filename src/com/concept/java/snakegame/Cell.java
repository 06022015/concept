package com.concept.java.snakegame;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/20/17
 * Time: 8:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class Cell {
    
    private int row;
    private int col;
    private CellType cellType;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        this.cellType = CellType.EMPTY;
    }


    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
