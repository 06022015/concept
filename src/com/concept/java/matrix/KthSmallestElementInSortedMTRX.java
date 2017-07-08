package com.concept.java.matrix;

import com.concept.java.Base;
import com.concept.java.sorting.HeapSort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/14/17
 * Time: 9:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class KthSmallestElementInSortedMTRX extends Base {
    
    
    public int find(int matrix[][], int k){
        int length = matrix.length;
        List<Integer> kList = new ArrayList<Integer>(k);
        //kList.add(matrix[0][0]);
        int index = 0;
        while(index<length){
            for(int j=0;j<index;j++){
                if(matrix[j][index]<matrix[index][j]){
                    kList.add(matrix[j][index]);
                    kList.add(matrix[index][j]);
                }else{
                    kList.add(matrix[index][j]);
                    kList.add(matrix[j][index]);
                }
            }
            kList.add(matrix[index][index]);
            index++;
        }
        return kList.get(k-1);
    }


    public int findByHeap(int matrix[][], int k){
        int kElements[] = new int[k];
        int index = 0;
        int row = 0;
        HeapSort heapSort = new HeapSort();
        while(index<k){
            for(int j=0;j< row;j++){
                if(index<k-1){
                    kElements[index] = matrix[row][j];
                    index++;
                    kElements[index] = matrix[j][row];
                    index++;
                }else if(index<k){
                    kElements[index] = matrix[j][row];
                    heapSort.sort(kElements);
                    if(matrix[row][j]< kElements[index]){
                        kElements[index] = matrix[row][j];
                    }
                    index++;
                }else{
                    if(matrix[row][j]< kElements[index-1])
                        kElements[index-1] = matrix[row][j];
                    if(matrix[j][row]< kElements[index-1])
                        kElements[index-1] = matrix[j][row];
                }
            }
            if(index<k){
                kElements[index] = matrix[row][row];
                index++;
                row++;
            }if(index>=k){
                heapSort.sort(kElements);
            }
        }
        return kElements[k-1];
    }
    
    public static void main(String args[]){
        KthSmallestElementInSortedMTRX kthSmallestElementInSortedMTRX = new KthSmallestElementInSortedMTRX();
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{24,29,37,48},{32,33,39,50}};
        kthSmallestElementInSortedMTRX.printArray(matrix);
        System.out.println();
        System.out.println(kthSmallestElementInSortedMTRX.findByHeap(matrix, 8));
    }
}
