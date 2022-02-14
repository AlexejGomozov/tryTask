package com.javacourse.task1.testCode;

import com.javacourse.task1.myLinkedList.impl.MyLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListImplTest {

    MyLinkedListImpl<String> stringLinked;
    int expectedSize;
    String expectedElement;

    @BeforeEach
    void prepare(){
        stringLinked = new MyLinkedListImpl<>();
        expectedSize = 2;
        expectedElement = "abcd";
    }

    @Test
    void sizeTest(){
        stringLinked.addLast("abcd");
        stringLinked.addLast("dcba");
        int  actional = stringLinked.size();
       assertEquals(actional,expectedSize);
    }

    @Test
    void addLastTest(){
        stringLinked.addLast("abcd");
        stringLinked.addLast("dcba");
        String  actional = stringLinked.getElementByIndex(0);
        assertEquals(actional,expectedElement);
    }
    @Test
    void addFirstTest(){
        stringLinked.addFirst("abcd");
        stringLinked.addFirst("dcba");
        String  actional = stringLinked.getElementByIndex(1);
        assertEquals(actional,expectedElement);
    }

    @Test
    void  deleteTest(){
        stringLinked.addFirst("abcd");
        stringLinked.addFirst("dcba");
        String  actional = stringLinked.delete("abcd");
        assertEquals(actional,expectedElement);
    }
    @Test
    void  containsTest(){
        stringLinked.addFirst("abcd");
        stringLinked.addFirst("dcba");
        boolean  actional = stringLinked. contains("abcd");
        assertTrue(actional);
    }

    @Test
    void getElementByIndexTest(){
        stringLinked.addLast("abcd");
        stringLinked.addFirst("dcba");
        String  actional = stringLinked.getElementByIndex(1);
        assertEquals(actional,expectedElement);
    }

    @Test
    void pollFirstshouldReturnNull(){
        String first=stringLinked.pollFirst();
        assertNull(first);
    }

    @Test
    void pollLastshouldReturnNull(){
        String first=stringLinked.pollLast();
        assertNull(first);
    }

    @Test
    void peekFirstshouldReturnNull(){
        String first=stringLinked.pollFirst();
        assertNull(first);
    }

    @Test
    void peekLastshouldReturnNull(){
        String first=stringLinked.pollFirst();
        assertNull(first);
    }

    @Test
    void pollFirstshouldReturnAndDeleteFirstElement(){
        stringLinked.addLast("dcba");
        stringLinked.addFirst("abcd");
        String  actional = stringLinked.pollFirst();
        assertEquals(actional, expectedElement);
        assertFalse((stringLinked.contains(expectedElement)));
    }

    @Test
    void pollLastshouldReturnAndDeleteLastElement(){
        stringLinked.addFirst("dcba");
        stringLinked.addLast("abcd");
        String  actional = stringLinked.pollLast();
        assertEquals(actional, expectedElement);
        assertFalse((stringLinked.contains(expectedElement)));
    }

    @Test
    void peekFirstshouldReturnFirstElement(){
        stringLinked.addLast("dcba");
        stringLinked.addFirst("abcd");
        String  actional = stringLinked.peekFirst();
        assertEquals(actional, expectedElement);
    }

    @Test
    void peekLastshouldReturnLastElemet(){
        stringLinked.addFirst("dcba");
        stringLinked.addLast("abcd");
        String  actional = stringLinked.peekLast();
        assertEquals(actional, expectedElement);
    }
}
