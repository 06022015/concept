package com.concept.java.solution;

public class FindMinDist {


    public static int minDist(String input, char x, char y){
        int minDist = Integer.MAX_VALUE;
        int xIn = -1, yIn =-1;
        for(int i=0;i< input.length();i++){
            if(x == input.charAt(i) || y == input.charAt(i)){
                if(x==input.charAt(i)){
                        xIn = i;
                }else{
                    yIn = i;
                }
                if(xIn>-1 && yIn>-1 && yIn >=xIn && minDist>= yIn-xIn)
                    minDist = yIn-xIn;
            }
        }
        return minDist == Integer.MAX_VALUE?-1:minDist;
    }

    public static void  main(String args[]){
        System.out.println(minDist("xcdgfavfgdg", 'a','e'));
        System.out.println(reverse("abcdefgh", 0));

    }

    public static String reverse(String input, int index){
        return index<input.length()?reverse(input,index+1)+input.charAt(index):"";
    }

}
