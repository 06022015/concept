package com.concept.java.solution;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 9/30/17
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class XlsColumn {

    public static String printColumn(int num){
        if(num<=0)
            return "";
        if(num<=26)
            return String.valueOf((char)(num + 64));
        return printColumn(num/26)+String.valueOf((char)(num%26 + 64));
    }

    public static void printXLSColumnName(Integer num){
        String result = "";
        while(num > 0){
            Integer remain = num%26;
            num = (num/26)-1;
            if(0 == remain)
                remain = remain+26;
            result = String.valueOf((char)(remain + 64))+ result;
        }
        System.out.print(result);
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer inSize = scan.nextInt();
        scan.nextLine();
        for(int i=0; i< inSize; i++){
            Integer num = scan.nextInt();
            //printXLSColumnName(num);
            System.out.println(printColumn(num));
            scan.nextLine();
        }
    }

}
