package ru.home.lesson3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Counter {

    Lock lock = new ReentrantLock();
    private int count = 0;

    public static void main(String[] args) {
        Counter counter = new Counter();
        new Thread(()-> counter.upCount()).start();
        new Thread(()-> counter.upCount()).start();

    }

    public void upCount(){
        while (count < 30) {
            lock.lock();
            count++;
            System.out.println(count + " ("+ currentThread().getName() +")");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
        }
    }

}
