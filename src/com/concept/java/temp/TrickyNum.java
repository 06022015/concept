package com.concept.java.temp;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/3/17
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class TrickyNum <X extends Number> {
    private X x;
    public TrickyNum(X x){
        this.x = x;
    }
    private double getDouble(){
        return x.doubleValue();
    }
    public static void main(String[] args) {
        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
        System.out.println(a.getDouble());
    }




}
