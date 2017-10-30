package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/13/17
 * Time: 10:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class WordBreakProb {
    
    private String dictionary[] = {"i","like","ice","cream","icecream","sam","samsung", "sung","man", "mango", "and","go","mobile"};
    
    public  boolean dictionaryContain(String word){
        for(String w : dictionary){
            if(w.compareTo(word)==0)
                return true;
        }
        return false;
    }

    public boolean wordBreak(String word){
        int size  = word.length();
        if(size == 0)
            return true;
        boolean visited[] = new boolean[size+1];
        for(int i=1;i<= size;i++){
            if(!visited[i] && dictionaryContain(word.substring(0,i)))
                visited[i] = true;
            if(visited[i]){
                if(i==size)
                    return true;
                for(int j=i+1;j<= size;j++){
                    if(!visited[j] && dictionaryContain(word.substring(i,j+1)))
                        visited[j]=true;
                    if(j==size && visited[j])
                        return true;
                }
            }
        }
        return false;
    }
    
    
    public boolean wordBreak2(String word){
        int size  = word.length();
        if(size == 0)
            return true;
        int i=0;
        for(int j=i+1;j<=size;j++){
            if(dictionaryContain(word.substring(i,j))){
                i=j;
                if(i==size)
                    return true;
            }
        }
        /*for(int i=0;i< size;i++){
            for(int j=i+1;j<=size;j++){
                if(dictionaryContain(word.substring(i,j))){
                    i=j;
                    if(i==size)
                        return true;
                }
            }
        }*/
        return false;
    }

    public static void main(String args[]){
        WordBreakProb wbp = new WordBreakProb();
        System.out.println(wbp.wordBreak2("ilikesamsung"));
        System.out.println(wbp.wordBreak2("iiiiiiii"));
        System.out.println(wbp.wordBreak2(""));
        System.out.println(wbp.wordBreak2("ilikelikeimangoiii"));
        System.out.println(wbp.wordBreak2("samsungandmango"));
        System.out.println(wbp.wordBreak2("samsungandmangok"));
        /*System.out.println(wbp.wordBreak("is"));
        System.out.println(wbp.wordBreak2("ilikesamsung"));
        System.out.println(wbp.wordBreak("iiiiiiii"));
        System.out.println(wbp.wordBreak(""));
        System.out.println(wbp.wordBreak("ilikelikeimangoiii"));
        System.out.println(wbp.wordBreak("samsungandmango"));
        System.out.println(wbp.wordBreak("samsungandmangok"));*/
    }
}
