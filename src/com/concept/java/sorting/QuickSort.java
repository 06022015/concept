package com.concept.java.sorting;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/17/16
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort extends Sort {


    public int[] sort(int input[]) {
        if (input.length > 0)
            quickSort(input, 0, input.length - 1);
        return input;
    }

    private void quickSort(int input[], int lowerIndex, int higherIndex) {
        int i = lowerIndex, j = higherIndex;
        int pivot = input[lowerIndex + (higherIndex - lowerIndex) / 2];
        while (i <= j) {
            while (input[i] < pivot)
                i++;
            while (input[j] > pivot)
                j--;
            if (i <= j) {
                swap(input, i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(input, lowerIndex, j);
        if (i < higherIndex)
            quickSort(input, i, higherIndex);
    }
}
