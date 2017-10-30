package com.concept.java.arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/10/17
 * Time: 11:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class MinNumOfJumps {


    public static int findMinNumJumps(int input[]) {
        if (input.length <= 1)
            return 0;
        if (input[0] == 0)
            return -1;
        int maxReach = input[0];
        int step = input[0];
        int jump = 1;
        int n = input.length;
        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jump;
            maxReach = Math.max(maxReach, i + input[i]);
            step--;
            if (step == 0) {
                System.out.println(input[i]);
                jump++;
                if (i >= maxReach)
                    return -1;
                step = maxReach - i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int input[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(findMinNumJumps(input));
    }
}
