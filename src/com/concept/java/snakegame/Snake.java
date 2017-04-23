package com.concept.java.snakegame;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/20/17
 * Time: 8:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class Snake {
    
    public static int DEFAULT_LENGTH = 5;
    private LinkedList<Cell> snakePartList;
    private Cell head;

    public Snake(Cell[] iniPos){
         this.head = iniPos[0];
        this.snakePartList = new LinkedList<Cell>();
        for(int index=iniPos.length-1; index>=0; index--){
            this.snakePartList.add(iniPos[index]);
        }
        //Collections.addAll(this.snakePartList, iniPos);
    }
    
    public boolean isCrashed(Cell nexPos){
        return this.snakePartList.contains(nexPos);
    }
    
    public void move(Cell nexPos){
        Cell tail  = this.snakePartList.removeFirst();
        tail.setCellType(CellType.EMPTY);
        this.head = nexPos;
        nexPos.setCellType(CellType.SNAKE_BODY);
        this.snakePartList.add(nexPos);
    }

    public void grow(){
        this.snakePartList.add(head);
    }

    public Cell getHead() {
        return head;
    }

    public void setHead(Cell head) {
        this.head = head;
    }
}
