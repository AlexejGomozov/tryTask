package com.javacourse.task1.myLinkedList;

public interface MyLinkedList<E>{
    void addLast(E e);
    void addFirst(E e);
    int size();
    boolean isEmpty();
    E getElementByIndex(int counter);
    boolean contains(E e);
    E delete (E e);
    E peekFirst();
    E peekLast();
    E pollFirst();
    E pollLast();
}
