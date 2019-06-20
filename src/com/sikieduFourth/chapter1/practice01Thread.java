package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-18 22:51
 **/
public class practice01Thread extends Thread {
    private static int all = 100;
    private static Object lock = new Object();
    public practice01Thread(){}
    public practice01Thread(String st){
        super(st);
    }
    public void run(){

        while(true){
            synchronized (lock) {
                if (all == 0) {
                    System.out.println("票已售光");
                    break;
                }

                System.out.println(Thread.currentThread().getName() + "售出第" + all + "张票");
                all--;
            }
        }

    }
}
