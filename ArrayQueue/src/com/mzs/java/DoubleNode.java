package com.mzs.java;

public class DoubleNode {
    Object data;
    DoubleNode pre;   //指向前一个节点的指针
    DoubleNode next;  //指向后一个节点的指针

    public DoubleNode(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "data=" + data +
                '}';
    }
}
