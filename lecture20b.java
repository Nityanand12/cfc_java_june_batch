import java.util.*;
public class lecture20b {

  public static int fibonacciWithRecursion(int num){
    if(num<=1){
      return num;
    }
    int left= fibonacciWithRecursion(num-1);
    int right= fibonacciWithRecursion(num-2);
    return left+right;
  }
  public static int fibonacciWithMemoization(int num,int dp[]){
    if(num<=1){
      return dp[num]= num;
    }
    if(dp[num]!=0){
      return dp[num];
    }
    int left= fibonacciWithMemoization(num-1,dp);
    int right= fibonacciWithMemoization(num-2,dp);
    return dp[num] = left+right;
  }
  public static int fibonacciWithTabulation(int num,int dp[]){
   for(int i=0;i<=num;i++){
     if(i<=1){
       dp[i]=i;
       continue;
     }
     dp[i]=dp[i-1]+dp[i-2];
   }
   return dp[dp.length-1];
  }
  public static void main(String[] args) {
    int n=45;
    // long start= System.currentTimeMillis();
    // System.out.println(fibonacciWithRecursion(n));
    // long end= System.currentTimeMillis();
    // System.out.println(end-start);

    int dp[]= new int[n+1];
    // long start= System.currentTimeMillis();
    // System.out.println(fibonacciWithMemoization(n,dp));
    // long end= System.currentTimeMillis();
    // System.out.println(end-start);

    // for(int ele: dp){
    //   System.out.print(ele+" ");
    // }

    // long start= System.currentTimeMillis();
    // System.out.println(fibonacciWithTabulation(n,dp));
    // long end= System.currentTimeMillis();
    // System.out.println(end-start);

  }
}
