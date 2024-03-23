package lesson4;

import lesson4.linkedList.Linked;
import lesson4.linkedList.MyLinkedList;
import lesson4.list.MyArrayList;
import lesson4.list.MyList;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        Создайте класс ArrayIterator, параметризуйте его и имплементируйте этому классу интерфейс Iterator, параметризованный тем же типом.
//                Создайте поля int index, и final поле values с типом - массив элементов параметризованного параметра;
//        Реализуйте переопределяемые методы;
//        Создайте интерфейс GBList с параметризованным типом T, наследник Iterable того же типа;
//        Добавьте в этот  интерфейс методы: boolean add(T t), void remove(int index), T get(int index), int size(), void update(int index, T t).
        MyList<String> list = new MyArrayList<>();
        list.add("1");
        list.add("200");
        list.add("3");
        //list.delete(2);
        System.out.println(list);

        // HW
        MyLinkedList<String> strL = new MyLinkedList<>();
        strL.addFirst("ac");
        strL.addFirst("ab");
        strL.addFirst("c");
        strL.addFirst("b");
        strL.addFirst("bc");
        for (String s: strL) {
            System.out.println(s);
        }
        Iterator iterator = strL.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
