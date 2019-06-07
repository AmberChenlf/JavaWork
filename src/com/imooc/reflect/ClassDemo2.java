package com.imooc.reflect;

/**
 * @author bingqiong.cbb
 * @date 2019-05-14 23:46
 **/
public class ClassDemo2 {
    public static void main(String[] args){
        Class c1 = int.class;//int的类类型
        System.out.println(c1.getName());
        Class c2 = String.class;//String类的类类型，String类字节码
        Class c3 = double.class;
        System.out.println(c3.getName());
        Class c4 = Double.class;
        System.out.println(c4.getName());

    }
}
