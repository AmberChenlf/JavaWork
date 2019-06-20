package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-18 22:37
 **/
public class practice01Runnable implements Runnable {
    private int all = 100;
    private Object lock = new Object();
    public void run(){

        while(all>0){
            sellTicket();
//            synchronized (lock) {//第一个线程来得时候会锁上，并拿走钥匙；执行完后归还钥匙
//                if (all <= 0) {
//                    System.out.println("票已售光");
//                    break;
//                } else {
//                    System.out.println(Thread.currentThread().getName() + "售出第" + all + "张票");
//                    all--;
//
//                }
//            }
        }

    }
    public synchronized void sellTicket(){
        if(all>0){
            System.out.println(Thread.currentThread().getName() + "售出第" + all +"张票");
            all--;
        }
    }

}
