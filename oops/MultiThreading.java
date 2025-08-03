package oops;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running using Thread class.");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable interface.");
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}