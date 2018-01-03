package com.oracle;

import java.util.Arrays;
import java.util.Stack;

public class Test1 {

    public static int[] mergeArray(int a1[], int a2[]){
        int len1 = a1.length;
        if(len1==0)
            return a2;
        int len2 = a2.length;
        if(len2==0)
            return a1;
        int len = len1+len2;
        int res[] = new int[len1+len2];
        int in1 = 0;
        int in2 = 0;
        for(int i=0;i< len;i++){
            if(((in1 < len1 && in2< len2 && a1[in1] <= a2[in2]))){
                res[i] = a1[in1];
                    in1++;
            }else if(in2 < len2){
                res[i] = a2[in2];
                    in2++;
            }else if(in1 < len1){
                res[i] = a1[in1];
                in1++;
            }
        }
        return res;
    }

    public static void main(String args[]){
        int a2[] = {2,4,6,7,9};
        int a1[] = {1,5,10};
        int res[] = mergeArray(a1,a2);
        System.out.print(Arrays.toString(res));
    }

    public static void queue(){
        Queue c = null;
        try {
            c.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }


}
