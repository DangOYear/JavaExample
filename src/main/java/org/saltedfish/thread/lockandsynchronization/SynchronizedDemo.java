package org.saltedfish.thread.lockandsynchronization;

class Caculate {
    int count = 0;

    public void add(int n) {
        synchronized (this) {
            count += n;
        }
    }

    public void dec(int n) {
        synchronized (this) {
            count -= n;
        }
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        Caculate caculate = new Caculate();
        Thread threadAdd = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                caculate.add(1);
                System.out.println("add:" + caculate.count);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread threadDec = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                caculate.dec(1);
                System.out.println("dec:" + caculate.count);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadAdd.start();
        threadDec.start();
    }
}
