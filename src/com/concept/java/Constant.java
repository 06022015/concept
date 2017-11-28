package com.concept.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/14/16
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class Constant {


   public void temp(String dates[]){
       String PROVDE_DATE_FORMAT = "dd-MMM-yyyy";
       String EXPECTED_DATE_FORMAT = "YYYY-MM-dd";
       String formated[] = new String[dates.length];
       int i=0;
       for(String date : dates){
           date = date.replace(" ", "-");
           date = date.replace("st","");
           date = date.replace("nd","");
           date = date.replace("th","");

           SimpleDateFormat inputFormat = new SimpleDateFormat(PROVDE_DATE_FORMAT);
           try {
               Date dt = inputFormat.parse(date);
               SimpleDateFormat outputFormat = new SimpleDateFormat(EXPECTED_DATE_FORMAT);
               date = outputFormat.format(dt);
               formated[i] = date;
               i++;
           } catch (ParseException e) {
              e.printStackTrace();
           }
            System.out.println(date);

       }

   }
    
    public void temp1(String dates[]){
        String PROVDE_DATE_FORMAT = "dd-MMM-yyyy";
        String EXPECTED_DATE_FORMAT = "yyyy-MM-dd";
        String formated[] = new String[dates.length];
        int i=0;
        for(String date : dates){
            date = date.replace(" ", "-");
            date = date.replace("st","");
            date = date.replace("nd","");
            date = date.replace("th","");

            SimpleDateFormat inputFormat = new SimpleDateFormat(PROVDE_DATE_FORMAT);
            try {
                Date dt = inputFormat.parse(date);
                SimpleDateFormat outputFormat = new SimpleDateFormat(EXPECTED_DATE_FORMAT);
                date = outputFormat.format(dt);

            } catch (ParseException e) {

            }
            formated[i] = date;
            i++;
            System.out.println(date);

        }
    }
   
    
    public static void main(String args[]){
        /*public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int testCases = scn.nextInt();
            for (int i = 0; i < testCases; i++) {
                int arraySize = scn.nextInt();
                BigInteger lcm = new BigInteger("1");
                BigInteger m = new BigInteger("1000000007");
                for (int j = 0; j < arraySize; j++) {
                    BigInteger input = scn.nextBigInteger();
                    BigInteger gcd = lcm.gcd(input);
                    lcm = lcm.multiply(input).divide(gcd);
                }
                System.out.println(lcm.mod(m));
            }
        }*/
    }
    
    

}
