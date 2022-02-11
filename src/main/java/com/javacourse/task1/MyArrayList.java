package com.javacourse.task1;

public interface MyArrayList<T> {
//Alexey tasks
    boolean add(T element);
    void sort();
   void concat(MyArrayList<T> newList);
    T remove(int index);
//Maksym tasks
    int size();
    void set(int index, T element);
    T get(int index);
    boolean contains(T element);
}
