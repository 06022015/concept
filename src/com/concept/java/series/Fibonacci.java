package com.concept.java.series;

public class Fibonacci {

    public static long fibonacciRecur(int n){
        if(n==0 || n==1)
            return 1l;
        return fibonacciRecur(n-1)+fibonacciRecur(n-2);
    }

    public static long fibonacciLoop1(int n){
        long s1 = 1, s2=1;
        for(int i=2;i<=n;i++){
            long l = s1+s2;
            s1=s2;
            s2=l;
        }
        return s2;
    }

    public static long fibonacciLoop2(int n) {
        if (n == 0 || n == 1) return 1;
        long[] cache = new long[n + 1];
        cache[0] = cache[1] = 1;
        for (int i = 2; i <= n; i++) {
            long l = cache[i - 1];
            long r = cache[i - 2];
            cache[i] = l + r;
        }

        return cache[n];
    }

    public static void main(String args[]){
        System.out.println(fibonacciRecur(10));
        System.out.println(fibonacciLoop1(10));
        System.out.println(fibonacciLoop2(10));
    }


}
