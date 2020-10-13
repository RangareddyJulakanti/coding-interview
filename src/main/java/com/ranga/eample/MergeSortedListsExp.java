package com.ranga.eample;
class LinkedListNode{
    public int data;
    public  LinkedListNode next;

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
public class MergeSortedListsExp {
  public static void main(String[] args) {
    LinkedListNode head1=new LinkedListNode();
    head1.data=1;
    head1.next=new LinkedListNode();
    head1.next.data=2;
    head1.next.next=new LinkedListNode();
    head1.next.next.data=4;

      LinkedListNode head2=new LinkedListNode();
      head2.data=3;
      head2.next=new LinkedListNode();
      head2.next.data=4;
      head2.next.next=new LinkedListNode();
      head2.next.next.data=5;

      head2.next.next.next=new LinkedListNode();
      head2.next.next.next.data=6;

      LinkedListNode mergedList= mergeSorted(head1,head2);
      System.out.println(mergedList);
  }
    public static LinkedListNode mergeSorted(LinkedListNode head1,LinkedListNode head2){

       if(head1==null){
           return head2;
       }else if(head2==null){
           return  head1;
       }
      LinkedListNode mergedNode=null;
       if(head1.data<=head2.data){
           mergedNode=head1;
           head1=head1.next;
       }else{
           mergedNode=head2;
           head2=head2.next;
       }
       LinkedListNode mergedTail=mergedNode;
       while(head1!=null&&head2!=null){
           LinkedListNode temp=null;
           if(head1.data<=head2.data){
               temp=head1;
               head1=head1.next;
           }else{
               temp=head2;
               head2=head2.next;
           }
           mergedTail.next=temp;
           mergedTail=temp;
       }
       if(head1!=null){
           mergedTail.next=head1;
       }else if(head2!=null){
           mergedTail.next=head2;
       }
       return mergedNode;
    }
}

