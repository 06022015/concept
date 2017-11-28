package com.concept.java.temp;

import com.concept.java.Base;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/3/17
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Temp extends Base {

    public int a =9;

    public void printVal() {
        System.out.print("Base");
    }

    public static void main1(String[] args){
        Base temp = new Temp();
        System.out.println(temp.a);
        temp.printVal();



        int[][] data = {{123},{4,5,6}};
        int[][] copy = data.clone();

        //temp.printArray(copy);
        //copy[0][0] = 100;
        //temp.printArray(data);

        //System.out.println(data[0][0]);
        //System.out.println(copy[0][0]);

        copy[1] = new int[]{300,400,500};

        //temp.printArray(copy);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //temp.printArray(data);

        //System.out.println(data[1][1]);
        //System.out.println(copy[1][1]);
    }





        public static void main2(String[] args)throws InterruptedException {
            final CountDownLatch latch = new CountDownLatch(3);
            latch.countDown();
            latch.countDown();
            new Thread(){
                public void run(){
                    try{
                        Thread.sleep(3000);
                    }catch(InterruptedException ex){
                        ex.printStackTrace();
                    }
                    latch.countDown();
                };
            }.start();
            System.out.println("Before");
            latch.await();
            System.out.println("After");
        }

        public static void main3(String[] args){
            Set shortSet = new HashSet();
            /*for(short i = 0; i < 100; i++){
                shortSet.add(i);
                shortSet.remove(i-1);
                shortSet.remove((short)(i-1));
            }
            System.out.println(shortSet);
            Temp temp = new Temp();
            Node root = new Node(1);
            root.next = new Node(2);
            root.next.next = new Node(3);
            root.next.next.next = new Node(4);
            root.next.next.next.next = new Node(5);
            root.next.next.next.next.next = new Node(6);
            temp.printList(root);
            Node node = revers(root);
            temp.printList(node);
            node = revers(root, 3);
            temp.printList(node);*/

            //System.out.println(maxPalindrome("forgeeksskeegfor"));
            //System.out.println(maxPalindrome("aabaaaabaa"));

            System.out.println(maxPalindromeOpt("forgeeksskeegfor"));
            System.out.println(maxPalindromeOpt("a"));
            System.out.println(maxPalindromeOpt("aa"));
            System.out.println(maxPalindromeOpt("aaaa"));
            System.out.println(maxPalindromeOpt("aab"));
            System.out.println(maxPalindromeOpt("aaba"));
            System.out.println(maxPalindromeOpt("aabaa"));
            System.out.println(maxPalindromeOpt("aabaaaabaa"));
            System.out.println(maxPalindromeOpt("aabafabaa"));
            System.out.println(maxPalindromeOpt("aabafabaaq"));
        }

    
    
    public static String maxPalindrome(String input){
        if(null == input || input.equals(""))
            return "";
        /*String result = input.substring(0,1);
        if(input.length()==1){
            return result;
        }*/
        int start = 0, end =1;
        String result = "";
        for(int i = 0; i< input.length()-1; i++){
            int low = i;
            int high = i;
            while(high< input.length()-1 && input.charAt(low) == input.charAt(high+1)){
                    high =high+1;
            }
            if((low-1)>= 0 && (high+1)< input.length()-1 && input.charAt(low-1) == input.charAt(high+1)){
                low = low-1;
                high = high+1;
            }
            String text = "";//input.substring(low, high+1);
            while(low>=0 && high< input.length() && low != high && input.charAt(low) == input.charAt(high)){
                    text = input.substring(low, high+1);
                    low = low-1;
                    high = high+1;
            }
            if(result.length() < text.length()){
               result = text;
            }
            /*String text = getText(input, i);
            if(text.length()> result.length()){
                result = text;
            }*/
        }
        return result;//input.substring(start, end);
    }


    public static String maxPalindromeOpt(String input){
        if(null == input || input.equals(""))
            return "";
        int start = 0, end =1;
        for(int i = 0; i< input.length()-1; i++){
            int low = i;
            int high = i;
            while(high< input.length()-1 && input.charAt(low) == input.charAt(high+1)){
                high =high+1;
            }
            low = low-1;
            high = high+1;
            while(low>=0 && high< input.length()  && input.charAt(low) == input.charAt(high)){
                low = low-1;
                high = high+1;
            }
            if(end-start < high-(low+1)){
                start = low+1;
                end = high;
            }
        }
        return input.substring(start, end);
    }
    
    public static String getText(String input, int index){
        String text = input.substring(index, index+1);
        if(input.charAt(index) == input.charAt(index+1)){

        }
        int start = index-1;
        int end = index+1;
        while(start>=0 && end< input.length()){
                if(input.charAt(start) == input.charAt(end)){
                    text = input.substring(start, end+1);
                    start = start-1;
                    end = end+1;
                }else{
                    break;
                }
        }
        return text;
    }
    
    
    public static Node revers(Node root, int k){
        if(null == root)
            return root;
        Node current = root;
        Node next = null;
        Node prev = null;
        Node head = null;
        int index = 0;
        while(null != current && index< k){
            next = current.next;
            current.next = prev;
            prev = current;
            if(null == head)
                head = prev;
            current = next;
            index++;
        }
        if(null != head)
            head.next = current;
        return prev;
    }
    
    public  static  Node revers(Node root){
        if(null == root)
            return  root;
        Node current = root;
        Node next = null;
        Node prev = null;
        while(null != current){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return  prev;
    }

    public class TrickyNum<X extends Number> {
        private X x;
        public TrickyNum(X x){
            this.x = x;
        }
        private double getDouble(){
            return x.doubleValue();
        }
        public  void main(String[] args) {
            TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
            System.out.println(a.getDouble());
        }
    }





    public static long getGCD(long a, long b){
        while(b>0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static long getLCM(long a, long b){
        long gcd = getGCD(a,b);
        System.out.println("GCD:- "+ gcd);
        long lcm = (a*b)/gcd;
        System.out.println("LCM:- "+ lcm);
        return lcm;
    }

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();
        for (int i = 0; i < N; i++) {
            int noOfF = s.nextInt();
            s.nextLine();
            long result = 1;
            for(int j = 0; j< noOfF; j++){
                long input = s.nextLong();
                result = getLCM(result, input);
            }
            /*BigInteger m = new BigInteger("1000000007");
            BigInteger lcm =  BigInteger.valueOf(result);
            System.out.println(lcm.mod(m));*/
            System.out.println(result);
        }
        /*Scanner scn = new Scanner(System.in);
		int testCases = scn.nextInt();

		for (int i = 0; i < testCases; i++) {
			int arraySize = scn.nextInt();
			BigInteger lcm = new BigInteger("1");
			BigInteger m = new BigInteger("1000000007");

			for (int j = 0; j < arraySize; j++) {
				BigInteger input = scn.nextBigInteger();

				BigInteger gcd = lcm.gcd(input);

				lcm = lcm.multiply(input).divide(gcd);
			}

			//System.out.println(lcm.mod(m));
			System.out.println(lcm);*
		}*/
    }
    

}
