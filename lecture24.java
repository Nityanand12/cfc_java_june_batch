import java.util.*;
public class lecture24 {
  public static int eggDropWithRecursion(int egg,int floor){
    if(floor==0){
      return 0;
    }
    if(egg==1){
      return floor;
    }
    int ans=Integer.MAX_VALUE;
    for(int f=1;f<=floor;f++){
      int broken= eggDropWithRecursion(egg-1,f-1);
      int notBroken= eggDropWithRecursion(egg,floor-f);
      ans=Math.min(ans, Math.max(broken, notBroken)+1);
    }
    return ans;
  }

  public static int eggDropWithMemoization(int egg,int floor,int dp[][]){
    if(floor==0){
      return dp[egg][floor]= 0;
    }
    if(egg==1){
      return dp[egg][floor]= floor;
    }
    if(dp[egg][floor]!=0){
      return dp[egg][floor];
    }
    int ans=Integer.MAX_VALUE;
    for(int f=1;f<=floor;f++){
      int broken= eggDropWithMemoization(egg-1,f-1,dp);
      int notBroken= eggDropWithMemoization(egg,floor-f,dp);
      ans=Math.min(ans, Math.max(broken, notBroken)+1);
    }
    return dp[egg][floor]=ans;
  }

  public static int eggDropWithTabulation(int totalEgg,int totalFloor,int dp[][]){
    for(int egg=1;egg<=totalEgg;egg++){
      for(int floor=1;floor<=totalFloor;floor++){
        if(floor==0){
           dp[egg][floor]= 0;
           continue;
        }
        if(egg==1){
           dp[egg][floor]= floor;
           continue;
        }
        int ans=Integer.MAX_VALUE;
        for(int f=1;f<=floor;f++){
          int broken= dp[egg-1][f-1]; 
          int notBroken= dp[egg][floor-f];
          ans=Math.min(ans, Math.max(broken, notBroken)+1);
        }
         dp[egg][floor]=ans;
      }
    }
    return dp[dp.length-1][dp[0].length-1];
  }
  public static void eggDrop(){
    int floor=15,egg=2;
    // System.out.println(eggDropWithRecursion(egg,floor));
    int dp[][]= new int[egg+1][floor+1];
    // System.out.println(eggDropWithMemoization(egg,floor,dp));
    System.out.println(eggDropWithTabulation(egg,floor,dp));
    for(int i=0;i<dp.length;i++){
      for(int j=0;j<dp[0].length;j++){
        System.out.print(dp[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static int mcmWithRecursion(int arr[],int i,int j){
    if(i+1==j){
      return 0;
    } 
    int finalAns=Integer.MAX_VALUE;
    for(int cut=i+1;cut<j;cut++){
      int left= mcmWithRecursion(arr,i,cut);
      int right= mcmWithRecursion(arr,cut,j);
      finalAns=Math.min(finalAns, left+right+arr[i]*arr[j]*arr[cut]);
    }
    return finalAns;
  }



  public static int mcmWithMemoization(int arr[],int i,int j,int dp[][]){
    if(i+1==j){
      return dp[i][j] = 0;
    } 
    if(dp[i][j]!=0){
      return dp[i][j];
    }
    int finalAns=Integer.MAX_VALUE;
    for(int cut=i+1;cut<j;cut++){
      int left= mcmWithMemoization(arr,i,cut,dp);
      int right= mcmWithMemoization(arr,cut,j,dp);
      finalAns=Math.min(finalAns, left+right+arr[i]*arr[j]*arr[cut]);
    }
    return dp[i][j]= finalAns;
  }

  public static int mcmWithTabulation(int arr[],int dp[][]){
    for(int gap=1;gap<arr.length;gap++){
      for(int i=0,j=gap;j<arr.length;i++,j++){
        if(i+1==j){
           dp[i][j] = 0;
           continue;
        } 
        int finalAns=Integer.MAX_VALUE;
        for(int cut=i+1;cut<j;cut++){
          int left= dp[i][cut];
          int right= dp[cut][j];
          finalAns=Math.min(finalAns, left+right+arr[i]*arr[j]*arr[cut]);
        }
         dp[i][j]= finalAns;
      }
    }
    return dp[0][dp.length-1];
  }
  public static void mcm(){
    int arr[]={1,3,5,4,2};
    // System.out.println(mcmWithRecursion(arr,0,arr.length-1));
    int dp[][]= new int[arr.length][arr.length];
    // System.out.println(mcmWithMemoization(arr,0,arr.length-1,dp));
    System.out.println(mcmWithTabulation(arr,dp));
    for(int i=0;i<dp.length;i++){
      for(int j=0;j<dp[0].length;j++){
        System.out.print(dp[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    // eggDrop();
    mcm();
  }
}
