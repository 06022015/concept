package com.concept.java.solution;

import com.concept.java.Base;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/28/17
 * Time: 9:28 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* Cube Summation
*
* You are given a 3-D Matrix in which each block contains 0 initially.
* The first block is defined by the coordinate (1,1,1) and the last block is defined by the coordinate (N,N,N). There are two types of queries.
*
* UPDATE x y z W
*   updates the value of block (x,y,z) to W.
*
*    QUERY x1 y1 z1 x2 y2 z2
*    calculates the sum of the value of blocks whose x coordinate is between x1 and x2 (inclusive), y coordinate between y1
*    and y2 (inclusive) and z coordinate between z1 and z2 (inclusive).
*
*   Input Format
    The first line contains an integer T, the number of test-cases. T testcases follow.
    For each test case, the first line will contain two integers N and M separated by a single space.
    N defines the N * N * N matrix.
    M defines the number of operations.
    The next M lines will contain either

     1. UPDATE x y z W
     2. QUERY  x1 y1 z1 x2 y2 z2
    Output Format
    Print the result for each QUERY.

    Constrains
    1 <= T <= 50
    1 <= N <= 100
    1 <= M <= 1000
    1 <= x1 <= x2 <= N
    1 <= y1 <= y2 <= N
    1 <= z1 <= z2 <= N
    1 <= x,y,z <= N
    -109 <= W <= 109

    Sample Input

    2
    4 5
    UPDATE 2 2 2 4
    QUERY 1 1 1 3 3 3
    UPDATE 1 1 1 23
    QUERY 2 2 2 4 4 4
    QUERY 1 1 1 3 3 3
    2 4
    UPDATE 2 2 2 1
    QUERY 1 1 1 1 1 1
    QUERY 1 1 1 2 2 2
    QUERY 2 2 2 2 2 2

    Sample Output

    4
    4
    27
    0
    1
    1
    Explanation
    First test case, we are given a cube of 4 * 4 * 4 and 5 queries. Initially all the cells (1,1,1) to (4,4,4) are 0.
    UPDATE 2 2 2 4 makes the cell (2,2,2) = 4
    QUERY 1 1 1 3 3 3. As (2,2,2) is updated to 4 and the rest are all 0. The answer to this query is 4.
    UPDATE 1 1 1 23. updates the cell (1,1,1) to 23. QUERY 2 2 2 4 4 4. Only the cell (1,1,1) and (2,2,2) are non-zero and (1,1,1) is not between (2,2,2) and (4,4,4). So, the answer is 4.
    QUERY 1 1 1 3 3 3. 2 cells are non-zero and their sum is 23+4 = 27.
*
*
* */

public class CubeSummation extends Base {

    /*
    * Bruit force solution
    * */
    public static void main1(String args[]){
        Scanner scanner = new Scanner(System.in);
        int totalTestCase = scanner.nextInt();
        scanner.nextLine();
        for(int i=1;i<= totalTestCase;i++){
            String sizeInput = scanner.nextLine();
            int cubeSize = Integer.parseInt(sizeInput.split("\\s")[0]);
            int numberOfOperation = Integer.parseInt(sizeInput.split("\\s")[1]);
            long cube[][][] = new long[cubeSize][cubeSize][cubeSize];
            for(int op=1;op<=numberOfOperation; op++){
                String operation = scanner.nextLine();
                if(operation.contains("UPDATE")){
                    String elements[] = operation.split("\\s");
                    int x = Integer.parseInt(elements[1]);
                    int y = Integer.parseInt(elements[2]);
                    int z = Integer.parseInt(elements[3]);
                    long val = Long.parseLong(elements[4]);
                    cube[x-1][y-1][z-1] = val;
                }else if(operation.contains("QUERY")){
                    String elements[] = operation.split("\\s");
                    int x1 = Integer.parseInt(elements[1]);
                    int y1 = Integer.parseInt(elements[2]);
                    int z1 = Integer.parseInt(elements[3]);
                    int x2 = Integer.parseInt(elements[4]);
                    int y2 = Integer.parseInt(elements[5]);
                    int z2 = Integer.parseInt(elements[6]);
                    long sum =0;
                    for(int x=x1-1;x<x2;x++){
                        for(int y=y1-1;y<y2;y++){
                            for(int z=z1-1;z<z2;z++){
                                sum = sum+ cube[x][y][z];
                            }
                        }
                    }
                    System.out.println(sum);
                }
            }
        }
    }

    /*
    * Best case solution
    *
    * */

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int totalTestCase = scanner.nextInt();
        scanner.nextLine();
        for(int i=1;i<= totalTestCase;i++){
            String sizeInput = scanner.nextLine();
            int numberOfOperation = Integer.parseInt(sizeInput.split("\\s")[1]);
            Map<Cube, Long> updates = new HashMap<Cube, Long>();
            for(int op=1;op<=numberOfOperation; op++){
                String operation = scanner.nextLine();
                if(operation.contains("UPDATE")){
                    String elements[] = operation.split("\\s");
                    int x = Integer.parseInt(elements[1]);
                    int y = Integer.parseInt(elements[2]);
                    int z = Integer.parseInt(elements[3]);
                    long val = Long.parseLong(elements[4]);
                    Cube cube = new Cube(x,y,z,val);
                    updates.put(cube,val);
                }else if(operation.contains("QUERY")){
                    String elements[] = operation.split("\\s");
                    int x1 = Integer.parseInt(elements[1]);
                    int y1 = Integer.parseInt(elements[2]);
                    int z1 = Integer.parseInt(elements[3]);
                    int x2 = Integer.parseInt(elements[4]);
                    int y2 = Integer.parseInt(elements[5]);
                    int z2 = Integer.parseInt(elements[6]);
                    long sum =0;
                    for(Cube cube :  updates.keySet()){
                        if(cube.getX()>= x1 && cube.getX()<= x2
                                && cube.getY()>=y1 && cube.getY()<= y2
                                && cube.getZ() >=z1 && cube.getZ()<= z2){
                            sum = sum + updates.get(cube);
                        }
                    }
                    System.out.println(sum);
                }
            }
        }
    }


    static class Cube{
        private int x;
        private int y;
        private int z;
        private long value;

        public Cube(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public Cube(int x, int y, int z, long value){
            this.x = x;
            this.y = y;
            this.z = z;
            this.value = value;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }

        public long getValue(){
            return this.value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Cube cube = (Cube) o;

            if (x != cube.x) return false;
            if (y != cube.y) return false;
            if (z != cube.z) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            result = 31 * result + z;
            return result;
        }
    }
}
