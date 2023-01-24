package com.mzs.test;

import com.mzs.java.Node;
import com.mzs.java.SingleLinkedList;
import org.testng.annotations.Test;

public class TestLinkedList {
    @Test
    public void test(){
        SingleLinkedList linkedList=new SingleLinkedList();

        Node node1 = new Node(1,"马化腾");
    /*    Node node2 = new Node(2,"马云");
        Node node3 = new Node(3,"刘强东");
        Node node4 = new Node(4,"任正非");*/

        linkedList.addList(node1);
      /*  linkedList.addList(node2);
        linkedList.addList(node3);
        linkedList.addList(node4);*/

        Node newHead = linkedList.reverseLinkedList(linkedList.getHead());
        linkedList.showLinkedList(newHead);
    }
}
