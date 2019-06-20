package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-14 21:04
 **/
public class Demo01_createThread {
    public static void main(String[] args){
        System.out.println(Thread.NORM_PRIORITY+" "+Thread.MAX_PRIORITY+" "+Thread.MIN_PRIORITY);
        Thread mainThread = Thread.currentThread();
        mainThread.setPriority(10);
        MyThread my = new MyThread();
        System.out.println(mainThread.getPriority());
        System.out.println(my.getPriority());
        my.start();
        int j=0;
        for(int i=0;i<1000000;i++){
            //System.out.print("aa");
            j+=i;
        }
        System.out.println("main"+System.currentTimeMillis());
    }
}
