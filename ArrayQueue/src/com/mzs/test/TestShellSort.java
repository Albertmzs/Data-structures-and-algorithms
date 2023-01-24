package com.mzs.test;

import com.mzs.sort.ShellSort;
import org.testng.annotations.Test;

public class TestShellSort {
    @Test
    public void test(){
        ShellSort sort=new ShellSort();
        int[] arr=new int[]{8,9,1,7,2,3,5,4,6,0};
        sort.exchangeShellSort(arr);
        sort.shellSort(arr);
    }
}
