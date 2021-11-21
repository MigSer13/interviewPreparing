package ru.home.lesson3;

import ru.home.lesson2.Cat;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Пашка");
        Cat cat2 = new Cat("Мурка");
        Cat cat3 = new Cat("Рыся");
        Cat cat4 = new Cat("Ася");

        OneLinkedList<Cat> cats = new OneLinkedList();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        cats.invert();
        Iterator<Cat> iterator2 = cats.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


//        cats.remove(cat2);
//
//        Iterator<Cat> iterator2 = cats.iterator();
//        while (iterator2.hasNext()) {
//            System.out.println(iterator2.next());
//        }
    }
}
