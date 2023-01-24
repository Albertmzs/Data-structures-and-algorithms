package com.mzs.sort;

import org.testng.annotations.Test;

import java.util.Arrays;

//冒泡排序
public class BulleSort {
    /*public void test() {      //冒泡排序优化前
      int[] arr = new int[]{10,3, -1, 4, 1, 7};

      int temp = 0;//临时变量，用来交换数据

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println("第"+i+"趟排序的结果为："+ Arrays.toString(arr));
        }
    }*/

    @Test
    public void test(){
        int[] arr=new int[]{6,5,4,3,2,1};
        int temp=0;
        boolean flag=false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println("第"+(i+1)+"趟排序的结果为："+ Arrays.toString(arr));
            if (flag==false){
                break;
            }else {
                flag=false;
            }
        }
    }
}
