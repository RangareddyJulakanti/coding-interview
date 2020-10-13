package com.ranga.eample;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Test {
  public static void main(String[] args) {
    //
      String[] input={
              "Akhilesh",
              "Rao",
              "Mahesh",
              "Kumar"
      };
      String[] output=method(input);
      Stream.of(output).forEach(System.out::println);
  }
    public static String[] method(String[] input){
       OptionalInt highLengthOptional=Stream.of(input).mapToInt(String::length).max();
       int highLength=highLengthOptional.getAsInt();
       String[] outPutString=new String[highLength];
       for(int i=0;i<highLength;i++){
           AtomicInteger finalI = new AtomicInteger(i);
           StringBuilder sb=new StringBuilder();
           Stream.of(input).map(word->{
                                       try{
                                         return  word.charAt(finalI.get());
                                       }
                                       catch(Exception e){
                                           return ' ';
                                       }

                       })
                   .forEach(c->sb.append(c.charValue()));
           outPutString[i]=sb.toString();
       }
      return outPutString;
    }
}
