package com.ranga.assignment;

public class SingleLinkedList<T> {
    static class Node<T>{
        T data;
        Node next;

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

    }
   /* static Node<T> createNode(T t){

    }*/
   static <T> boolean isLinked(Node<T> h){
       if(h==null){
           return true;
       }
       Node<T> n=h.getNext();
       while(n!=null&&n!=h){
           n=n.getNext();
           if(n==h){
            return true;
           }
       }
      return false;
   }


}
