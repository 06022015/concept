package com.concept.java.stack;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 4:34 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Stack<T> {

    void push(T input);

    T pop();
    
    int size();

    void display();

}
