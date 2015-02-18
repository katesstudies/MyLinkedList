package com.company;

/**
 * Created by Катя on 12.02.2015.
 */
public class MyLinkedNode {

    private MyLinkedNode next;
    private Object value;

    public MyLinkedNode(MyLinkedNode next, Object value) {
        this.next = next;
        this.value = value;
    }

    public MyLinkedNode getNext() {
        return next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setNext(MyLinkedNode next) {
        this.next = next;
    }
}
