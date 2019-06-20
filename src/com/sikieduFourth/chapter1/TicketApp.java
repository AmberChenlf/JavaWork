package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-19 23:39
 **/
public class TicketApp implements Runnable {
    Object lock;
    public TicketApp(Object lock){
        this.lock=lock;
    }

    public void run(){
        while(TicketMng.ticket>0){
            synchronized (lock) {
                System.out.println("App sells " + TicketMng.ticket + "'s ticket");
                TicketMng.ticket--;
            }
        }
    }
}
