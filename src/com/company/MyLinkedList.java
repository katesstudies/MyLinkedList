package com.company;

/**
 * Created by Катя on 12.02.2015.
 */
public class MyLinkedList implements MyList {

    private MyLinkedNode first;

    private MyLinkedNode getNode(int i) {
        if (i > size()) {
            throw new RuntimeException("Out of range");
        }
        int iter = 0;
        MyLinkedNode search = first;
        while (iter < i) {
            search = search.getNext();
        }
        return search;
    }

    public void add(Object o) {
        if (first == null) {
            first = new MyLinkedNode(null, o);
        } else {
            MyLinkedNode node = first;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(new MyLinkedNode(null, o));
        }
    }

    public Object get(int i) {
        MyLinkedNode node = getNode(i);
        return node.getValue();
    }

    public Object remove(int i) {
        Object deletedObject = get(i);
        if (i == 1) {
            first = first.getNext();
        } else {
            MyLinkedNode previous = getNode(i - 1);
            previous.setNext(previous.getNext().getNext());
        }
        return deletedObject;
    }

    public void clear() {
        first = null;
    }

    public boolean contains(Object o) {
        return (indexOf(o) != -1);
    }

    public int size() {
        int count = 0;
        MyLinkedNode node = first;
        while (first.getNext() != null) {
            node = node.getNext();
            count++;
        }
        return count;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void put(int i, Object o) {
        MyLinkedNode node = getNode(i);
        node.setValue(o);
    }

    public int indexOf(Object o) {
        MyLinkedNode node = first;
        for (int i = 0; i < size(); i++) {
            if (node.getValue() == o) {
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }

    public void insert(int i, Object o) {
        MyLinkedNode node = new MyLinkedNode(null, o);
        MyLinkedNode previous = getNode(i - 1);
        node.setNext(previous.getNext());
        previous.setNext(node);
    }
}
