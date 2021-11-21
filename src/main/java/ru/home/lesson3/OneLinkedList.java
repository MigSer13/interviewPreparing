package ru.home.lesson3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OneLinkedList<T> {
    private Item first;
    private Item last;
    int count;

    public OneLinkedList() {
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
            newItem = new Item(ob,null);
            first = newItem;
        } else {
            newItem = new Item(ob, null);
            if(last == null){
                first.next = newItem;
            } else {
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
                currentItem.ob = currentItem.next.ob;
                currentItem.next = currentItem.next.next;
            }

            currentItem = currentItem.next;
            if(currentItem == null){
                break;
            }
        }
    }

    public void invert(){
        Item next = null;

        while (true){
            if (first.next == null){
                first.next = next;
                break;
            }
            Item current = new Item(first.ob, next);
            next = current;
            first = first.next;
        }
    }

    public boolean isCiclicLink(){
        Set<T> set = new HashSet<>();
        Item current = first;
        while (true){
            if (set.contains(current.ob)){
               return true;
            }
            set.add(current.ob);
            current = current.next;
            if(current == null){
                break;
            }
        }

        return false;
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
        private Item next;

        private Item(T ob, Item next) {
            this.ob = ob;
            this.next = next;
        }
    }
}