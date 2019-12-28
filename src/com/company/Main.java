package com.company;
class Hi implements Runnable{//Runnable has only one metheod run in its implimentation 
    @Override
	//overiden the default method
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
class Hello implements Runnable {
    @Override
	//overiden the default method
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        Thread t1=new Thread(obj1);//new thread t1 is made
        Thread t2=new Thread(obj2);//new thread t2 is made
        t1.start();//start thread t1
        try{Thread.sleep(10);}catch(Exception e){}//sleep for 10 milli sec
        t2.start();//start threaad t2

    }
}
