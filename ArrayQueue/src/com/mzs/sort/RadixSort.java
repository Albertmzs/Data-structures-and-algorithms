package com.mzs.sort;

import java.util.Arrays;
import java.util.LinkedList;

public class RadixSort {
   /* //基数排序
    public static void radixSort(int[] arr) {
        //1,得到最大的数的位数
        int max = arr[0];//假设第一个数就是最大数
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //得到最大的数是几位数
        int maxLength = (max + "").length();

        //定义一个二维数组，每个桶就是一维数组
        int[][] bucket = new int[10][arr.length];
        //为了记录每个桶中，实际存放了多少个数据，定义一个一维数组来记录各个桶的每次放入的数据个数
        //比如：bucketElementCount[0],记录的就是bucket[0]桶的放入数据的个数
        int[] bucketElementCounts = new int[10];

        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            //针对每个元素的对应为进行排序处理，第一是个位，第二是十位，第三是百位...
            for (int j = 0; j < arr.length; j++) {
                //取出每个元素的对应位的值
                int digOfEkement = arr[j] / n % 10;
                //放入到对应的桶中
                bucket[digOfEkement][bucketElementCounts[digOfEkement]] = arr[j];
                bucketElementCounts[digOfEkement]++;
            }

            //按照这个桶的顺序(一维数组的下标依取出数据，放入到原数组中)
            int index = 0;
            //如果桶中有数据，我们放入到原数组
            for (int k = 0; k < bucketElementCounts.length; k++) {
                if (bucketElementCounts[k] != 0) {
                    //循环该桶即第K个桶(即第K个一维数组)，放入
                    for (int l = 0; l < bucketElementCounts[k]; l++) {
                        //取出元素放入到arr
                        arr[index++]=bucket[k][l];
                    }
                }
                bucketElementCounts[k] = 0;
            }
        }
*/

   //基数排序
    public static void radixSort(int[] arr){
        //1,得到数组中最大的数
        int maxVal=arr[0];//默认数组第一个为最大的数

        for (int i =1; i < arr.length; i++) {
            if (maxVal<arr[i]){
                maxVal=arr[i];
            }
        }

        int maxLength=(maxVal+"").length();//得到最大数的位数

        int[][] bucket=new int[10][arr.length];//定义一个二维数组，每个桶就是一维数组

        //为了记录每个桶中，实际存放了多少个数据，定义一个一维数组来记录各个桶的每次放入的数据个数
        //比如：bucketElementCount[0],记录的就是bucket[0]桶的放入数据的个数
        int[] bucketElementCounts=new int[10];

        for (int i = 0,n=1; i < maxLength; i++,n*=10) {
            for (int j = 0; j <arr.length ; j++) {
                //取出每个元素的对应位的值
                int digitOfElement=arr[j]/n%10;
                //根据位数放入对应的桶中
                bucket[digitOfElement][bucketElementCounts[digitOfElement]]=arr[j];
                //记录对应桶中放入了多少个数
                bucketElementCounts[digitOfElement]++;
            }

            int index=0;//定义一个原数组的索引，
            //按照桶的顺序，依次放入原数组中
            for (int k = 0; k < bucketElementCounts.length; k++) {
                if (bucketElementCounts[k]!=0){
                    for (int l = 0; l < bucketElementCounts[k]; l++) {
                        arr[index++]=bucket[k][l];
                    }
                }
                bucketElementCounts[k]=0;
            }
        }
    }
}





