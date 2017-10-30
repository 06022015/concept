package com.concept.java.design.prob;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/13/17
 * Time: 7:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintEvenOdd {
    
    public static void main(String args[]){
        Printer printer = new  Printer();
        Thread even = new Thread(new TaskEvenOdd(printer, 10, true));
        Thread odd = new Thread(new TaskEvenOdd(printer, 10, false));
        even.start();
        odd.start();
    }
    
    static class TaskEvenOdd implements Runnable{

        private Printer printer;
        private int max;
        private boolean isEven;

        private TaskEvenOdd(Printer printer, int max, boolean even) {
            this.printer = printer;
            this.max = max;
            isEven = even;
        }

        @Override
        public void run() {
             int number = isEven?0:1;
            while(number<= this.max){
                if(this.isEven)
                    this.printer.printEven(number);
                else
                    this.printer.printOdd(number);
                number+=2;
            }
        }
    }
    
   static class Printer {
        
        private boolean isEven = true;
        
        synchronized void printEven(int number){
            while(!isEven){
                try{
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even:- " +number);
            isEven = false;
            notifyAll();
        }

        synchronized void printOdd(int number){
            while (isEven){
                try{
                    wait();
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
            System.out.println("Odd:- "+ number);
            isEven = true;
            notify();
        }
    }
}
