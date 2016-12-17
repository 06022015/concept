package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/17/16
 * Time: 7:49 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* The Stock Span Problem
*
*   The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate span of stock’s price for all n days.
*   The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
*   For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}
* */

public class StockSpanProblem {
    
    public int[] getSpan(int stock[]){
        int span[] = new int[stock.length];
        for(int index=0;index<stock.length;index++){
            int sum = 1;
            if(index>=0){
                for(int j=index-1;j>=0;j--){
                    if(stock[index]>stock[j]){
                        sum++;
                    }else
                        break;
                }
            }
            span[index]=sum;
        }
        return span;
    }

    public void printData(int input[]){
        for (int anInput : input) 
            System.out.print(anInput + "  ");
        System.out.println();
    }
    
    public static void main(String args[]){
        StockSpanProblem stockSpanProblem = new StockSpanProblem();
        System.out.println("Test Case:-1");
        int stock[] = {100,80,60,70,60,75,85};
        stockSpanProblem.printData(stockSpanProblem.getSpan(stock));

        System.out.println("Test Case:-2");
        int stock1[] = {10,4,5,90,120,80};
        stockSpanProblem.printData(stockSpanProblem.getSpan(stock1));
    }
    
    
}
