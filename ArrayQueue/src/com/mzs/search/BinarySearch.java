package com.mzs.search;

import com.mzs.sort.RadixSort;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//使用二分查找的前提是有序的
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[]{1,8,77,77,77,77,345,7890,10000};
        Object[] objects = binarySearch(arr, 0, arr.length, 77).toArray();
        System.out.println(Arrays.toString(objects));

    }

    /*public static int binarySearch(int[] arr,int left,int right,int findVal) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal=arr[mid];

        if (findVal > midVal) {
            return binarySearch(arr, mid + 1, right, findVal);
        } else if (findVal < arr[mid]) {
            return binarySearch(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }

    }*/

    public static List<Integer> binarySearch(int[] arr,int left,int right,int findVal) {
        if (left > right) {
            return Collections.singletonList(-1);
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if (findVal > midVal) {
            return binarySearch(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            return binarySearch(arr, left, mid - 1, findVal);
        } else {
            List<Integer> list = new ArrayList<>();//定义一个链表，用于存放相同元素的下标
            int temp=mid-1;
            while (true){
                if (temp<0 || arr[temp]!=findVal){
                    break;
                }else {
                    list.add(temp);
                    temp--;//temp左移
                }
            }
            list.add(mid);

            temp=mid+1;
            while (true){
                if (temp>right ||arr[temp]!=findVal){
                    break;
                }else {
                    list.add(temp);
                    temp++;//temp右移
                }
            }
            return list;
        }
    }
}
