package com.mzs.java;

public class ArrayStack {
    private int Maxsize;//栈的大小
    private int[] stack;//数组，数据放入该数组中
    private int top=-1;//栈顶，初始化为-1，表示没有指针

    public ArrayStack(int Maxsize){ //构造器初始化
        this.Maxsize=Maxsize;
        stack=new int[Maxsize];
    }

    public boolean isFull(){//判断是否栈满
        return top==Maxsize-1;
    }

    public boolean isEmpty(){//判断是否栈空
        return top==-1;
    }

    public void push(int value){//入栈 -push
        if (isFull()){
            System.out.println("栈已满，无法存入数据!");
            return;
        }
        top++;
        stack[top]=value;
    }

    //出栈-pop,将栈顶的数据返回
    //根据数组类型，选择返回类型，不一定非是int
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("栈空！");
        }
        int temp=stack[top];
        top--;
        return temp;
    }

    //显示栈的情况【遍历栈】
    public void list(){
        if (isEmpty()){
            System.out.println("栈空，无数据");
            return;
        }

        //遍历从栈顶开始
        for (int i = top; i >=0 ; i--) {
            System.out.println(stack[top]);
        }
    }
}
