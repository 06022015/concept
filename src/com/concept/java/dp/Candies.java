package com.concept.java.dp;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/13/17
 * Time: 9:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Candies {

    static int candies(int n, int[] arr) {
        int candies[] = new int[n];
        candies[0] = 1;
        for(int i=1;i< n;i++){
            if(arr[i] > arr[i-1]){
                candies[i] = candies[i-1]+1;
            }else
                candies[i] = 1;
        }
        int result = candies[n-1];
        for(int i=n-2; i>=0;i--){
            if(arr[i] > arr[i+1] && candies[i] <= candies[i+1])
                candies[i] = candies[i+1]+1;
            result = result + candies[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = candies(n, arr);
        System.out.println(result);
        in.close();
    }

}
