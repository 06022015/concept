package com.concept.java.sorting;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/17/16
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class HeapSort extends Sort {

    public int[] sort(int input[]) {
        heapify(input);
        for (int i = input.length - 1; i >= 0; i--) {
            swap(input, 0, i);
            maxHeap(input, 0, i);
            //minHeap(input, 0, i);
        }
        return input;
    }

    private void heapify(int input[]) {
        for (int i = input.length / 2; i >= 0; i--)
            maxHeap(input, i, input.length);
            //minHeap(input, i, input.length);
    }

    private void maxHeap(int input[], int currentIndex, int length) {
        int left = 2 * currentIndex;
        int right = 2 * currentIndex + 1;
        int max = currentIndex;
        if (left < length && input[left] > input[max])
            max = left;
        if (right < length && input[right] > input[max])
            max = right;
        if (max != currentIndex) {
            swap(input, currentIndex, max);
            maxHeap(input, max, length);
        }
    }

    private void minHeap(int input[], int currentIndex, int length) {
        int left = 2 * currentIndex;
        int right = 2 * currentIndex + 1;
        int min = currentIndex;
        if (left < length && input[left] < input[min])
            min = left;
        if (right < length && input[right] < input[min])
            min = right;
        if (min != currentIndex) {
            swap(input, currentIndex, min);
            minHeap(input, min, length);
        }
    }
}
