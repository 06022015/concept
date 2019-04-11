package com.concept.java.temp;

public class Booking {


    public static void i2c(int num){
        int n = num<0?-num:num;
        char sign = num>=0?'+':'-';
        StringBuilder res = new StringBuilder();
        while(n>=10){
            char c = (char)(n%10+'0');
            res.insert(0,c);
            n = n/10;
        }
        res.insert(0,n);
        res.insert(0,sign);
        System.out.println(res.toString());
    }

    public static long fbbnoci(int n){
        long s1 = 1, s2=1;
        for(int i=2;i<=n;i++){
            long l = s1+s2;
            s1=s2;
            s2=l;
        }
        return s2;
    }

    public static long fibonacciLoopII(int n) {
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
        i2c(1000);
        System.out.println(fbbnoci(499));
        System.out.println(fibonacciLoopII(499));
    }

}
