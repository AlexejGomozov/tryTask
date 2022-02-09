package com.javacourse.task1;

public interface MyArrayList<T> {

    boolean add(T element);
    void sort();
    void concat(MyArrayList<T> newList);
    T remove(int index);
    int size();
    void set(int index, T element);
    T get(int index);
    boolean contains(T element);
}
