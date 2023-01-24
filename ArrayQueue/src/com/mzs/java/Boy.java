package com.mzs.java;

public class Boy {
    private int number;//编号
    Boy next;//指向下一个节点的指针

    public Boy(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "number=" + number +
                '}';
    }
}
