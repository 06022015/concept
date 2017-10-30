package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/11/17
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */


/*
* Given a range L to R, the task is to find the highest occurring digit in prime numbers lie between L and R (both inclusive).
* If multiple digits have same highest frequency print the largest of them. If no prime number occurs between L and R, output -1.
*
* */
public class MaxDigitInPrime {
    
    public boolean isPrime(int num){
        int count = 0;
        for(int i=2;i<= num/2; i++){
            if(num%i==0)
                count++;
        }
        return count==0;
    }
    
    public int maxDigitInPrime(int start, int end){
        int freq[] = new int[10];
        for(int i=start; i<= end;i++){
            if(isPrime(i)){
                System.out.println("Prime number:- "+ i);
                int p = i;
                while(p!=0){
                    freq[p%10]++;
                    p = p/10;
                }
            }
        }
        int maxCount = freq[0];
        int maxCountIndex = 0;
        for(int i=1;i<10;i++){
            if(freq[i]>maxCount){
                maxCount= freq[i];
                maxCountIndex = i;
            }
        }
        return maxCountIndex;
    }
    
    public static void main(String args[]){
        MaxDigitInPrime maxDigitInPrime = new MaxDigitInPrime();
        System.out.println(maxDigitInPrime.maxDigitInPrime(10,100));
    }
}
