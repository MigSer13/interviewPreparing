package ru.home.lesson2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Пашка");
        Cat cat2 = new Cat("Мурка");
        Cat cat3 = new Cat("Рыся");

        MyLinkedList<Cat> cats = new MyLinkedList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        cats.remove(cat2);

        Iterator<Cat> iterator2 = cats.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }


    }
}
