package com.javacourse.task1.myLinkedList.impl;

import com.javacourse.task1.myLinkedList.MyLinkedList;

import java.util.Objects;

public class MyLinkedListImpl<E> implements MyLinkedList<E> {

    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public MyLinkedListImpl(){
        lstNode = new Node<E>(null, fstNode, null);
        fstNode = new Node<E>(null, null, lstNode);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lstNode;
        prev.setCurrentElement(e);
        lstNode = new Node<E>(null, prev, null);
        prev.setNextElement(lstNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = fstNode;
        next.setCurrentElement(e);
        fstNode = new Node<>(null, null, next);
        next.setPrevElement(fstNode);
        size++;
    }

    @Override
    public int size() {return size;}

    @Override
    public boolean isEmpty() {return size == 0;}

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = fstNode.getNextElement();
        for(int i = 0; i < counter; i++){
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    @Override
    public boolean contains(E e) {
        Node<E> current = fstNode;
        while(current.getCurrentElement() != e){
            if(current.getNextElement() == null) return false;
            else current = current.getNextElement();
        }
        return true;
    }

    @Override
    public E delete(E e) {
        Node<E> current = fstNode;
        while(current.getCurrentElement() != e){
            if(current.getNextElement() == null) return null;
            else current = current.getNextElement();
        }
        if(current == fstNode) {
            current = current.getNextElement();
            current.nextElement.setPrevElement(null);}
        if(current == lstNode) {
            current = current.getPrevElement();
            current.prevElement.setNextElement(null);
        }else{
            current.nextElement.setPrevElement(current.prevElement);
            current.prevElement.setNextElement(current.nextElement);
        }
           size--;
        return current.getCurrentElement();
    }

    @Override
    public E peekFirst() {  //Возвращает первый элемент
        if (size!=0){
            return getElementByIndex(0);
        }
        else return null;
    }

    @Override
    public E peekLast() {    //Возвращает последний элемент
        if (size!=0){
            return (E) getElementByIndex(size-1);
        }
        else return null;
    }


    @Override
    public E pollFirst() {   //Возвращает первый элемент и удаляет его из списка
        if (size!=0){
        E first= getElementByIndex(0);
        delete(getElementByIndex(0));
        return first;}
        else return null;
    }

    @Override
    public E pollLast() {    //Возвращает последний элемент и удаляет его из списка
        if (size!=0){
        E last = getElementByIndex(size-1);
        delete(getElementByIndex(size-1));
        return last;}
        else return null;
    }

    private Node<E> getNextElement(Node<E> current){ //для метода getElementByIndex()
        return current.getNextElement();
    }


    private static class Node<E>{
            private E currentElement;
            private Node<E> nextElement;
            private Node<E> prevElement;

          private Node(E currentElement, Node<E>prevElement,  Node<E> nextElement){
                this.currentElement = currentElement;
                this.nextElement = nextElement;
                this.prevElement = prevElement;
            }

            public E getCurrentElement() {return currentElement;}

            public void setCurrentElement(E currentElement) {this.currentElement = currentElement;}

            public Node<E> getNextElement() {return nextElement;}

            public void setNextElement(Node<E> nextElement) {this.nextElement = nextElement;}

            public Node<E> getPrevElement() {return prevElement;}

            public void setPrevElement(Node<E> prevElement) {this.prevElement = prevElement;}
        }

}
