package com.ranga.assignment;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class StreamEx {
  public static void main(String[] args) {
      List<String> list=Arrays.asList("a","b","c");
      List<String> upper=list
              .stream()
              .map(e->e.toUpperCase()).collect(Collectors.toList());
      System.out.println(upper);
  }
}
