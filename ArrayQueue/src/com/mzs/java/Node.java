package com.mzs.java;

//创建一个节点类
public class Node{
    int number;//序号
    Object data;//数据域
    Node next;//节点域



    public Node(int number,Object data) {
        this.number=number;
        this.data=data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "number=" + number +
                ", data=" + data +
                '}';
    }
}