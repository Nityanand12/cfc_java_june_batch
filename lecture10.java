import java.util.*;
public class lecture10{
  public static void printIncreasing(int n){
    if(n==0){
      return;
    }
    printIncreasing(n-1);
    System.out.print(n+" ");
  }
  public static void printDecreasing(int n){
    if(n==0){
      return;
    }
    System.out.print(n+" ");
    printDecreasing(n-1);
  }
  public static int factorial(int n){
    if(n==0){
      return 1;
    }
    int ans=factorial(n-1);
    int myAns= n*ans;
    return myAns;
  } 
  public static int fibonacci(int n){
    if(n<=1){
      return n;
    }
    int left= fibonacci(n-1);
    int right= fibonacci(n-2);
    int ans= left+right;
    return ans;
    // return fibonacci(n-1)+fibonacci(n-2);
  }
  public static void fun(int n,int level){
    if(n<=2){
      System.out.println("Base "+n+" @ "+level);
      return;
    }
    System.out.println("Pre "+n+" @ "+level);
    fun(n-1,level+1);
    System.out.println("In "+n+" @ "+level);
    fun(n-2,level+1);
    System.out.println("Post "+n+" @ "+level);
  }
  public static void allSubsetWithoutReturnType(int arr[],int idx,String ans){
    if(idx==arr.length){
      System.out.println(ans);
      return;
    }
    allSubsetWithoutReturnType(arr,idx+1,ans);
    allSubsetWithoutReturnType(arr,idx+1,ans+arr[idx]+" ");
  }
  public static ArrayList<String> allSubsetWithReturnType(int arr[],int idx){
    if(idx==arr.length){
      ArrayList<String> base= new ArrayList<String>();
      base.add("");
      return base;
    }
    ArrayList<String> ans= allSubsetWithReturnType(arr,idx+1);
    ArrayList<String> myAns= new ArrayList<>();
    for(String ele: ans){
      myAns.add(ele);
    }
    for(String ele: ans){
      myAns.add(arr[idx]+" "+ele);
    }
    return myAns;
  }
  public static void allSubset(){
    int arr[]={1,2,3};
    allSubsetWithoutReturnType(arr,0,"");
    ArrayList<String> ans= allSubsetWithReturnType(arr, 0);
    for(String ele: ans){
      System.out.println(ele);
    }
  }
  public static void main(String[] args) {
    int n=5;
    // printIncreasing(n);
    // printDecreasing(n);
    // int ans= factorial(n);
    // System.out.println(ans);
    // System.out.println(fibonacci(6));
    // fun(n,0);
    allSubset();
  }
}