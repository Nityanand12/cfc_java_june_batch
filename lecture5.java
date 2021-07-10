import java.util.*;
public class lecture5{
  public static void rotateArray(int arr[]){
    int l=0,h= arr.length-1;
    while(l<h){
      int temp= arr[l];
      arr[l]= arr[h];
      arr[h]= temp;
      l++;
      h--;
    }
    for(int ele: arr){
      System.out.print(ele+" ");
    }
    System.out.println();
  }
  public static void linearSearch(int arr[]){
    int ans=-1;
    int element=60;
    for(int ele: arr){
      if(ele==element){
        ans= 1;
        System.out.println("Element Found");
        break;
      }
    }
    if(ans==-1){
      System.out.println("Element Not Found");
    }
  }
  public static void binarySearch(int arr[]){
    int l=0,h=arr.length-1;
    int ans=-1;
    int element=60;
    while(l<=h){
      int mid= (l+h)/2;
      if(arr[mid]==element){
        ans= 1;
        System.out.println("Element Found");
        break;
      } 
      else if(arr[mid]>element){
        h= mid-1;
      }
      else{
        l= mid+1;
      }
    }
    if(ans==-1){
      System.out.println("Element Not Found");
    }
  }
  public static void main(String[] args) {
    int arr[]= {50,44,34,4,15,60};
    // rotateArray(arr);
    // linearSearch(arr); 
    binarySearch(arr);
  }
}