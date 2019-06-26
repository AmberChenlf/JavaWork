package com.sikieduFourth.chapter2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author bingqiong.cbb
 * @date 2019-06-24 23:10
 **/
public class Demo3_UDP_Receive {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(7878);
        while(true) {
            byte[] buf = new byte[1024];
            int length = buf.length;
            DatagramPacket dp = new DatagramPacket(buf, length);
            ds.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());
            InetAddress address = dp.getAddress();//发送端地址
            System.out.println(address + ":" + str);
        }
//        System.out.println(dp.getPort());//发送端端口
//        ds.close();

    }
}
