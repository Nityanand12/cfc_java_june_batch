import java.util.*;
public class lecture11{
  
  
  public static void permutationWithRepetition(int arr[],int target,int sum,String ans){
    if(sum==target){
      System.out.println(ans);
      return;
    }
    for(int i=0;i<arr.length;i++){
      if(sum+arr[i]<=target){
        permutationWithRepetition(arr,target,sum+arr[i],ans+arr[i]+" ");
      }
    }
  }
  public static void permutationWithRepetition(){
    int arr[]={1,2,3,4};
    int target=4;
    permutationWithRepetition(arr,target,0,"");
  }







  public static void combinationWithRepetition(int arr[],int target,int sum,String ans,int index){
    if(sum==target){
      System.out.println(ans);
      return;
    }
    for(int i=index;i<arr.length;i++){
      if(sum+arr[i]<=target){
        combinationWithRepetition(arr,target,sum+arr[i],ans+arr[i]+" ",i);
      }
    }
  }
  public static void combinationWithRepetition(){
    int arr[]={1,2,3,4};
    int target=4;
    combinationWithRepetition(arr,target,0,"",0);
  }





  public static void combinationWithoutRepetition(int arr[],int target,int sum,String ans,int index){
    if(sum==target){
      System.out.println(ans);
      return;
    }
    for(int i=index;i<arr.length;i++){
      if(sum+arr[i]<=target){
        combinationWithoutRepetition(arr,target,sum+arr[i],ans+arr[i]+" ",i+1);
      }
    }
  }
  public static void combinationWithoutRepetition(){
    int arr[]={1,2,3,4};
    int target=4;
    combinationWithoutRepetition(arr,target,0,"",0);
  }







  public static void permutationWithoutRepetition(int arr[],int target,int sum,String ans,int vis[]){
    if(sum==target){
      System.out.println(ans);
      return;
    }
    for(int i=0;i<arr.length;i++){
      if(sum+arr[i]<=target&&vis[i]==0){
        vis[i]=1;
        permutationWithoutRepetition(arr,target,sum+arr[i],ans+arr[i]+" ",vis);
        vis[i]=0;
      }
    }
  }
  public static void permutationWithoutRepetition(){
    int arr[]={1,2,3,4};
    int target=4;
    int vis[]= new int[arr.length];
    permutationWithoutRepetition(arr,target,0,"",vis);
  }

  public static void important4questions(){
    // permutationWithRepetition();
    // combinationWithRepetition();
    // combinationWithoutRepetition();
    permutationWithoutRepetition();
  }
  public static void main(String[] args) {
    important4questions();
  
  }
}