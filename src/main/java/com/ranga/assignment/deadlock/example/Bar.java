package com.ranga.assignment.deadlock.example;

public class Bar {
  public synchronized void m1(Foo foo) {
    System.out.println("Bar m1() started");
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("trying to access foo lock");
    foo.m2();
    System.out.println("Bar m1() completed");
  }

  public  void m2() {
    System.out.println("Bar m2() invoked");
  }
}
