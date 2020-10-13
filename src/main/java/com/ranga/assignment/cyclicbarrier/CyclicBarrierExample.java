package com.ranga.assignment.cyclicbarrier;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java program to demonstrate how to use CyclicBarrier in Java. CyclicBarrier is a
 * new Concurrency Utility added in Java 5 Concurrent package.
 *
 * @author Javin Paul
 */
public class CyclicBarrierExample {
    private static Map<Thread,Integer> result=new HashMap<>();
    //Runnable task for each thread
    private static class Task implements Runnable {

        private CyclicBarrier barrier;
        int i=0;
        public Task(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
                System.out.println(Thread.currentThread().getName() + " is waiting on barrier");

            try {
                barrier.await();
                result.put(Thread.currentThread(),++i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) throws BrokenBarrierException, InterruptedException {

        //creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()
        final CyclicBarrier cb = new CyclicBarrier(3, new Runnable(){
            @Override
            public void run(){
                //This task will be executed once all thread reaches barrier
                System.out.println("All parties are arrived at barrier, lets play");
            }
        });

        //starting each of thread
        Thread t1 = new Thread(new Task(cb), "Thread 1");
        Thread t2 = new Thread(new Task(cb), "Thread 2");
        Thread t3 = new Thread(new Task(cb), "Thread 3");

        t1.start();
        t2.start();
        t3.start();

         t1.join();
         t2.join();
         t3.join();
     System.out.println(result);
    }
}