package com.concept.java.solution;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/11/17
 * Time: 12:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class WildcardPattern {

    public static boolean wildCard(String pattern, String text){
         if(pattern.isEmpty())
                 return text.isEmpty();
         else{
             if(text.isEmpty())
                 return pattern.charAt(0) == '*' && pattern.length()==1;
             else{
                 if(pattern.charAt(0)=='?')
                     return wildCard(pattern.substring(1), text.substring(1));
                 if(pattern.charAt(0) != '*')
                     return pattern.charAt(0) == text.charAt(0) && wildCard(pattern.substring(1),text.substring(1));
                 else
                     return checkStar(pattern, text);
             }
         }
    }

    public static boolean checkStar(String pattern, String text){
        return wildCard(pattern.substring(1), text) || wildCard(pattern, text.substring(1));
    }

    public static String removeDuplicateStar(String pattern){
        for(int i = 1;i<pattern.length();i++){
            if(pattern.charAt(i) == pattern.charAt(i-1)){
               pattern = pattern.substring(0,i)+pattern.substring(i+1);
                i--;
            }
        }
        return pattern;
    }

    public static void main(String args[]){
        /*Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for(int i=0;i< testCases;i++){
            String pattern = scan.nextLine();
            String text = scan.nextLine();
            System.out.println(wildCard(removeDuplicateStar(pattern), text));
        }*/
       /* Scanner scan = new Scanner(System.in);
        scan.hasNextLine() ;*/
        getGCD(new BigInteger("245"), new BigInteger("145"));
        getLCM(245,145);
    }

    public static void getGCD(BigInteger a, BigInteger b){
       System.out.println(a.gcd(b));
        /*int i=245;
        int j = 145;
        while(j>0){
            int temp = j;
            j = i%j;
            i = temp;
        }
        System.out.println(i);*/
        BigInteger mod = new BigInteger("1000000007");
        BigInteger result = a.multiply(b).divide(a.gcd(b));
        System.out.println(result);
        System.out.println(result.mod(mod));
    }

    public static void getLCM(long a, long b){
        long i =a; long j =b;
        while(b>0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("LCM");
        System.out.println(a);
        long result = (i*j)/a;
        System.out.println(result);
        BigInteger mod = new BigInteger("1000000007");
        BigInteger re = BigInteger.valueOf(result);
        System.out.println(re.mod(mod));

    }

}
