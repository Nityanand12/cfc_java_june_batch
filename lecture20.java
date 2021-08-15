import java.util.*;
public class lecture20{
  static class CustomCircularQueue{
    Integer arr[];
    int front,rear,size,defaultSize=10;
    public CustomCircularQueue(){
      arr= new Integer[defaultSize];
      front= 0;
      rear=-1;
      size=0;
    }
    public void add(int value){
      if(isFull()){
        System.out.println("Queue is filled");
        return;
      }
      rear=(rear+1)%arr.length;
      size++;
      arr[rear]= value;
    }
    public boolean isFull(){
      return size==arr.length;
    } 
    public Integer remove(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return null;
      }
      int ans= arr[front];
      front=(front+1)%arr.length;
      size--;
      return ans;
    }
    public boolean isEmpty(){
      return size==0;
    }

  }
  static class DynamicCircularQueue extends CustomCircularQueue{
    @Override
    public void add(int value){
      if(isFull()){
        Integer newArray[]= new Integer[super.arr.length*2];
        for(int i=0;i<super.arr.length;i++){
          newArray[i]= super.arr[front];
          front=(front+1)%super.arr.length;
        }
        super.arr=newArray;
        super.front=0;
        super.rear=size-1;
      }
      super.add(value);
    }
  }
  public static void main(String args[]){
    // CustomCircularQueue cq1= new CustomCircularQueue();
    // cq1.add(10);
    // cq1.add(20);
    // cq1.add(35);
    // cq1.add(40);
    // cq1.add(25);
    // System.out.println(cq1.size);
    // System.out.println(cq1.remove());
    // System.out.println(cq1.remove());
    // System.out.println(cq1.size);
    // cq1.add(28);
    // cq1.add(93);
    // System.out.println(cq1.size);
    // for(int i=1;i<=15;i++){
    //   cq1.add(i);
    // }



    // DynamicCircularQueue dq1= new DynamicCircularQueue();
    // for(int i=1;i<=25;i++){
    //   dq1.add(i);
    // }
    // System.out.println(dq1.size);
    // System.out.println(dq1.remove());
    // System.out.println(dq1.remove());
    // System.out.println(dq1.size);


    Queue<Integer>que= new LinkedList<>();
    // for(int i=1;i<=20;i++){
    //   que.add(i);
    // }
    // System.out.println(que.size());
    // while(que.size()!=0){
    //   System.out.println(que.remove());
    // }
    Queue<String>que2= new LinkedList<>();
    int cnt=1;
    int target=20;
    que2.add("1");
    while(cnt<target){
      String rem= que2.remove();
      System.out.print(rem+" ");
      if(cnt+1<=target){
        que2.add(rem+"0");
        cnt++;
      }
      if(cnt+1<=target){
        que2.add(rem+"1");
        cnt++;
      }
    }
    while(que2.size()!=0){
      System.out.print(que2.remove()+" ");
    }
  }
}