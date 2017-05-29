package com.concept.java.arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/29/17
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */

/*
* Count number of occurrence in a sorted array.
*
* Three ways to do it
*
* 1. Linear search with time complexity O(n).
* 2. Binary Linear search with time complexity O(Log n +s) where s is the number of occurrence.
* 3. Binary search with time complexity O(Log n).
*
* */
public class CountOccurrenceOfElements {


    /*
    * Linear search time complexity O(n).
    *
    * */

    public int linearSearch(int input[], int k) {
        int result = 0;
        for (int in : input) {
            if (in == k) {
                result++;
            }
        }
        return result;
    }

    /*
    * Binary search Time complexity O(Log(n) + s). S is the number of occurrence.
    * */
    public int binaryLinearSearch(int input[], int k) {
        int index = search(input, 0, input.length - 1, k);
        if (index == -1)
            return 0;
        int leftCount = 0;
        if ((index - 1) > 0) {
            for (int i = index - 1; i >= 0; i--) {
                if (input[i] == k)
                    leftCount++;
                else
                    break;
            }
        }
        int rightCount = 0;
        if ((index + 1) < input.length) {
            for (int i = index + 1; i < input.length; i++) {
                if (input[i] == k)
                    rightCount++;
                else
                    break;
            }
        }
        return leftCount + rightCount+1;
    }

    private int search(int input[], int low, int high, int k) {
        if (high < low)
            return -1;

        int mid = (low + high) / 2;
        if (input[mid] == k) {
            return mid;
        } else if (k < input[mid])
            return search(input, low, mid - 1, k);
        else
            return search(input, mid + 1, high, k);
    }


    /*
    * Binary search Time complexity O(Log n).
    * */
    public int binarySearch(int input[], int k) {
        int firstOccurrence = searchFirst(input, 0, input.length, k);
        int lastOccurrence = searchLast(input, 0, input.length, k);
        if (firstOccurrence == -1 && lastOccurrence == -1)
            return 0;
        return lastOccurrence - firstOccurrence + 1;
    }

    private int searchFirst(int input[], int low, int high, int k) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if ((mid == 0 && input[mid] == k) || (input[mid] == k && input[mid - 1] < k)) {
            return mid;
        } else if (k <= input[mid]) {
            return searchFirst(input, low, mid - 1, k);
        } else {
            return searchFirst(input, mid + 1, high, k);
        }
    }

    private int searchLast(int input[], int low, int high, int k) {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if ((mid == input.length-1 && input[mid] == k) || (input[mid] == k && input[mid + 1] > k)) {
            return mid;
        } else if (k >= input[mid]) {
            return searchLast(input, mid + 1, high, k);
        } else {
            return searchLast(input, low, mid - 1, k);
        }
    }

    public static void main(String args[]) {
        int input[] = {1,1,2,2,2,4,4,4,5,5,6,6,6,6,7,7,7};
        CountOccurrenceOfElements countOccurrence = new CountOccurrenceOfElements();
        System.out.println("Linear search result:- " + countOccurrence.linearSearch(input, 4));
        System.out.println("Binary Linear search result:- " + countOccurrence.binaryLinearSearch(input, 7));
        System.out.println("Binary search result:- " + countOccurrence.binarySearch(input, 4));
    }
}
