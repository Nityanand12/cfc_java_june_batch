import java.util.*;
public class lecture8{
  public static void spiral(){
    int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
    int tle= arr.length*arr[0].length;
    int sr =0,sc=0,ec= arr[0].length-1,er=arr.length-1; 
    int dir=-1;
    while(tle!=0){
      dir=(dir+1)%4;
      if(dir==0){
        for(int i=sc;i<=ec;i++){
          System.out.print(arr[sr][i]+" ");
          tle--;
        }
        sr++;
      }
      else if(dir==1){
        for(int i=sr;i<=er;i++){
          System.out.print(arr[i][ec]+" ");
          tle--;
        }
        ec--;
      }
      else if(dir==2){
        for(int i=ec;i>=sc;i--){
          System.out.print(arr[er][i]+" ");
          tle--;
        }
        er--;
      }
      else {
        for(int i=er;i>=sr;i--){
          System.out.print(arr[i][sc]+" ");
          tle--;
        }
        sc++;
      }
    }
  }
  public static void exitPoint(){
    int arr[][]={{0,0,1,1},{0,1,0,1},{0,1,1,0}};
    int dir=0, i=0,j=0;
    while(true){
      dir=(dir+arr[i][j])%4;
      if(dir==0){
        j++;
      }
      else if(dir==1){
        i++;
      }
      else if(dir==2){
        j--;
      }
      else{
        i--;
      }
      // exit
      if(j<0){
        j++;
        break;
      }
      else if(i<0){
        i++;
        break;
      }
      else if(j==arr[0].length){
        j--;
        break;
      }
      else if(i==arr.length){
        i--;
        break;
      }
    }
    System.out.println(i+" "+j);
  }
  public static void main(String[] args) {
    // spiral();
    exitPoint();
  }
}