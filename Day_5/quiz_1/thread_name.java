package com.mycompany.test;
class running implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Thread name: " +name);
    }
}
public class Test {
    public static void main(String[] args) {
        running run = new running();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}
