package com.xfn.mf.thread;

/**
 * Created by po on 16/6/8.
 */
public class SimpleThread extends Thread {

    private int countDown = 5;
    private static int threadCount = 0;

    public SimpleThread() {
        super(Integer.toString(++threadCount));
        start();
    }

    public String toString() {
        return "#" + getName() + "(" + countDown + ").";
    }

    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0)
                return;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new SimpleThread();
    }
}
