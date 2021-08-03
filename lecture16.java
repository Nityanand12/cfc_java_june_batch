import java.util.*;
public class lecture16 {
  static class khudKaStack{
    int defaultSize=10;
    int arr[];
    int top;
    public khudKaStack(){
      arr= new int[defaultSize];
      top=-1;
    }
    public void resize(int arr[]){
      int newArr[]= new int[defaultSize*2];
      defaultSize=defaultSize*2;
      for(int i=0;i<=top;i++){
        newArr[i]= arr[i];
      }
      this.arr= newArr;
    }
    public void push(int value){
      if(top+1==defaultSize){
        resize(arr);
      }
      top=top+1;
      arr[top]=value;
    }
    public Integer pop(){
      if(top==-1){
        System.out.println("Stack is empty");
        return null;
      }
      int ans= arr[top];
      top--;
      return ans;
    }
    public Integer peek(){
      if(top==-1){
        System.out.println("Stack is empty");
        return null;
      }
      return arr[top];
    }
    public boolean empty(){
      if(top==-1) return true;
      return false;
    }
    public Integer size(){
      return top+1;
    }
  }
  public static void main(String[] args) {
    khudKaStack st1= new khudKaStack();
    // st1.push(10);
    // st1.push(15);
    // st1.push(27);
    // st1.pop();
    // st1.push(35);
    // System.out.println(st1.peek());
    // System.out.println(st1.size());
    for(int i=1;i<=19;i++){
      st1.push(i*10);
    }
    System.out.println(st1.size());
    System.out.println(st1.peek());
  }
}