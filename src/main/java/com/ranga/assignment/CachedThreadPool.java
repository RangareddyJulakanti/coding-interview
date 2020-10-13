package com.ranga.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CachedThreadPool {
  public static void main(String[] args) {
      ThreadPoolExecutor executorService= (ThreadPoolExecutor) Executors.newCachedThreadPool();
      AtomicInteger i=new AtomicInteger(0);
      int k=0;
      List<Future> results=new ArrayList<>();
      while(k<5){
        // i.getAndIncrement();
          final Future<?> submit = executorService.submit(() -> {System.out.println(Thread.currentThread().getName()+"task" + i.get());
              try {
                  Thread.sleep(3000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          });
          results.add(submit);
          k++;
      }
      int l=0;
for (Future result :results ) {
      if (l < 4) {
        try {
          System.out.println("result" + result.get());
        } catch (InterruptedException e) {
          e.printStackTrace();
        } catch (ExecutionException e) {
          e.printStackTrace();
        }
    }
}
    System.out.println(executorService.getCompletedTaskCount());
  }
}
