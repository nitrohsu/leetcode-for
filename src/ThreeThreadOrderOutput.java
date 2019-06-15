import sun.misc.ConditionLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by N2Hsu on 6/15/2019.
 */
public class ThreeThreadOrderOutput {

    private volatile static boolean exit = false;

    private static final Object d = new Object();
    private static final Object a = new Object();

    public static void main(String[] args) {

        Thread digit = new DigitThread();
        Thread alphaBet = new AlphaBetThread();
        digit.start();
        alphaBet.start();

        try {
            digit.join();
            alphaBet.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class DigitThread extends Thread {

        int index = 0;

        @Override
        public void run() {
            try {
                while (true) {

                    if (index != 0) {
                        synchronized (d) {
                            d.wait();
                        }
                    }
                    if (exit) {
                        break;
                    }

                    System.out.print((index++ % 3) + 1);

                    synchronized (a) {
                        a.notify();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class AlphaBetThread extends Thread {

        char letter = 'A';

        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (a) {
                        a.wait();
                    }

                    System.out.print(letter++ + ",");

                    if (letter > 'Z') {
                        exit = true;

                        synchronized (d) {
                            d.notify();
                        }

                        break;
                    }

                    synchronized (d) {
                        d.notify();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
