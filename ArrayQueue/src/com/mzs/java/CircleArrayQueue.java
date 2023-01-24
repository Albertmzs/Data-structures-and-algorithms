package com.mzs.java;

public class CircleArrayQueue {
    private int Maxsize;//表示队列的最大容量，队列中的数据是存放在数组中的
    private int front;//调整后的含义为： 指向队列头（即：队列中的第一个数据），front的初始值为 0
    private int rear;//指向队列中的最后一个数据的前一个位置 ，rear 的初始值为0
    private int[] queueArr;// 队列数组,数组模拟实现环形队列

    public CircleArrayQueue(){      //无参构造器
    }

    public CircleArrayQueue(int arrMaxsize){        //有参构造器
        Maxsize=arrMaxsize;
        front=0;
        rear=0;
        queueArr=new int[Maxsize];
    }

    public boolean isFull(){       //判断队列是否已满
        return (rear+1)%Maxsize==front;
    }

    public boolean isEmpty(){       //判断队列是否为空
        return rear==front;
    }

    //将数据存入队列
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列已满，无法存入数据！");
            return;
        }
        queueArr[rear]=n;
        rear=(rear+1)%Maxsize;
    }

    //获取队列的数据，出队列
    public int getQueueData(){
        if (isFull()){
            throw new RuntimeException("队列已空，无法取出数据");
        }
        int value= queueArr[front];
        front=(front+1)%Maxsize;
        return value;
    }

    //队列的有效数据个数
    public int size(){
        //比如rear=1，front=0，maxSize=3 此时有效数字为1
        return (rear+Maxsize-front) % Maxsize;
    }

    //遍历队列
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列已空，无数据！");
            return;
        }
        for (int i = front; i <front+size() ; i++) {
            System.out.println(queueArr[i]);
        }
    }


    //显示队列的头数据
    public void showHeadData(){
        if (isEmpty()){
            System.out.println("队列为空队列，没有头数据！");
        }
        System.out.println(queueArr[front]);
    }

}
