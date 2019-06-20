package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-19 23:38
 **/
public class TicketWindow implements Runnable {
    Object lock;
    public TicketWindow(Object lock){
        this.lock=lock;
    }

    public void run(){
        while(TicketMng.ticket>0){
            synchronized (lock) {
                System.out.println("window sells " + TicketMng.ticket + "'s ticket");
                TicketMng.ticket--;
            }
        }
    }
}
