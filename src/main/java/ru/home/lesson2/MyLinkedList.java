package ru.home.lesson2;

import java.util.Iterator;

public class MyLinkedList<T> {
    private Item first;
    private Item last;
    int count;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.count = 0;
    }

    public int size(){
        return count;
    }

    public void add(T ob){
        Item newItem;
        if(first == null){
            newItem = new Item(ob, null, null);
            first = newItem;
        } else {
            if(last == null){
                newItem = new Item(ob, first, null);
                first.next = newItem;
            } else {
                newItem = new Item(ob, last, null);
                last.next = newItem;
            }
            last = newItem;
        }
        count++;
    }

    public void remove(T removedObject){
        Item currentItem = first;

        while (true){
            if(currentItem.ob.equals(removedObject)){
                currentItem.ob = null;
                if(currentItem.prev == null){
                    Item wasNext = currentItem.next;
                    wasNext.prev = null;
                    currentItem = wasNext;
                } else {
                    Item wasPrev = currentItem.prev;
                    Item wasNext = currentItem.next;
                    wasPrev.next = wasNext;
                    wasNext.prev = wasPrev;
                }
            }

            currentItem = currentItem.next;
            if(currentItem == null){
                break;
            }
        }
    }


    public Iterator<T> iterator() { return new MyIterator(); }

    private class MyIterator implements Iterator<T> {
        private Item item = first;

        @Override
        public boolean hasNext() {
            return item != null;
        }

        @Override
        public T next() {
            T ob = item.ob;
            item = item.next;
            return ob;
        }
    }

    private class Item {
        private T ob;
        private Item prev;
        private Item next;

        private Item(T ob, Item prev, Item next) {
            this.ob = ob;
            this.prev = prev;
            this.next = next;
        }
    }
}