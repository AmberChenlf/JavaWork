package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-18 22:15
 **/
public class MyThread2 implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":" + i);
        }
    }
}
