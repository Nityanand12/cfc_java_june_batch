import java.util.*;
public class lecture21{
  public static int permutationWithRecursion(int arr[],int target){
    if(target==0){
      return 1;
    }
    int ans=0;
    for(int i=0;i<arr.length;i++){
      if(target-arr[i]>=0){
       ans+= permutationWithRecursion(arr,target-arr[i]);
      }
    }
    return ans;
  }



  public static int permutationWithMemoization(int arr[],int target,int dp[]){
    if(target==0){
      return dp[target]= 1;
    }
    if(dp[target]!=0){
      return dp[target];
    }
    int ans=0;
    for(int i=0;i<arr.length;i++){
      if(target-arr[i]>=0){
       ans+= permutationWithMemoization(arr,target-arr[i],dp);
      }
    }
    return dp[target] = ans;
  }

  public static int permutationWithTabulation(int arr[],int target,int dp[]){
    for(int i=0;i<=target;i++){
      if(i==0){
        dp[i]=1;
        continue;
      }
      int ans=0;
      for(int j=0;j<arr.length;j++){
        if(i-arr[j]>=0){
          ans= ans+ dp[i-arr[j]];
        }
      }
      dp[i]= ans;
    }
    return dp[dp.length-1];
  }
  public static int combination(int arr[],int dp[],int target){
    dp[0]=1;
    for(int i=0;i<arr.length;i++){
      for(int j=arr[i];j<=target;j++){
          dp[j]= dp[j]+dp[j-arr[i]];
      }
    }
    return dp[dp.length-1];
  }

  public static int unboundedKnapSackWithRecursion(int wt[],int val[],int cap){
    if(cap==0){
      return 0;
    }
    int ans=0;
    for(int i=0;i<wt.length;i++){
      if(cap-wt[i]>=0){
        ans=Math.max(ans,unboundedKnapSackWithRecursion(wt,val,cap-wt[i])+val[i]);
      }
    }
    return ans;
  }

  public static int unboundedKnapSackWithMemoization(int wt[],int val[],int cap,int dp[]){
    if(cap==0){
      return 0;
    }
    if(dp[cap]!=0){
      return dp[cap];
    }
    int ans=0;
    for(int i=0;i<wt.length;i++){
      if(cap-wt[i]>=0){
        ans=Math.max(ans,unboundedKnapSackWithMemoization(wt,val,cap-wt[i],dp)+val[i]);
      }
    }
    return dp[cap]= ans;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4};
    int target=4;
    // System.out.println(permutationWithRecursion(arr,target));
    // int dp[]= new int[target+1];
    // System.out.println(permutationWithMemoization(arr,target,dp));
    // for(int i=0;i<dp.length;i++){
    //   System.out.print(dp[i]+" ");
    // }
    // System.out.println();

    // System.out.println(permutationWithTabulation(arr,target,dp));
    // System.out.println(combination(arr,dp,target));
    // for(int i=0;i<dp.length;i++){
    //   System.out.print(dp[i]+" ");
    // }

    int wt[]={1,2,5,3};
    int val[]={5,12,18,20};
    int cap=5;
    // System.out.println(unboundedKnapSackWithRecursion(wt,val,cap));
    int dp2[]= new int[cap+1];
    System.out.println(unboundedKnapSackWithMemoization(wt,val,cap,dp2));
    list<Integer>al=new ArrayList<Integer>();
  }
}