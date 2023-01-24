package com.mzs.HashTable;

import sun.invoke.empty.Empty;

public class HashTable {

}

//表示一个雇员
class Employee{
    public int id;
    public String name;
    public Employee next;

    public Employee(int id,String name){
        super();
        this.id=id;
        this.name=name;
    }
}

//创建EmpLinkedList，表示链表
class EmpLinkedList{
    //头指针，执行第一个Emp,因此我们这个链表的head是直接指向第一个Emp
    private  Employee head;


}