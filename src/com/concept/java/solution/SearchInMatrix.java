package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/16/17
 * Time: 9:34 AM
 * To change this template use File | Settings | File Templates.
 */

/*
* Search in a row wise and column wise sorted matrix
*
* */
public class SearchInMatrix extends Base{
    

    /*
    * Time Complexity O(n)
    * */
    public int[] find(int matrix[][], int value){
        int i=0, j= matrix.length-1;
        int index[] = {-1,-1};
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==value){
               index[0] = i;
               index[1] = j;
                break;
            }else if(matrix[i][j]>value)
                j--;
            else
                i++;
        }
        return index;
    }
    
    public static void main(String args[]){
        SearchInMatrix searchInMatrix = new SearchInMatrix();
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{24,29,37,48},{32,33,39,50}};
        searchInMatrix.printArray(matrix);
        int index[] = searchInMatrix.find(matrix, 45);
        System.out.println("Index:- i="+ index[0]+" j="+ index[1]);
    }
    
}
