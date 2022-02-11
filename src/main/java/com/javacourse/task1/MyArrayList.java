package com.javacourse.task1;

public interface MyArrayList<T> {
    //Alexey's tasks
    boolean add(T element);
    void sort();
    void concat(MyArrayList<T> newList);
    T remove(int index);
    //Maksym's tasks
    int size();
    void set(int index, T element);
    T get(int index);
    boolean contains(T element);
    //Maksym's another implementations
    boolean adds(T element);//It makes the same thing as add();
    boolean delete(int index);// It makes the same thing as remove();;
}
