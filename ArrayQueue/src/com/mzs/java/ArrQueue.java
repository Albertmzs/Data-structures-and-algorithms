package com.mzs.java;

//用数组来模拟队列
public class ArrQueue {
    private int Maxsize;//队列的最大容量
    private int front;//队列的头指针
    private int rear;//队列的尾指针
    int[] arrQueue;//用来存放数据的数组

    public ArrQueue(int arrMaxsize){    //创建队列的构造器
        Maxsize=arrMaxsize;
        arrQueue=new int[Maxsize];
        front=-1;
        rear=-1;
    }

    //判断队列是否为满
    public boolean isFull() {
        return rear == Maxsize - 1;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return front==rear;
    }

    //添加数据到队列，入队列
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列已满,无法添加数据！");
            return;
        }
        rear++;//尾指针向后移动一位
        arrQueue[rear]=n;
    }

    //获取队列的数据，出队列
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列已空，无法取出数据");//报异常
        }
        front++;
        return arrQueue[front];
    }

    //遍历队列
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列为空，没有数据");
            return;
        }
        for (int i = 0; i < arrQueue.length; i++) {
            System.out.println("队列第"+(i+1)+"个数据为："+arrQueue[i]);
        }
    }

    //显示队列的头数据
    public void shouHead(){
        if (isFull()){
            System.out.println("此时队列数据为空，没有数据");
            return;
        }
        System.out.println("队列的头数据为："+arrQueue[front+1]);
    }
}
