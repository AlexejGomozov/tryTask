package com.javacourse.task1.impl;

import com.javacourse.task1.MyArrayList;

import java.util.*;

public class MyArrayListImpl<T> implements MyArrayList<T> {

    private final int DEFAULT_CAPACITY = 16;
    private final int CUT = 4;
    private Object[] array = new Object[DEFAULT_CAPACITY];// массив создан и не заполнен
    private int pointer;
    private int sizeOfElements=0;       //Используем переменную для определения количества занятых ячеек в массиве

    @Override
    public boolean add(T element) {
            pointer = array.length-1;
           int notNullElement = amountNotNullEl(array); // определяем заполняемость массива, сколько эл-в !null
           if(notNullElement==pointer){//если заполняемость массива = длинне массива, то увеличиваем
            resize(array.length*2);  //емкость массива в 2 раза
            array[notNullElement+1] = element; //в след-щую ячейку после !null вставляем element
           }else{
               return changeFirstNullElInList(array, element); //если же заполненная емкость массива менее длинны массива то заменяем
           }                                                  //1ю !null ячейку  element-ом
        return array[notNullElement+1] == element;
        }

    @Override
    public void sort() {
        Random rand = new Random();  //для случая если есть null-ы, чтобы видеть как работет sort()
        for (int i = 0; i<this.array.length; i++)
        {if (this.array[i] == null) this.array[i] = rand.nextInt(100);}
        Collections.sort(Arrays.asList(this.array), new MyArrayListImpl.ComparatorForSort());
    }


    @Override
    public void concat(MyArrayList<T> newList) { //соединение через приведение к списку и метов коллекции
        Collections.addAll(Arrays.asList(this.array), Arrays.asList(newList));
    }

    @Override
    public T remove(int index) {
        pointer = array.length;
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];  //смещаем значение на ячейку влево, начиная с той кот-ю удалили
        array[pointer] = null;
        pointer--;
        if (array.length >DEFAULT_CAPACITY && (amountNotNullEl(array)) < array.length/CUT)
            resize(array.length/2); // уменьшаю емкость массива при этом условии

        return (T)array;
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


//_____________________________________________________________________________
    private int amountNotNullEl(Object[] arr){ //метод для подсчета !null ячеек
        int counter = 0;
            for(int i = 0; i<arr.length; i++) {
                if (arr[i] != null) {
                    counter++;
                }
            }
            return counter;
    }

    private boolean changeFirstNullElInList(Object[]list, T element){//метод для изменени !null на element
          boolean change = true;
          int i = 0;
        while(i<list.length){
            if(list[i]==null) list[i] =element;
            i++;
            return change;
        }
        return !change;
    }

    private Object resize(int newLength) {    //увеличение емкости MyArrayList
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        return  array = newArray;
    }

    class ComparatorForSort implements Comparator<T> { //для sort()
        @Override
        public int compare(T o1, T o2) {
            return ((Integer) o1).compareTo((Integer) o2); //для варианта сортировки типа Integer
        }
    }
}
