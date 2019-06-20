package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-19 23:37
 **/
public class Ticket {
    public static  void main(String[] args) {
        Object lock = new Object();

        TicketWindow win = new TicketWindow(lock);
        TicketApp app = new TicketApp(lock);
        new Thread(win).start();
        new Thread(app).start();
    }
}
