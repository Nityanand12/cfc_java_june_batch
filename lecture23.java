import java.util.*;
public class lecture23 {
  public static void lis(){
    int arr[]={12,3,71,8,7,16,9,20,2};
    int dp[]= new int[arr.length];
    for(int i=0;i<arr.length;i++){
      int ans=0;
      for(int j=0;j<i;j++){
        if(arr[j]<arr[i]){
          ans= Math.max(ans,dp[j]);
        }
      }
      dp[i]= ans+1;
    }
    int ans=0;
    for(int ele: dp){
      ans=Math.max(ans,ele);
      System.out.print(ele+" ");
    }
    System.out.println();
    System.out.println(ans);
  }
  public static int editDistanceWithRecursion(String x,String y,int xPos,int yPos){
    if(xPos==0){
      return yPos;
    }
    if(yPos==0){
      return xPos;
    }
    if(x.charAt(xPos-1)==y.charAt(yPos-1)){
      return editDistanceWithRecursion(x,y,xPos-1,yPos-1);
    }
    else{
      int a= editDistanceWithRecursion(x,y,xPos-1,yPos);//insertion
      int b= editDistanceWithRecursion(x,y,xPos,yPos-1);//deletion
      int c= editDistanceWithRecursion(x,y,xPos-1,yPos-1);//swaping
      return Math.min(a, Math.min(b, c))+1;
    }
  }

  public static int editDistanceWithMemoization(String x,String y,int xPos,int yPos,int dp[][]){
    if(xPos==0){
      return dp[xPos][yPos]= yPos;
    }
    if(yPos==0){
      return dp[xPos][yPos]= xPos;
    }
    if(dp[xPos][yPos]!=0){
      return dp[xPos][yPos];
    }
    if(x.charAt(xPos-1)==y.charAt(yPos-1)){
      return dp[xPos][yPos]= editDistanceWithMemoization(x,y,xPos-1,yPos-1,dp);
    }
    else{
      int a= editDistanceWithMemoization(x,y,xPos-1,yPos,dp);//insertion
      int b= editDistanceWithMemoization(x,y,xPos,yPos-1,dp);//deletion
      int c= editDistanceWithMemoization(x,y,xPos-1,yPos-1,dp);//swaping
      return dp[xPos][yPos] = Math.min(a, Math.min(b, c))+1;
    }
  }
  public static int editDistanceWithTabulation(String x,String y,int dp[][]){

    for(int xPos=0;xPos<=x.length();xPos++){
      for(int yPos=0;yPos<=y.length();yPos++){
        if(xPos==0){
           dp[xPos][yPos]= yPos;
           continue;
        }
        if(yPos==0){
           dp[xPos][yPos]= xPos;
           continue;
        }
        if(x.charAt(xPos-1)==y.charAt(yPos-1)){
           dp[xPos][yPos]= dp[xPos-1][yPos-1];
        }
        else{
          int a= dp[xPos-1][yPos];//insertion
          int b= dp[xPos][yPos-1];//deletion
          int c= dp[xPos-1][yPos-1];//swaping
           dp[xPos][yPos] = Math.min(a, Math.min(b, c))+1;
        }
      }
    }
    return dp[dp.length-1][dp[0].length-1];
  }
  public static void editDistance(){
    String x="abcd";
    String y="acebd";
    // System.out.println(editDistanceWithRecursion(x,y,x.length(),y.length()));
    int dp[][]= new int[x.length()+1][y.length()+1];
    // System.out.println(editDistanceWithMemoization(x,y,x.length(),y.length(),dp));
    System.out.println(editDistanceWithTabulation(x,y,dp));
    for(int i=0;i<dp.length;i++){
      for(int j=0;j<dp[0].length;j++){
        System.out.print(dp[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    // lis();
    editDistance();
  }
}
