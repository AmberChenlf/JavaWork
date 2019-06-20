package com.sikieduFourth.chapter1;

/**
 * @author bingqiong.cbb
 * @date 2019-06-14 21:04
 **/
public class MyThread extends Thread{
    public MyThread(){

    }
    public  MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        int j=0;
        for(int i=0;i<100;i++){
            if(interrupted()){
                System.out.println("释放资源");
                break;
            }
            System.out.println(getName()+":"+i);

            //j+=i;
        }
       // System.out.println("my"+System.currentTimeMillis());
    }
}
