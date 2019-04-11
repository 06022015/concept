package com.concept.java.matrix;

public class MatrixZigZagForm {

    public static void zigzag(int input[][]){
        int i=0,j=0, m=input.length, n= input.length;
        boolean isRight = true;
            while(j>=0 && j<n && i<m){
                System.out.println(input[i][j]);
                if(isRight){
                    if(j==n-1){
                        isRight = !isRight;
                        i++;
                    }else
                        j++;
                }
                else{
                    if(j==0){
                        isRight = !isRight;
                        i++;
                    }else
                        j--;
                }
            }
    }

    public static void zigzag1(int input[][]){
        boolean down=false;
        int i=0,j=0, m=input.length,n=input.length;
        while(i<m && j<n){
            System.out.print(input[i][j]+ "\t");
            if(down){
                if(j==0 && i<m-1){
                    i++;
                    down = false;
                }else{
                    if(i==m-1){
                        down = false;
                        j++;
                    }else{
                        j--;
                        i++;
                    }
                }
            }else {
                if(i==0 && j<n-1) {
                    j++;
                    down=true;
                }else{
                    if(j==n-1){
                        down = true;
                        i++;
                    }else{
                        i--;
                        j++;
                    }
                }
            }

        }

    }

    public static void main(String args[]){
        int input[][] = {
                        {1,2,3,13},
                        {4,5,6,14},
                        {7,8,9,15},
                        {10,11,12,16}
                        };
        zigzag1(input);
    }

}
