package com.mzs.sort;

import java.util.Arrays;

public class ShellSort {
    //希尔排序(交换法)
    public void exchangeShellSort(int[] arr){
        int temp;//用于临时存储数据
        for (int gap=arr.length/2; gap>0;gap/=2 ) {
            for (int i = gap; i <arr.length ; i++) {
                //遍历各组中所有的元素(共gap组)
                for (int j = i-gap; j >=0 ; j-=gap) {
                    if (arr[j]>arr[j+gap]){
                        temp=arr[j];
                        arr[j]=arr[j+gap];
                        arr[j+gap]=temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //希尔排序(移位法)
   /* public void shellSort(int[] arr){
        int temp;
        for (int gap=arr.length/2;gap>0;gap/=2){
            //遍历各组中的所有元素
            for (int i = gap; i <arr.length ; i++) {
                temp=arr[i];
                int j=i-gap;
                while (j>=0 && temp<arr[j]){
                     arr[j+gap]=arr[j];
                     j-=gap;
                }
                arr[j+gap]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }*/

    
    //希尔排序(位移法)
    public void shellSort(int[] arr){
        int temp;
        for (int gap=arr.length/2;gap>0;gap/=2){
            //遍历各组中所有的元素
            for (int i = gap; i <arr.length ; i++) {
                //带插入数
                temp=arr[i];
                int j=i-gap;
                while (j>=0 && temp<arr[j]){
                    arr[j+gap]=arr[j];
                    j-=gap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
