package com.mzs.test;

import com.mzs.java.CircleLinkedList;
import org.testng.annotations.Test;

public class TestCircleLinkedList {
    @Test
    public void test(){
        CircleLinkedList list=new CircleLinkedList();
        list.addList(5);
        list.showList();
    }
}
