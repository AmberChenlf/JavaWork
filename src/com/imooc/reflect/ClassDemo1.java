package com.imooc.reflect;

/**
 * @author bingqiong.cbb
 * @date 2019-05-12 22:46
 **/
public class ClassDemo1 {
    public static void main(String[] args){
        Foo cl = new Foo();
        //Foo这个类 也是一个实例对象，class类的实例对象，怎么表示
        //任何一个类都是class的实例对象，这个实例对象有三种表达方式
        //第一种表达方式——>实际上在告诉我们任何一个类都有一个隐含的静态成员变量class
        Class c1 = Foo.class;
        System.out.println("class:"+c1);


        //第二种表达方式，已经知道该类的对象，通关getClass方法
        Class c2 = cl.getClass();
        System.out.println(c2);

        //不管C1/C2都代表了FOO类的类类型，一个类就只可能是class类的一个实例对象

        Class c3 = null;
        try {
            c3 = Class.forName("com.imooc.reflect.Foo");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        //完全可以通过类的类类型创建该类的对象实例——》通过c1/c2/c3创建Foo的实例
        try {
            Foo foo = (Foo) c2.newInstance();//需要有无参数的构造方法
            foo.print();
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }

    }
}
class Foo{
    void print(){

    }

        }
