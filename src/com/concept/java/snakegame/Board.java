package com.concept.java.snakegame;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/20/17
 * Time: 8:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class Board {


    private int rowCount;
    private int columnCount;
    private Cell[][] cells;

    public Board(int rowCount, int columnCount){
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.cells = new Cell[rowCount][columnCount];
        init();
    }

    private void init(){
        for(int i=0;i< rowCount;i++){
            for(int j = 0; j< columnCount; j++){
                this.cells[i][j] = new Cell(i, j);
            }
        }
    }
    
    public void generateFood(){
        int row = (int) (Math.random() * rowCount);
        int column = (int) (Math.random() * columnCount);
        Cell food = this.cells[row][column];
        if(food.getCellType().equals(CellType.EMPTY)){
            this.cells[row][column].setCellType(CellType.FOOD);
        }else{
            generateFood();
        }
    }

    public void generateMegaFood(){
        int row = (int) (Math.random() * rowCount);
        int column = (int) (Math.random() * columnCount);
        Cell megaFood = this.cells[row][column];
        if(megaFood.getCellType().equals(CellType.EMPTY)){
            megaFood.setCellType(CellType.MEGA_FOOD);
        }else{
            generateMegaFood();
        }
    }
    
    public Cell getCell(int row, int column){
        return this.cells[row][column];
    }
    
    public Cell getEmptyCell(){
        int row = (int) (Math.random() * rowCount);
        int column = (int) (Math.random() * columnCount);
        Cell cell = this.cells[row][column];
        return cell.getCellType().equals(CellType.EMPTY)?cell: getEmptyCell();
    }
}
