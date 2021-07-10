import java.util.*;
public class lecture6{
  public static void insertionSort(int arr[]){
    for(int j=1;j<arr.length;j++){
      int key= arr[j];
      int i= j-1;
      while(i>=0&&arr[i]>key){
        arr[i+1]= arr[i];
        i--;
      }
      arr[i+1]= key;
    }
    for(int ele: arr){
      System.out.println(ele);
    }
  }
  public static void bubbleSort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      boolean swap=false;
      for(int j=0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
          swap=true;
          int temp= arr[j];
          arr[j] = arr[j+1];
          arr[j+1]= temp; 
        }
      }
      if(swap==false){
        break;
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    int arr[]={43,12,56,76,54,65,67,43};
    // insertionSort(arr);
    bubbleSort(arr);
  }
}