package com.concept.java.arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/12/17
 * Time: 8:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class CompatibilityDiff {

    public static int comDiff(int a1[], int a2[]){
        int res =0;
        for(int i =0; i< a1.length;i++){
            if(a1[i] != a2[i]){
                int j=i+1;
                while(a1[i] != a2[j]){
                    j++;
                }
                while(j!=i){
                    int temp = a2[j-1];
                    a2[j-1] = a2[j];
                    a2[j] = temp;
                    res++;
                    j--;
                }
            }
        }
        return res;
    }

    public static void main(String args[]){
        int a1[] ={5,3,1,2,4};
        int a2[] ={3,1,2,4,5};
        System.out.println(comDiff(a1,a2));
    }

}
