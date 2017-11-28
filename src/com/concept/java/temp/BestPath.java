package com.concept.java.temp;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 6/3/17
 * Time: 12:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class BestPath {
    
    int allPaths[][] = new int[6][6];
    int pathNumber = 0;
    
     public static void main(String args[]){
         int matrix[][] = {{5,20,11},{3,40,23},{30,5,9}};
         BestPath bestPath = new BestPath();
         bestPath.printPath(matrix,3,3);
     }



    public void printAllPath(int matrix[][], int i, int j, int m, int n, int path[], int pi){
        if(i==m-1){
            for(int k= j ;k< n; k++){
                path[pi+k-j] = matrix[i][k];
            }
            for(int l=0;l< pi+n-j;l++){
                System.out.print(path[l]+"\t");
            }
            System.out.println();
            System.arraycopy(path, 0, allPaths[pathNumber], 0, pi+n-j);
            pathNumber = pathNumber+1;
            return;
        }

        if(j == n-1){
            for(int k = i;k< m;k++){
                path[pi+ k-i] = matrix[k][j];
            }
            for(int l=0;l< pi+m-i;l++){
                System.out.print(path[l]+"\t");
            }
            System.out.println();
            System.arraycopy(path, 0, allPaths[pathNumber], 0, pi+m-i);
            pathNumber = pathNumber+1;
            return;
        }
        path[pi] = matrix[i][j];
        printAllPath(matrix, i+1, j, m, n, path, pi+1);
        printAllPath(matrix, i, j+1, m, n, path, pi+1);
    }

    public void printPath(int matrix[][], int row, int col){
        int path[] = new int[row+col];
        allPaths =  new int[row*col][row+col];
        printAllPath(matrix,0,0,row, col, path,0);
        System.out.println("All possible path");
        int bestPath[] = allPaths[0];
        for (int i=0;i< pathNumber;i++){
            int cost = 0;
            for(int j=0;j< allPaths[0].length;j++){
                cost = cost+allPaths[i][j];
                System.out.print(allPaths[i][j]+"\t");
            }
            System.out.print("\t\t"+cost+"\t");
            allPaths[i][allPaths[0].length-1] = cost;
            System.out.println();
            if(i!=0 && bestPath[allPaths[0].length-1] > cost){
                bestPath = allPaths[i];
            }
        }

        System.out.println("Best path is :- \t"+Arrays.toString(bestPath));
    }
}
