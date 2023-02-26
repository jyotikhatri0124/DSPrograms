package org.example;

import java.util.TreeSet;

public class Test1 {


    //    Given an integer array, rearrange it such that every second element becomes greater than its left and right elements.
    //    Assume no duplicate elements are present in the array.
    //
    //ex:
        //Input: {1, 2, 3, 4, 5, 6, 7}
    //Output:{1, 3, 2, 5, 4, 7, 6}
    public static void main(String[] args){

        int[] input={2,4,5,1,3,6};
            arranageInGivenOrder(input);

    }

    public static void arranageInGivenOrder(int[] input){

        TreeSet<Integer> treeSet= new TreeSet<>();
        for(int i=0;i<input.length;i++){
            treeSet.add(input[i]);
        }

        Integer array[] = new Integer[treeSet.size()];

        array = treeSet.toArray(array);
        System.out.println(treeSet);

        for(int i=1;i<input.length-1;i=i+2){
            int right=i+1;

            int dif=array[right]-array[i];
            System.out.println(dif);

            array[i]=array[i]+dif;
            array[right]=array[right]-dif;


        }
    }

}




