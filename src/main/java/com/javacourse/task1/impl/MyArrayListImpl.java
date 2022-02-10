package com.javacourse.task1.impl;

import com.javacourse.task1.MyArrayList;

import java.util.Arrays;
import java.util.Random;

public class MyArrayListImpl<T> implements MyArrayList<T> {

    private final int DEFAULT_CAPACITY = 16;
    private final int CUT = 4;
    private Object[] array = new Object[DEFAULT_CAPACITY];
    private int pointer;
    private int sizeOfElements=0;       //Используем переменную для определения количества занятых ячеек в массиве

    @Override
    public boolean add(T element) {
            pointer = array.length-1;
            resize( array.length*2);
            System.out.println(array[++pointer]= element);
            sizeOfElements++;
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
        sizeOfElements--;
        return null;
    }

    @Override
    public int size() {
        return sizeOfElements;
    }

    @Override
    public void set(int index, Object element) {
        try{
        array[index]=element;}
        catch (IndexOutOfBoundsException e){
            System.out.println("Wrong index. Elements in list: " + sizeOfElements);
            System.out.println("Try again.");
        }
    }

    @Override
    public T get(int index) {
        try {
        return (T) array[index];}
        catch (IndexOutOfBoundsException e){
            System.out.println("Wrong index. Elements in list: " + sizeOfElements);
            System.out.println("Try again.");
            return null;
        }
    }

    @Override
    public boolean contains(T element) {
        boolean contains=false;
        for (int e = 0; e<sizeOfElements; e++) {
            if (array[e]==element) {
                contains = true;
                break;
            }
        }
        return contains;
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
        System.out.println(listInt.contains(3));

    }
}
