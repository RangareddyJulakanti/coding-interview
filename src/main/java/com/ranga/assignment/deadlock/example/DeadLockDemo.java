package com.ranga.assignment.deadlock.example;

public class DeadLockDemo {
    public static  final Foo foo=new Foo();
    public static  final Bar bar=new Bar();
  public static void main(String[] args) {

      MyThread1 t1=new MyThread1();
      MyThread2 t2=new MyThread2();
        t1.start();t2.start();
  }
}
class MyThread1 extends Thread{
    public void run(){
        DeadLockDemo.foo.m1(DeadLockDemo.bar);
    }
}
class MyThread2 extends Thread{
    public void run(){
        DeadLockDemo.bar.m1(DeadLockDemo.foo);
    }
}