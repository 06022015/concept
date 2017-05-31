package com.concept.java.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/30/17
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* Word wrap problem
*
* Given a sequence of words, and a limit on the number of characters that can be put in one line (line width).
* Put line breaks in the given sequence such that the lines are printed neatly.
* Assume that the length of each word is smaller than the line width.

*  The word processors like MS Word do task of placing line breaks.
*  The idea is to have balanced lines. In other words, not have few lines with lots of extra spaces and some lines with small amount of extra spaces.
*
* */

public class WordWrapProblem {


    /*
    * Time Complexity O(n). where n is number of words.
    * Space complexity O(n).
    * */
    public void wordWrap(String input, int lengthOfLine) {
        String words[] = input.split(" ");
        List<String> lines = new ArrayList<String>();
        int totalExtraSpace = 0;
        int totalCost = 0;
        for (int index = 0; index < words.length; index++) {
            String line = words[index];
            for (int j = index + 1; j < words.length; j++) {
                if (line.length() + words[j].length() < lengthOfLine) {
                    line = line + " " + words[j];
                    index++;
                } else {
                    break;
                }
            }
            int extraSpace = lengthOfLine - line.length();
            lines.add(line);
            totalExtraSpace = totalExtraSpace + extraSpace;
            totalCost = totalCost + (extraSpace * extraSpace * extraSpace);
        }

        for (String line : lines) {
            System.out.println(line + " extra space:- " + (lengthOfLine - line.length()));
        }
        System.out.println("Total extra space:- " + totalExtraSpace);
        System.out.println("Total cost:- " + totalCost);
    }


    /*
    * Time complexity O(n).   where n is number of words.
    * Space complexity O(n)
    * */
    public void wordWrapBestPractice(String input, int lengthOfLine) {
        String words[] = input.split(" ");
        List<List<String>> lines = new ArrayList<List<String>>();
        List<Integer> extraSpaces = new ArrayList<Integer>();
        int totalExtraSpace = 0;
        int totalCost = 0;
        for (int index = 0; index < words.length; index++) {
            List<String> line = new ArrayList<String>();
            line.add(words[index]);
            int lineLength = words[index].length();
            for (int j = index + 1; j < words.length; j++) {
                if (lineLength + words[j].length() < lengthOfLine) {
                    line.add(words[j]);
                    lineLength = lineLength + words[j].length() + 1;
                    index++;
                } else {
                    break;
                }
            }
            int extraSpace = lengthOfLine - lineLength;
            if (lines.size() > 0) {
                List<String> lastLine = lines.get(lines.size() - 1);
                String lastLineLastWord = lastLine.get(lastLine.size() - 1);
                if (extraSpace + 1 >= lastLineLastWord.length() && lineLength + lastLineLastWord.length() < lengthOfLine) {
                    line.add(0, lastLineLastWord);
                    lineLength = lineLength + lastLineLastWord.length() + 1;
                    lastLine.remove(lastLine.size() - 1);
                    extraSpaces.set(extraSpaces.size() - 1, extraSpaces.get(extraSpaces.size() - 1) + lastLineLastWord.length() + 1);
                    extraSpace = lengthOfLine - lineLength;
                }
            }
            lines.add(line);
            extraSpaces.add(extraSpace);
            totalExtraSpace = totalExtraSpace + extraSpace;
            totalCost = totalCost + (extraSpace * extraSpace * extraSpace);
        }

        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i) + " extra space:- " + extraSpaces.get(i));
        }
        System.out.println("Total extra space:- " + totalExtraSpace);
        System.out.println("Total cost:- " + totalCost);
    }


    /*
    * Time complexity O(n).   where n is number of words.
    * Space complexity O(2n)
    * */
    public void wordWrapBetterPractice(String input, int lengthOfLine) {
        String words[] = input.split(" ");
        int lines[][] = new int[words.length][2];
        int extraSpaces[] = new int [words.length];
        int totalExtraSpace = 0;
        int totalCost = 0;
        int lineIndex = 0;
        for (int index = 0; index < words.length; index++) {
            lines[lineIndex][0] = index;
            int lineLength = words[index].length();
            for (int j = index + 1; j < words.length; j++) {
                if (lineLength + words[j].length() < lengthOfLine) {
                    lineLength = lineLength + words[j].length() + 1;
                    index++;
                } else {
                    break;
                }
            }
            int extraSpace = lengthOfLine - lineLength;
            if (lineIndex > 0) {
                int lastLine[] = lines[lineIndex-1];
                int lastLineLastWordLength = words[lastLine[1]].length();
                if (extraSpace + 1 >= lastLineLastWordLength && lineLength + lastLineLastWordLength < lengthOfLine) {
                    lineLength = lineLength + lastLineLastWordLength + 1;
                    lines[lineIndex-1][1] = lines[lineIndex-1][1]-1;
                    lines[lineIndex][0] = lines[lineIndex][0]-1;
                    extraSpaces[lineIndex-1] = extraSpaces[lineIndex-1] + lastLineLastWordLength + 1;
                    extraSpace = lengthOfLine - lineLength;
                }
            }
            lines[lineIndex][1] = index;
            extraSpaces[lineIndex] = extraSpace;
            lineIndex++;
        }

        for (int i = 0; i < lineIndex; i++) {
            for(int w= lines[i][0]; w<= lines[i][1]; w++)
                System.out.print(words[w]+" ");
            System.out.println(" extra space:- " + extraSpaces[i]);
            totalExtraSpace = totalExtraSpace + extraSpaces[i];
            totalCost = totalCost + (extraSpaces[i]*extraSpaces[i]*extraSpaces[i]);
        }
        System.out.println("Total extra space:- " + totalExtraSpace);
        System.out.println("Total cost:- " + totalCost);
    }


    public static void main(String args[]) {
        //String input = "Geeks for Geeks presents word wrap problem";
        String input = "aaa bb cc ddddd";
        WordWrapProblem wordWrapProblem = new WordWrapProblem();
        wordWrapProblem.wordWrapBetterPractice(input, 6);
    }
}
