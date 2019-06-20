package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-21 00:15
 **/
public class Demo06_ThreadGroup {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        ThreadGroup tp = new ThreadGroup("My Thread");
        Thread t1 = new Thread(tp,m);
        Thread t2 = new Thread(tp,new MyRunnable());

        ThreadGroup tg = t1.getThreadGroup();
        System.out.println(tg.getName());

        System.out.println(t2.getThreadGroup().getName());
        t1.start();
        t2.start();
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0;i<9;i++){
            System.out.println(t.getName()+":"+i);
        }
    }
}