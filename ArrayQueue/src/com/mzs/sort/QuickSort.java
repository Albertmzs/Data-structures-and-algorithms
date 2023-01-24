package com.mzs.sort;

public class QuickSort {
   public static void quickSort(int[] arr,int left,int right){
       if (left>right){
           return;
       }
       int i=left;
       int j=right;
       int temp=arr[i];//以最左边的数为基准
       int t;

       while (i<j) {
           //先看右边，依次递减
           while (i < j && temp <= arr[j]) {
               j--;
           }
           //再看右边，依次递增
           while (i < j && temp >= arr[i]) {
               i++;
           }


           //满足条件，实现交换
           if (i < j) {
               t = arr[i];
               arr[i] = arr[j];
               arr[j] = t;
           }
       }


           arr[left]=arr[j];
           arr[j]=temp;

           quickSort(arr,left,j-1);
           quickSort(arr,j+1,right);
       }



   /* public static void quickSort(int[] arr,int left,int right){
        if (left>right){
            return;
        }
        int i,j,temp,t;
        i=left;
        j=right;
        temp=arr[left];//以最左边为基准

        while (i<j){
            //先看右边，依次递减
            while (temp<=arr[j] && i<j){
                j--;
            }
            //再看左边，依次递增
            while (temp>=arr[i] && i<j){
                i++;
            }
            //如果满足条件，实行交换
            if(i<j){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }

        //最后将基准位i和j相等位置的数字交换
        arr[left]=arr[i];
        arr[i]=temp;

        //递归调用左半数组
        quickSort(arr,left,j-1);
        //递归调用右半数组
        quickSort(arr,j+1,right);
    }*/
}
