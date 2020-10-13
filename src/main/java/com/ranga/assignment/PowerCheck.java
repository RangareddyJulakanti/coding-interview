package com.ranga.assignment;

import java.util.ArrayList;
import java.util.List;

public class PowerCheck {
  public static boolean isPowerOfTwo(int n) {
    if (n == 0) {
      return false;
      }
    return (n&(n-1))==0;
  }

  public static <T extends Number> List<T> process(List<T> list){

    return list;
  }
  public static void main(String[] args) {
    System.out.println(isPowerOfTwo(1024));
    List<? extends Number> res=process(new ArrayList<Integer>());
  }
}
