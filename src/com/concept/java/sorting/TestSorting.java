package com.concept.java.sorting;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/17/16
 * Time: 11:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestSorting {


    public static void main(String args[]) {

        int bubble[] = {8, 4, 10, 6, 9, 2};
        System.out.println("Bubble sort test");
        Sort bubbleSort = new BubbleSort();
        System.out.println("Input");
        bubbleSort.printArray(bubble);
        bubbleSort.printArray(bubbleSort.sort(bubble));

        int quick[] = {8,4,10,6,9,2};
        System.out.println("Quick sort test");
        Sort quickSort = new QuickSort();
        System.out.println("Input");
        quickSort.printArray(quick);
        quickSort.printArray(quickSort.sort(quick));

        int heap[] = {8, 4, 10, 6, 9, 2};
        System.out.println("Heap sort test");
        Sort heapSort = new HeapSort();
        System.out.println("Input");
        heapSort.printArray(heap);
        heapSort.printArray(heapSort.sort(heap));
    }

}
