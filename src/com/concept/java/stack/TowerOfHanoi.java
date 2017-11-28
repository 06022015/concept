package com.concept.java.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 11/26/17
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class TowerOfHanoi {

    public static Stack<Integer> toh(Stack<Integer> src){
        Stack<Integer> dst = new Stack<Integer>();
        Stack<Integer> aux = new Stack<Integer>();
        dst.push(src.pop());
        while(!src.isEmpty()){
            int top = src.pop();
            if (dst.peek() > top){
                dst.push(top);
            }else {
                aux.push(top);
                while(!dst.isEmpty() || dst.peek() < src.peek()){
                    src.push(dst.pop());
                }
                while(!dst.isEmpty() || dst.peek()< aux.peek()){
                    aux.push(dst.pop());
                }
            }
            while(!aux.isEmpty() && (dst.isEmpty() ||  aux.peek()< dst.peek())){
                dst.push(aux.pop());
            }

        }



        return dst;
    }


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int noT = s.nextInt();
        for(int i=0;i<noT;i++){
            String text = s.nextLine();
            int count = 0;
            Stack<Character> st = new Stack<Character>();
            for(char c : text.toCharArray()){
                if(c== '('){
                    st.push(c);
                }else {
                    if(!st.isEmpty() && st.peek() =='('){
                        st.pop();
                        count = count+2;
                    }else
                        st.push(c);
                }
            }
            System.out.println(count);
        }
    }


}
