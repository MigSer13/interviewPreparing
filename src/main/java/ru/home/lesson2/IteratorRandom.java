package ru.home.lesson2;

import java.util.Iterator;

public class IteratorRandom implements Iterator {

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object next() {
        return (int) (Math.random() * 100) + 1;
    }
}
