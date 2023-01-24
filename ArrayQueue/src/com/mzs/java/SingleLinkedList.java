package com.mzs.java;


import java.util.Stack;

//创建一个单链表类
public class SingleLinkedList {
    public Node head=new Node(0,"");//创建一个头结点，不存放数据

    public Node getHead() {
        return head;
    }

    //向链表中添加数据
    public void addList(Node node){
        //因为头结点不能动，所以需要创建一个辅助遍历temp
        Node temp=head;
        //遍历链表，找到最后
        while (true){
            if (temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=node;
    }

    public void addBySize(Node node){
        boolean flag=false;
        //因为头结点不能动，所以需要创建一个辅助遍历temp
        Node temp=head;
        while (true){
            //数值最大时，找到队尾，插入数据
            if(head.next==null){
                break;
            }
            //位置已经找到，在temp后面插入
            if (isEmpty()){
                temp.next=node;
                return;
            }else if (temp.next.number>node.number) {
                break;
                //如果插入的数据已存在
            }if (temp.next.number==node.number){
                flag=true;
                break;
            }
            temp=temp.next;
        }

        //判断插入的数据是否存在
        if (flag){
            System.out.println("插入的数据已存在，不能再添加！");
            return;
        }
        node.next=temp.next;
        temp.next=node;
    }

    //显示链表(遍历)
    public void showLinkedList(Node head){
        //判断列表是否为空
        if(head.next==null){
            System.out.println("列表为空，没有数据");
            return;
        }
        //头结点不能动，需要一个辅助变量来遍历
        Node temp=head.next;
        while (temp!=null){
            System.out.println(temp);
            temp=temp.next;
        }
    }

    //判断单列表是否为空
    public boolean isEmpty(){
        return head.next==null;
    }

    //求返回单链表中有效的节点个数
    public  int getLength(Node head){
        int count = 0;//用来计数
        Node temp=head.next;//创建一个临时节点
        if (isEmpty()){
            return 0;
        }
        while (temp!=null){
                count++;
                temp=temp.next;
        }
        return count;
    }

    //查找单链表中的倒数第K个节点
    /*
    * 第一步：编写一个方法，接受head节点，同时接收index
    * 第二步：index表示倒数第index个节点
    * 第三步:先把链表从头到尾遍历一边，得到有效节点数
    * 第四步：得到size()后，从第一个节点遍历到第(size()-index)个节点,就可以找到
    * 第五步：找到之后，返回该节点，否则为Null
    * */
    public  Node reciprecalNode(Node head,int index){
        if (head.next==null){
            return null;
        }
        int size=getLength(head);
        if (index>size||index<=0){
            return null;
        }
        Node cur=head.next;
        for (int i = 0; i < size-index; i++) {
            cur=cur.next;
        }
        return cur;
    }

    //使用迭代法，实现链表反转
    public Node reverseLinkedList(Node head){
       Node prev=null;
       Node curr=head;
       while (curr!=null){
           Node next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       return prev;
    }

    //逆序打印单链表，使用栈
    public void reversePrint(){
        Stack<Node> stack=new Stack<Node>();

    }
}

