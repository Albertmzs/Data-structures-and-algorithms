package com.mzs.sort;

public class MergeSort {
    public static void mergeSort(int[] arr,int left,int right){
       if (left<right){
            int mid=(left+right)/2;
            //左边递归分解
            mergeSort(arr,left,mid);
            //右边递归分解
            mergeSort(arr,mid+1,right);
            //合并
            merge(arr,left,mid,right);
        }
    }
    /*
     * @param arr 排序的原始数组
     * @param left 左边有序序列的初始索引
     * @param mid 中间索引
     * @param right 右边索引
    */
    public static void merge(int[] arr,int left,int mid,int right){
        int[] temp=new int[right-left+1];//用于临时存储数组元素
        int i=left;//初始化i，左边索引
        int j=mid+1;//初始化j，右边索引
        int t=0;//临时数组的索引

        while (i<=mid && j<=right){
            if (arr[i]<=arr[j]){
                temp[t]=arr[i];
                t++;
                i++;
            }else {
                temp[t]=arr[j];
                t++;
                j++;
            }
        }

        while (i<=mid){
            temp[t]=arr[i];
            t++;
            i++;
        }
        while (j<=right){
            temp[t]=arr[j];
            t++;
            j++;
        }

        //将temp数组的元素拷贝到arr中
        //注意，并不是每次都拷贝所有
        t=0;
        int tempLeft=left;
        while (tempLeft<right){
            arr[tempLeft]=temp[t];
            tempLeft++;
            t++;
        }
    }
}
    /*//分+合方法
    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        if (left<right){
            int mid=(left+right)/2;
            //向左递归分解
            mergeSort(arr,left,mid,temp);
            //向右递归分解
            mergeSort(arr,mid+1,right,temp);
            //合并
            merge(arr,left,mid,right);
        }
    }

    *//* * @param arr 排序的原始数组
     * @param left 左边有序序列的初始索引
     * @param mid 中间索引
     * @param right 右边索引*//*

    public static void merge(int[] arr,int left,int mid,int right){
        int[] temp=new int[right-left+1];
        int i=left;//初始化i，左边有序序列的初始索引
        int j=mid+1;//初始化j，右边有序序列的初始索引
        int t=0;//指向temp数组的当前索引

        //(一)
        //先把左右两边有序的数据按照规则填充到temp数组
        //直到左右两边的有序序列，有一边处理完毕为止
        while (i<=mid && j<=right){
            //如果左边有序序列的当前元素小于右边有序序列的当前元素，则将左边的当前元素拷贝到temp数组中
            if(arr[i]<=arr[j]){
                temp[t]=arr[i];
                t++;
                i++;
            }else {//反之，如果右边有序序列的当前元素小于左边有序序列的当前元素，则将右边的当前元素拷贝到temp数组中
                temp[t]=arr[j];
                t++;
                j++;
            }
        }

        //(二)
        //把剩余数据的一边依次全部填充到temp
        while (i<=mid){//左边的有序序列还有剩余的元素，就全部填充到temp中
            temp[t]=arr[i];
            t++;
            i++;
        }

        while (j<=right){//右边的有序序列还有剩余的元素，就全部填充到temp中
            temp[t]=arr[j];
            t++;
            j++;
        }

        //(三)
        //将temp数组的元素拷贝到arr中
        //注意，并不是每次都拷贝所有
        t=0;
        int tempLeft=left;
        while (tempLeft<=right){
            arr[tempLeft]=temp[t];
            t++;
            tempLeft++;
        }
    }*/



