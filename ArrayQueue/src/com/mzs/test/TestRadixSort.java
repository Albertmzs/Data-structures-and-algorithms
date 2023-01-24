package com.mzs.test;

import com.mzs.sort.MergeSort;
import com.mzs.sort.RadixSort;

import java.util.Arrays;

public class TestRadixSort {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        int[] arr=new int[8000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*8000000);
        }
        RadixSort.radixSort(arr);
        System.out.println(Arrays.toString(arr));
        long etime = System.currentTimeMillis();
        System.out.printf("执行时长：%d 毫秒.", (etime - stime));
    }
}
