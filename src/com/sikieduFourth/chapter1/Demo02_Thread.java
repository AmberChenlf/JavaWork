package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-17 22:06
 **/
public class Demo02_Thread {
    public static void main(String[] args) throws InterruptedException {
        //线程的休眠
        /*System.out.println(System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis());*/


        MyThread t1 = new MyThread("线程1");
        //t1.setName("线程1");
        System.out.println(t1.getName());

        t1.start();
        //t1.join();//t1加入当前线程中继续运行；
        Thread.sleep(1);
        t1.interrupt();
        MyThread t2= new MyThread("线程2");
        //System.out.println(t2.getName());
       // t2.setDaemon(true);
        t2.start();

    }
}
