package com.javacourse.task1.myArrayList.impl;

import com.javacourse.task1.myArrayList.MyArrayList;

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
        }                                                  //1ю null ячейку  element-ом
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
        List resultList = new ArrayList<>(this.array.length + newList.size());
        Collections.addAll(resultList, Arrays.asList(this.array));
        Collections.addAll(resultList, Arrays.asList(newList));
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

    private boolean changeFirstNullElInList(Object[]list, T element){//метод для изменени null на element
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
    //==================================================================================================================================
    //Maksym's methods
    public Object[] resiz(int newLength) {      //увеличение емкости MyArrayList
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, sizeOfElements); //отличие в моей переменной sizeOfElements
        return  array = newArray;                                              //которая указывает на количество объектов в MyArrayList
    }
    @Override
    public boolean adds(T element) {          //Добавляет эллемент в массив и увеличивает его емкость в 2 раза в случае, если массив заполнен
        if(array.length==sizeOfElements){
            resiz(array.length*2);
        }
        array[sizeOfElements]=element;
        sizeOfElements++;                       //Увеличивает переменную, которая отвечает за количество элементов в массиве
        return true;
    }

    @Override
    public boolean delete(int index) {                    //Удаляет элемент по индксу MyArrayList
        if (index < sizeOfElements) {
            for (int i = index; i < sizeOfElements; i++)  //Сдвигает все элементы MyArrayList после удаленного влево
                array[i] = array[i + 1];
            array[sizeOfElements] = null;
            sizeOfElements--;                         //уменьшает счетчик элементов массива на 1
            if (array.length > DEFAULT_CAPACITY && sizeOfElements < array.length / CUT) //Если элементов MyArrayList в 4 раза меньше чем
                resiz(array.length / 2);                                      //объем базового массива, то он уменьшается в 2 раза
            return true;
        }
        else{                                                           //В случае если была попытка удалить несуществующий элемент массива
            System.out.println("Element is not exist or Element=null"); //то будет выведен False и ничего не произойдет
            return false;
        }
    }



    @Override
    public int size() {                                                 //Возвращает размер MyArrayList по счетчику sizeOfElements
        return sizeOfElements;
    }

    @Override
    public void set(int index, Object element) {                        //Устанавливает значение ячейки массива из списка уже существующих элементов
        if(index<sizeOfElements){                                       //Если елемнт проинициализирован, то преобразование произойдет
            array[index]=element;}
        else{                                                           //Если нет, то будет текст с ошибкой
            System.out.println("Wrong index. Elements in list: " + sizeOfElements);
            System.out.println("Try again.");
        }
    }

    @Override
    public T get(int index) {                       //Возвращает объект в MyArrayList, если индекс содержит объект
        if(index<sizeOfElements){
            return (T) array[index];}
        else{                                       //Если объект пустой, то выдает ошибку
            System.out.println("Wrong index. Elements in list: " + sizeOfElements);
            System.out.println("Try again.");
            return null;
        }
    }

    @Override
    public boolean contains(T element) {        //Перебирает элементы существующего списка в поисках объекта
        boolean contains=false;
        for (int e = 0; e<sizeOfElements; e++) {
            if (array[e]==element) {            //Как только находит-выходит из метода
                contains = true;
                break;
            }
        }
        return contains;
    }
}
