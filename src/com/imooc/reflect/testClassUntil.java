package com.imooc.reflect;

/**
 * @author bingqiong.cbb
 * @date 2019-05-15 23:11
 **/
public class testClassUntil {
    public static void main(String[] args){
        ClassUntil c = new ClassUntil();
        String s = new String();
        c.printVarMessage(s);
        System.out.println("_______________________________________");
        //c.printClassMessage(s);
        c.printConMessage(s);
    }
}
