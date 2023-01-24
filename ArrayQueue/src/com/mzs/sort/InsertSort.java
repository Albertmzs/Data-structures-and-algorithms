package com.mzs.sort;

public class InsertSort {
    //插入排序
    public void insertSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            //待插入数
            int insertVal=arr[i];
            //与前面的数进行比较的位置索引
            int insertIndex=i-1;

            while (insertIndex>=0 && insertVal<arr[insertIndex]){
                //但待插入数比前面的数要小时，向后移一位
                arr[insertIndex+1]=arr[insertIndex];
                //索引向前进
                insertIndex--;
            }
            arr[insertIndex+1]=insertVal;
        }
    }
}
