package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/9/17
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* Nuts & Bolts Problem (Lock & Key problem)
*
* http://www.geeksforgeeks.org/nuts-bolts-problem-lock-key-problem/
* */

public class NutsBoltsProblem extends Base {

    public void matchPair(int nuts[], int bolts[]) {
        matchPair(nuts, bolts, 0, nuts.length - 1);
    }

    private void matchPair(int nuts[], int bolts[], int low, int high) {
        if (low < high) {
            int pivot = partition(nuts, low, high, bolts[high]);
            partition(bolts, low, high, nuts[pivot]);
            matchPair(nuts, bolts, low, pivot - 1);
            matchPair(nuts, bolts, pivot + 1, high);
        }
    }


   /* private int partition1(int input[], int low, int high, int pivot) {
        int i = low, j = high;
        while (i <= j) {
            while(input[i]<pivot)
                i++;
            while(input[j]>pivot)
                j--;
            if(i<=j){
                swap(input,i,j);
                i++;
                j--;
            }
        }
        return i;
    }*/

    private int partition(int input[], int low, int high, int pivot) {
        int i = low, j = low;
        while (j < high) {
            if (input[j] < pivot) {
                swap(input, i, j);
                i++;
            } else if (input[j] == pivot) {
                swap(input, j, high);
                j--;
            }
            j++;
        }
        swap(input, i, high);
        return i;
    }

    public static void main(String args[]) {
        NutsBoltsProblem nutsBoltsProblem = new NutsBoltsProblem();
        int nuts[] = {4, 6, 7, 8, 2};
        int bots[] = {2, 7, 4, 6, 8};
        nutsBoltsProblem.matchPair(nuts, bots);
        nutsBoltsProblem.printArray(nuts);
        System.out.println();
        nutsBoltsProblem.printArray(bots);
    }
}
