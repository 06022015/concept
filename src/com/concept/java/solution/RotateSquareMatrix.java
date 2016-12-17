package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/17/16
 * Time: 7:22 PM
 * To change this template use File | Settings | File Templates.
 */

/*
*   Inplace rotate square matrix by 90 degrees
*   Given an square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.
* */
public class RotateSquareMatrix {
    
    
    public int [][] rotate(int input[][]){
        int result[][] = new int[input.length][input.length];
        for(int row=0;row<input.length;row++){
            for(int col=input.length-1;col>=0;col--){
                result[input.length-col-1][row] = input[row][col];
            }
        }
        return result;
    }

    public void printData(int input[][]){
        for(int row=0;row<input.length;row++){
            for(int col=0;col<input.length;col++){
                System.out.print(input[row][col]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        RotateSquareMatrix rotateSquareMatrix = new RotateSquareMatrix();
        /*3*3 matrix*/
        int input[][] = new int[3][3];
        input[0][0]=1;
        input[0][1]=2;
        input[0][2]=3;
        input[1][0]=4;
        input[1][1]=5;
        input[1][2]=6;
        input[2][0]=7;
        input[2][1]=8;
        input[2][2]=9;

        System.out.println("3*3 matrix");
        rotateSquareMatrix.printData(rotateSquareMatrix.rotate(input));

        /*4*4 matrix*/
        int input1[][] = new int[4][4];
        input1[0][0]=1;
        input1[0][1]=2;
        input1[0][2]=3;
        input1[0][3]=4;
        input1[1][0]=5;
        input1[1][1]=6;
        input1[1][2]=7;
        input1[1][3]=8;
        input1[2][0]=9;
        input1[2][1]=10;
        input1[2][2]=11;
        input1[2][3]=12;
        input1[3][0]=13;
        input1[3][1]=14;
        input1[3][2]=15;
        input1[3][3]=16;
        System.out.println("4*4 matrix");
        rotateSquareMatrix.printData(rotateSquareMatrix.rotate(input1));

    }
    
}
