package com.javacourse.task1.impl;

import com.javacourse.task1.MyArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyArrayListImpl<T> implements MyArrayList<T> {

    private final int DEFOLT_CAPACITY = 16;
    private final int CUT = 4;
    private Object[] array = new Object[DEFOLT_CAPACITY];
    private int pointer;

    @Override
    public boolean add(T element) {
            pointer = array.length-1;
            resize( array.length*2);
            System.out.println(array[++pointer]= element);
        return array[pointer] == element;

    }

    @Override
    public void sort() {
        Random rand = new Random();
        for (int i = 0; i<this.array.length; i++)
        {if (this.array[i] == null) rand.nextInt(100);}
         Arrays.sort(this.array);
    }

    @Override
    public void concat(MyArrayList newList) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void set(int index, Object element) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }



    private Object resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        return  array = newArray;
    }

    public static void main(String[]args){
        MyArrayList<Integer> listInt = new MyArrayListImpl<>();

        System.out.println(listInt.add(3));
        System.out.println(listInt.size());
    }
}
