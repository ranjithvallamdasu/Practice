package java8;

import java.util.concurrent.TimeUnit;

public class SynchronizedTest {

    private synchronized void doSomeSync(){


            System.out.println("in sync method wating for 5 seconds");

            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(5));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("sync method completed");
    }
    private void doNonSync(){
        System.out.println("in non sync method waiting for 2 seconds");
        System.out.println("calling sync method");
        doSomeSync();
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("non sync method completed");
    }
    public static void main(String[] args) {

        SynchronizedTest synchronizedTest = new SynchronizedTest();
        Thread t1 = new Thread(()->{
            synchronizedTest.doSomeSync();
        });

        Thread t2 = new Thread(()->{
            synchronizedTest.doNonSync();
        });
        t1.start();
        t2.start();
    }
}
