import java.util.*;

public class lecture15 {
  static class Node {
    int value;
    Node next;

    Node(int value) {
      this.value=value;
      next=null;
    }
  }

  static class CustomLikedList {
    int size;
    Node head, tail;

    CustomLikedList() {
      size = 0;
      head = null;
      tail = null;
    }

    public void addFirst(int data){
      if(size==0){
        addLast(data);
        return;
      }
      size++;
      Node node = new Node(data);
      node.next=head;
      head= node;
    }

    public void addLast(int data) {
      Node node = new Node(data);
      if (size == 0) {
        head = node;
        tail= node;
        size++;
      }
      else{
        tail.next=node;
        tail= node;
        size++;
      }
    }
    public Integer removeLast(){
       if(size==0){
         System.out.println("Currently LinkedList is Empty");
         return null;
       }

       if(size==1){
           int ans= head.value;
           head=null;
           tail=null;
           size--;
           return ans;  
       }
       size--;
       Node temp= head;
       while(temp.next!=tail){
         temp= temp.next;
       }
       int ans= tail.value;
       temp.next= null;
       tail= temp;
       return ans;
    }
    public Integer removeFirst(){
      if(size<=1){
        removeLast();
        return null;
      }
      int ans= head.value;
      head=head.next;
      size--;
      return ans;
    }
    public void display(){
      if(size==0){
        System.out.println("Currently LinkedList is Empty");
        return;
      }
      Node temp= head;
      while(temp!=null){
        System.out.print(temp.value+" ");
        temp= temp.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    CustomLikedList l1 = new CustomLikedList();
    l1.addLast(15);
    l1.addLast(10);
    l1.addLast(25);
    l1.addFirst(35);
    l1.addFirst(71);
    l1.removeLast();
    l1.addLast(2);
    l1.removeFirst();
    l1.display();
    System.out.println(l1.size);
  }
}