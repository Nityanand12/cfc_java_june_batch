import java.util.*;
public class lecture4{
  public static void pattern7(int n){
    int id=1,nst=1,nsp=n-1;
    while(id<=2*n-1){
      int csp=1;
      while(csp<=nsp){
        System.out.print(" ");
        csp++;
      }
      int cst=1;
      while(cst<=nst){
        if(cst<=(nst+1)/2){
          System.out.print(cst);
        }
        else{
          System.out.print(nst-cst+1);
        }
        cst++;
      }
      System.out.println();
      if(id<n){
        nst= nst+2;
        nsp= nsp-1;
      }
      else{
        nst= nst-2;
        nsp= nsp+1;
      }
      id++;
    }
  }

  public static void fun(int a, int b){
    int t= a;
    a=b;
    b=t;
    System.out.println(a+" "+b);
  }
  public static void fun2(int arr[]){
   int t= arr[1];
   arr[1] = arr[3];
   arr[3]= t;
  }
  public static void base10ToBase2(int num){
    int ans=0,pow=0;
    while(num!=0){
      ans= (int)Math.pow(10,pow)*(num%2)+ans;
      pow++;
      num= num/2;
    }
    System.out.println(ans);
  }
  public static void base2ToBase10(int num){
    int ans=0,pow=0;
    while(num!=0){
      ans= (int)Math.pow(2,pow)*(num%10)+ans;
      pow++;
      num= num/10;
    }
    System.out.println(ans);
  }
  public static void main(String[] args) {
  //  pattern7(5);

  base10ToBase2(19);
  base2ToBase10(10011);

  int[] arr= new int[5];
  arr[0]=12;
  arr[1]=99;
  arr[2]=10;
  arr[3]=18;
  arr[4]=16;
  // for(int i=0;i<arr.length;i++){
  //   System.out.println(arr[i]);
  // }

  // for(int ele : arr){
  //   System.out.println(ele);
  // }


  // int a=5,b=15;
  // fun(a,b);
  // System.out.println(a+" "+b);

  // fun2(arr);
  // System.out.println(arr);
  // for(int i=0;i<arr.length;i++){
  //   System.out.println(arr[i]);
  // }
  }
}