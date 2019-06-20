package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-18 22:17
 **/
public class Demo03_createThread02 {
    public static void main(String[] args){
        MyThread2 t = new MyThread2();

        Thread t1 = new Thread(t,"Thread 01");
        t1.start();

        Thread t2 = new Thread(t,"Thread 02");
        t2.start();
    }
}
