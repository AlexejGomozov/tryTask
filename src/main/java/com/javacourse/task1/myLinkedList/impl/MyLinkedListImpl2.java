//package com.javacourse.task1.myLinkedList.impl;
//
//import com.javacourse.task1.myLinkedList.MyLinkedList;
//
//public class MyLinkedListImpl2<E> implements MyLinkedList<E> {
//
//    private Node<E> first;
//
//    public MyLinkedListImpl2(){first = null;}
//
//    public boolean isEmpty(){return(first == null);}
//
//     @Override
//    public boolean contains(E key){
//        Node<E> current = first;
//        while(current.currentElement!= key){
//            if(current.nextElement == null) return false;
//            else current = current.nextElement;
//        }
//        return true;
//    }
//   @Override
//   public Node<E> delete(E e){
//        Node current = first;
//        Node previous = null;
//
//        while(current.currentElement!= e){
//            if (current.nextElement== null) return null;
//            else current = current.nextElement;
//        }
//   }
//
//    private static class Node<E> {
//        private E currentElement;
//        private Node<E> nextElement;
//
//
//        private Node(E currentElement) {
//            this.currentElement = currentElement;
//        }
//    }
//    @Override
//    public void addLast(E e) {
//
//    }
//
//    @Override
//    public void addFirst(E e) {
//     Node<E> firstNode = new Node<>(e);
//     firstNode.nextElement = head;
//     head = firstNode;
//    }
//
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public E getElementByIndex(int counter) {
//        return null;
//    }
//
//
//    @Override
//    public E delete(E e) {
//        return null;
//    }
//}
