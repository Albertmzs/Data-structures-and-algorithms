package com.mzs.java;

import org.testng.annotations.Test;

public class SparseArryTest {
    //1,创建原始数组11*11
    //2,    0,代表没有棋子    1,代表白子  2，代表黑子
    @Test
    public void Test() {
        int[][] ChessArray = new int[11][11];
        ChessArray[1][1] = 1;
        ChessArray[2][2] = 2;
        ChessArray[10][9] = 1;
        for (int[] row : ChessArray) {
            for (int data : row) {
                System.out.print(data);
            }
            System.out.println();
        }

        //二维数组转化为稀疏数组
        //计算出非零数据的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (ChessArray[i][j] != 0) {
                    sum++;
                }
            }
        }

        //创建稀疏数组
        int[][] SparseArray = new int[sum + 1][3];
        SparseArray[0][0] = 11;
        SparseArray[0][1] = 11;
        SparseArray[0][2] = sum;

        //把非零的数据赋值给稀疏数组
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (ChessArray[i][j] != 0) {
                    count++;
                    SparseArray[count][0] = i;//记录行数
                    SparseArray[count][1] = j;//记录列数
                    SparseArray[count][2] = ChessArray[i][j];//把非零的数据赋值给稀疏数组
                }
            }
        }

     /*   for (int[] row:SparseArray){
            for(int data:row){
                System.out.print(data);
            }
            System.out.println();
        }*/
        System.out.println("*****************************************");

        int[][] ChessArr = new int[SparseArray[0][0]][SparseArray[0][1]];
        for (int i = 1; i < sum+1; i++) {
                ChessArr[SparseArray[i][0]][SparseArray[i][1]]=SparseArray[i][2];
        }

        for(int[] row:ChessArr){
            for (int data:row){
                System.out.print(data);
            }
            System.out.println();
        }
    }
}