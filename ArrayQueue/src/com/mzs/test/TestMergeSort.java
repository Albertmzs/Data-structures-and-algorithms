package com.mzs.test;

import com.mzs.sort.MergeSort;

import java.util.Arrays;

public class TestMergeSort {
    public static void main(String[] args) {
        int[] arr=new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i]=(int)(Math.random()*8000000);
        }
        MergeSort.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
