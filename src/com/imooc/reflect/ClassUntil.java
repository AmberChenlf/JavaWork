package com.imooc.reflect;

/**
 * @author bingqiong.cbb
 * @date 2019-05-14 23:52
 **/
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
public class ClassUntil {
    /*
    打印
     */
    public static void printClassMessage(Object obj){
        //获取类的信息，先获得类的类类型
        //获得类的类类型的方法：类名.class；对象.class;class.forName
        Class c = obj.getClass();//传递的是哪个子类对象，就是子类对象的类类型
        //
        System.out.println("类的名称："+c.getName());
        //Method类是方法的对象
        //一个成员方法就是一个method对象
        //getMethod()获取public方法
        //getDeclaredMethods(）获取的是所有该类自己声明的方法，不问访问权限
        Method[] ms = c.getMethods();//c.getDeclaredMethod()；
        for(int i=0; i<ms.length;i++){
            Class returnType = ms[i].getReturnType();
            System.out.print("方法的返回值类型："+returnType.getName()+" ");
            System.out.print("方法的名称"+ms[i].getName()+"(");
            //获取参数类型-得到参数列表的类型的类类型
            Class[] paramTypes = ms[i].getParameterTypes();
            for (Class class1:paramTypes
                 ) {
                System.out.print(class1.getName()+",");

            }
            System.out.println(")");


        }


    }
    public static void printVarMessage(Object obj){
        /*
            成员变量也是对象
            java.lang.reflect.Field
            Field封装量关于成员变量的操作
            getFields() 方法获取的是所有public的成员变量的信息
            getDeclaredFields获取的是该类自己声明的成员变量的信息
             */
        Class c = obj.getClass();
        Field[] fs = c.getDeclaredFields();
        for (Field field:fs
        ) {
            Class fieldType = field.getType();
            String typeName = fieldType.getName();
            System.out.println(typeName+" "+typeName);

        }
    }

    /*
    打印构造函数
     */
    public static void printConMessage(Object obj){
        Class c = obj.getClass();
        //构造函数也是对象
        //java.lang.reflect.Constructor
        //getCounstructor获取所有的public
        //getDeclaredConstructors获取声明的
        Constructor[] con = c.getDeclaredConstructors();
        for (Constructor cs:con
             ) {
            System.out.print(cs.getName()+"(");
            Class[] paramTypes = cs.getParameterTypes();
            for(Class c1:paramTypes){
                System.out.print(c1.getName()+",");
            }
            System.out.println(")");

        }
    }
}
