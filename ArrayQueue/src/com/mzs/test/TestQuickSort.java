package com.mzs.test;

import com.mzs.sort.QuickSort;
import com.mzs.sort.RadixSort;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TestQuickSort {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        int[] arr=new int[10000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*8000000);
        }
        QuickSort.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        long etime = System.currentTimeMillis();
        System.out.printf("执行时长：%d 毫秒.", (etime - stime));
    }
}
