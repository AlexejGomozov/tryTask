package com.javacourse.task1.myLinkedList;

import com.javacourse.task1.myLinkedList.impl.MyLinkedListImpl;

import java.util.List;

public interface MyLinkedList<E>{
    void addLast(E e);
    void addFirst(E e);
    int size();
    boolean isEmpty();
    E getElementByIndex(int counter);
    boolean contains(E e);
    E delete (E e);
}
