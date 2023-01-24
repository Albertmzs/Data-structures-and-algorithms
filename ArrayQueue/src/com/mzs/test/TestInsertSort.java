package com.mzs.test;

import com.mzs.sort.InsertSort;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestInsertSort {
    @Test
    public void test(){
        int[] arr=new int[]{101,34,2,9,40};
        InsertSort insertSort=new InsertSort();
        insertSort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
