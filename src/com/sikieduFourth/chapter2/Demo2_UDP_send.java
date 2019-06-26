package com.sikieduFourth.chapter2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author bingqiong.cbb
 * @date 2019-06-24 22:57
 **/
public class Demo2_UDP_send {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        Scanner input = new Scanner(System.in);
        while(true) {
            String str = input.nextLine();
            if(str.equals("end"))break;
            byte[] buf = str.getBytes();
            int length = buf.length;
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            int port = 7878;
            DatagramPacket dp = new DatagramPacket(buf, length, ip, port);
            ds.send(dp);
        }
      ds.close();
    }
}
