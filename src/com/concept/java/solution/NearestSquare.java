package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/19/17
 * Time: 11:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class NearestSquare {


    public int findNearestSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        int sqrValue = sqrt * sqrt;
        int nextSquareValue = (sqrt + 1) * (sqrt + 1);
        int diffWithMax = nextSquareValue - number;
        int diffWithMin = number - sqrValue;
        return diffWithMax > diffWithMin ? sqrValue : nextSquareValue;
    }

    public static void main(String args[]) {
        NearestSquare nearestSquare = new NearestSquare();
        System.out.println("Nearest square number is:- " + nearestSquare.findNearestSquare(46));
    }
}
