package com.sikieduFourth.chapter2;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author bingqiong.cbb
 * @date 2019-06-24 21:36
 **/
public class Demo1_InetAddress {
    public static void main(String[] args){
        InetAddress ip = null;
        try {
            ip = InetAddress.getByName("192.168.3.1");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(ip);
    }
}
