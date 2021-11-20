package ru.home.lesson3;

public class PingPong {
    private boolean writtenPing = false;

    public synchronized void writePing() {
        while (true) {
            while (writtenPing) {
                try {
                    Thread.sleep(1000);
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Ping");
            writtenPing = true;
            this.notifyAll();
        }
    }

    public synchronized void writePong() {
        while (true) {
            while (!writtenPing) {
                try {
                    Thread.sleep(1000);
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Pong");
            writtenPing = false;
            this.notifyAll();
        }
    }

    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        new Thread(() -> pingPong.writePing()).start();
        new Thread(() -> pingPong.writePong()).start();
    }

}
