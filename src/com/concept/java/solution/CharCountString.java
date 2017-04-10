package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/9/17
 * Time: 11:25 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* Char counting. find 1st max char ina string based on the input order.
* */

public class CharCountString {

    public static void main(String[] args) {
        System.out.println(findFirstCharMaxKTimes("hello world"));
        System.out.println(findFirstCharMaxKTimes("ho lloh"));
    }

    public static char findFirstCharMaxKTimes(String s) {
        int[] charCount = new int[256];
        char[] c = s.toCharArray();
        int max = 1;
        char firstMax = c[0];
        int firstIdxOfMax = 0;
        charCount[c[0]]++;
        for (int i = 1; i < c.length; i++) {
            charCount[c[i]]++;
            if (charCount[c[i]] >= max) {
                int firstIdxChar = s.indexOf(c[i]);
                if (charCount[c[i]] > max || (charCount[c[i]] == max && firstIdxChar < firstIdxOfMax)) {
                    max = charCount[c[i]];
                    firstMax = c[i];
                    firstIdxOfMax = firstIdxChar;
                }
            }
        }
        return firstMax;
    }
}
