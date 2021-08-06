import java.util.*;
public class lecture17 {
  public static char openBracket(char ch){
    if(ch=='{') return '}';
    else if(ch=='[') return ']';
    else return ')';
  }
  public static void balancedParenthesis(){
    String s="[{}{()}{([])}]]";
    Stack<Integer>st= new Stack<Integer>();
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
        st.push(i);
      }
      else{
         if(st.size()==0||s.charAt(i)!=openBracket(s.charAt(st.peek()))){
           System.out.println("String is not balanced");
           return;
         } 
         else{
           st.pop();
         }
      }
    }
    if(st.size()==0){
      System.out.println("String is balanced");
    }
    else{
      System.out.println("String is not balanced");
    }
  }
  public static void nextGreaterElement1(){
    int arr[]={12,4,65,7,41,6,19,65,102,54,16,76};
    Stack<Integer>st= new Stack<>();
    for(int i=0;i<arr.length;i++){
      while(st.size()!=0&&st.peek()<arr[i]){
        System.out.println("Next Greater element of "+st.pop()+" is "+arr[i]);
      }
      st.push(arr[i]);
    }
    while(st.size()!=0){
      System.out.println("Next Greater element of "+st.pop()+" is -1");
    }
  }
  public static void nextGreaterElement(){
    int arr[]={12,4,65,7,41,6,19,65,102,54,16,76};
    int ans[]= new int[arr.length];
    Stack<Integer>st= new Stack<>();
    for(int i=0;i<arr.length;i++){
      while(st.size()!=0&&arr[st.peek()]<arr[i]){
        // System.out.println("Next Greater element of "+st.pop()+" is "+arr[i]);
        ans[st.pop()]= arr[i];
      }
      st.push(i);
    }
    while(st.size()!=0){
      // System.out.println("Next Greater element of "+st.pop()+" is -1");
      ans[st.pop()]= -1;
    }
    for(int i=0;i<arr.length;i++){
      System.out.println("Next greater element of "+arr[i]+" is "+ans[i]);
    }
  }
  public static void nextSmallerElement(){
    int arr[]={12,4,65,7,41,6,19,65,102,54,16,76};
    int ans[]= new int[arr.length];
    Stack<Integer>st= new Stack<>();
    for(int i=0;i<arr.length;i++){
      while(st.size()!=0&&arr[st.peek()]>arr[i]){
        ans[st.pop()]= arr[i];
      }
      st.push(i);
    }
    while(st.size()!=0){
      ans[st.pop()]= -1;
    }
    for(int i=0;i<arr.length;i++){
      System.out.println("Next smaller element of "+arr[i]+" is "+ans[i]);
    }
  }
  public static void previousGreaterElement(){
    int arr[]={12,4,65,7,41,6,19,65,102,54,16,76};
    int ans[]= new int[arr.length];
    Stack<Integer>st= new Stack<>();
    for(int i=arr.length-1;i>=0;i--){
      while(st.size()!=0&&arr[st.peek()]<arr[i]){
        // System.out.println("Next Greater element of "+st.pop()+" is "+arr[i]);
        ans[st.pop()]= arr[i];
      }
      st.push(i);
    }
    while(st.size()!=0){
      // System.out.println("Next Greater element of "+st.pop()+" is -1");
      ans[st.pop()]= -1;
    }
    for(int i=0;i<arr.length;i++){
      System.out.println("Next greater element of "+arr[i]+" is "+ans[i]);
    }
  }
  public static void previousSmallerElement(){
    int arr[]={12,4,65,7,41,6,19,65,102,54,16,76};
    int ans[]= new int[arr.length];
    Stack<Integer>st= new Stack<>();
    for(int i=arr.length-1;i>=0;i--){
      while(st.size()!=0&&arr[st.peek()]>arr[i]){
        // System.out.println("Next Greater element of "+st.pop()+" is "+arr[i]);
        ans[st.pop()]= arr[i];
      }
      st.push(i);
    }
    while(st.size()!=0){
      // System.out.println("Next Greater element of "+st.pop()+" is -1");
      ans[st.pop()]= -1;
    }
    for(int i=0;i<arr.length;i++){
      System.out.println("Next smaller element of "+arr[i]+" is "+ans[i]);
    }
  }
  public static void main(String[] args) {
    // balancedParenthesis();
    // nextGreaterElement1();
    // nextGreaterElement();
    // nextSmallerElement();
    // previousGreaterElement();
    previousSmallerElement();
  }
}
