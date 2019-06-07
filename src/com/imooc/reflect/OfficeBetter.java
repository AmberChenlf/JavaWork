package com.imooc.reflect;

/**
 * @author bingqiong.cbb
 * @date 2019-05-14 23:22
 **/
import com.imooc.reflect.OfficeBetter;
public class OfficeBetter {
    public static void main(String[] args){
        try{
            //动态加载类在运行时刻加载
            Class c = Class.forName(args[0]);

            //通过类类型，创建该类对象
            OfficeAble oa = (OfficeAble)c.getDeclaredConstructor().newInstance();
            oa.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
