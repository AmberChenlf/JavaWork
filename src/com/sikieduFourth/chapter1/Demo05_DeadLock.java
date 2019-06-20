package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-20 23:59
 **/
public class Demo05_DeadLock {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();
    public static void main(String[] args){
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();

    }
}
class Thread1 implements Runnable{
    public void run(){
        synchronized(Demo05_DeadLock.lock1){
            System.out.println("T1 get lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Demo05_DeadLock.lock2){
                System.out.println("T1 get lock2");
            }

        }

        }

}

class Thread2 implements Runnable{
    @Override
    public void run() {
        synchronized(Demo05_DeadLock.lock2){
            System.out.println("T2 get lock2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Demo05_DeadLock.lock1){
                System.out.println("T2 get lock1");
            }
        }

    }
}
