package com.mzs.java;

public class CircleLinkedList {
    private Boy frist=null;//创建一个first节点，当前没有编号

    public void addList(int num){       //创建n个boy,构成环形链表
        if (num<1){                     //数据校验
            throw new RuntimeException("输入的数值不正确！");
        }

        Boy curboy=frist;                //创建一个辅助指针，帮助构建环形链表
        for (int i = 1; i < num; i++) {
           Boy boy=new Boy(i);
           if (i==1){                   //如果为第一个小孩
               frist=boy;
               curboy=frist;
           }else
               curboy.next=boy;
           curboy=curboy.next;
        }
        curboy.next=frist;              //使之成环
    }

    public void showList(){
        if (frist==null){
            System.out.println("链表为空，没有数据！");
            return;
        }
        Boy curboy=frist;
        while (curboy.next!=frist){
            System.out.println(curboy);
            curboy=curboy.next;
        }
    }
}
