package com.concept.java.temp;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/3/17
 * Time: 9:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class DemoThread extends Thread {
    private int x = 2;
    public static void main(String[] args) throws Exception {
       // new DemoThread().method();

        String s8 = "AB";
        String s9 = s8.intern();
        if(s9.equals(s8) && s9 == s8)
            System.out.println("All Equal");
        if(s9.equals(s8) && s9!=s8)
            System.out.println("equals Equal");
        if(!s9.equals(s8) && s9==s8)
            System.out.println("== Equal");
        if(!s9.equals(s8) && s9!=s8)
            System.out.println("Nothing Equal");
    }
    public DemoThread(){
        System.out.println("test");
        x = 5;
        start();
    }
    public void method() throws Exception {
        join();
        x = x - 1;
        System.out.println(x);
    }
    public void run(){
        System.out.println("run");
        x *= 2;
    }


}
