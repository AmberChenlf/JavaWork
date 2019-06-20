package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-18 22:27
 **/
public class Demo04_createThread {
    public static void main(String[] args) {
        //匿名内部类
        /*Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        };
        Thread t = new Thread(r, "匿名内部类线程");
        t.start();
        new Thread(r,"匿名内部类线程2").start();*/

        Thread t = new Thread(){
            public void run(){
                for (int i = 0; i <100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }

            }
        };
        t.start();
    }
}
