package com.concept.java.codechef;

import java.util.Scanner;

public class Worker {

    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int noOfWorker = sc.nextInt();
        int coins[] = new int[noOfWorker];
        int workers[] = new int[noOfWorker];
        for(int i=0;i< noOfWorker;i++){
            coins[i] = sc.nextInt();
        }
        for(int i=0;i< noOfWorker;i++){
            workers[i] = sc.nextInt();
        }
        int minC4T = 0, minC4A =0, minC4AT=0;
        for(int i=0;i<noOfWorker;i++){
            switch (workers[i]){
                case 1:
                    if(minC4T==0 || minC4T > coins[i])
                        minC4T = coins[i];
                    break;
                case 2:
                    if(minC4A ==0 || minC4A > coins[i])
                        minC4A = coins[i];
                    break;
                case 3:
                    if(minC4AT == 0 || minC4AT > coins[i]){
                        minC4AT = coins[i];
                    }
                    break;
            }
        }
        System.out.println(Math.min(minC4T+minC4A,minC4AT));
    }
}
