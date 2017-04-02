package com.concept.java.stack;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 4:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class StackCustom<T> implements Stack<T>{
    
    private static int INITIAL_SIZE = 10;
    public int size=0;
    public Object[]  data =null;

    public StackCustom(){
        this.data = new Object[INITIAL_SIZE];
    }

    @Override
    public void push(T input) {
        if(this.size == data.length){
            Object[] temp = this.data;
            data = new Object[this.data.length+INITIAL_SIZE];
            System.arraycopy(temp,0,this.data, 0, this.size);
        }
        this.data[this.size] = input;
        this.size++;
    }

    @Override
    public T pop() {
        if(this.size>0){
            Object pop = this.data[this.size-1];
            this.data[this.size-1]=null;
            size--;
            return (T)pop;
        }
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void display() {
        for(int i=0;i<this.size;i++){
            System.out.println(this.data[i].toString());
        }
    }
}
