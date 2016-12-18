package com.concept.java.sorting;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/17/16
 * Time: 11:39 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Sort {

    public abstract int[] sort(int input[]);


    protected void swap(int input[], int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    protected void printArray(int input[]) {
        for (int anInput : input)
            System.out.print(anInput + "  ");
        System.out.println();
    }

}
