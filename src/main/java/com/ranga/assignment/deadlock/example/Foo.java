package com.ranga.assignment.deadlock.example;

public class Foo {
    public synchronized void m1(Bar bar){
        System.out.println("Foo m1() started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("trying to access bar lock");
        bar.m2();
        System.out.println("Foo m1() completed");
    }
    public synchronized void m2(){
        System.out.println("Foo m2() completed");
    }
}
