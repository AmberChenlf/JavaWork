package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-18 22:35
 **/
public class Pracitce01 {
    public static void main(String[] args){
        practice01Runnable r = new practice01Runnable();
        Thread t1=new Thread(r,"售票站1");
        t1.start();
        Thread t2=new Thread(r,"售票站2");
        t2.start();
        Thread t3=new Thread(r,"售票站3");
        t3.start();
        Thread t4=new Thread(r,"售票站4");
        t4.start();

//        practice01Thread th1 = new practice01Thread("售1");
//        th1.start();
//
//        practice01Thread th2 = new practice01Thread("售2");
//        th2.start();
//
//        practice01Thread th3 = new practice01Thread("售3");
//        th3.start();
//
//        practice01Thread th4 = new practice01Thread("售4");
//        th4.start();
    }

}
