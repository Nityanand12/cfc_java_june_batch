import java.util.*;
public class lecture12{
  public static void ratInMazeWithoutReturnType(int sr,int sc,int er,int ec,String ans){
    if(sr==er&&sc==ec){
      System.out.println(ans);
      return;
    }
    if(sc+1<=ec){
      ratInMazeWithoutReturnType(sr,sc+1,er,ec,ans+"H");
    }
    if(sr+1<=er){
      ratInMazeWithoutReturnType(sr+1,sc,er,ec,ans+"V");
    }
  }
  public static void ratInMazeWithoutReturnTypeMovingDiagonal(int sr,int sc,int er,int ec,String ans){
    if(sr==er&&sc==ec){
      System.out.println(ans);
      return;
    }
    if(sc+1<=ec){
      ratInMazeWithoutReturnTypeMovingDiagonal(sr,sc+1,er,ec,ans+"H");
    }
    if(sr+1<=er){
      ratInMazeWithoutReturnTypeMovingDiagonal(sr+1,sc,er,ec,ans+"V");
    }
    if(sr+1<=er&&sc+1<=ec){
      ratInMazeWithoutReturnTypeMovingDiagonal(sr+1,sc+1,er,ec,ans+"D");
    }
  }
  public static ArrayList<String> ratInMazeWithReturnType(int sr,int sc,int er,int ec){
    if(sr==er&&sc==ec){
      ArrayList<String>base= new ArrayList<>();
      base.add("");
      return base;
    }
    ArrayList<String> ans= new ArrayList<String>();
    if(sc+1<=ec){
      ArrayList<String>east = ratInMazeWithReturnType(sr,sc+1,er,ec);
      for(String ele: east){
        ans.add("H"+ele);
      }
    }
    if(sr+1<=er){
      ArrayList<String>south = ratInMazeWithReturnType(sr+1,sc,er,ec);
      for(String ele: south){
        ans.add("V"+ele);
      }
    }
    return ans;
  }
  public static void ratInMaze(){
    // ratInMazeWithoutReturnType(0,0,2,2,"");
    // ratInMazeWithoutReturnTypeMovingDiagonal(0,0,2,2,"");
    ArrayList<String>ans= ratInMazeWithReturnType(0,0,2,2);
    for(String ele: ans){
      System.out.println(ele);
    }
  }
  public static void display(int arr[][]){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static boolean isSafe(int arr[][],int row,int col,int value){
    for(int i=0;i<arr.length;i++){
      if(arr[i][col]==value){
        return false;
      }
    }
    for(int i=0;i<arr[0].length;i++){
      if(arr[row][i]==value){
        return false;
      }
    }
    row=(row/3)*3;
    col=(col/3)*3;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(arr[i+row][j+col]==value){
          return false;
        }
      }
    }
    return true;
  }
  public static void sudoku(int arr[][],int sr,int sc){
    if(sr==arr.length-1&&sc==arr[0].length){
      display(arr);
      System.out.println();
      return;
    }
    if(sc==arr[0].length){
      sc=0;
      sr++;
    }
    if(arr[sr][sc]!=0){
      sudoku(arr,sr,sc+1);
    }
    else{
      for(int val=1;val<=9;val++){
        if(isSafe(arr,sr,sc,val)){
          arr[sr][sc]= val;
          sudoku(arr,sr,sc+1);
          arr[sr][sc]=0;
        }
      }
    }
  }
  public static void sudoku(){
    int arr[][]={{5,3,0,0,7,0,0,0,0},
      {6,0,0,1,9,5,0,0,0},
      {0,9,8,0,0,0,0,6,0},
      {8,0,0,0,6,0,0,0,3},
      {4,0,0,8,0,3,0,0,1},
      {7,0,0,0,2,0,0,0,6}, 
      {0,6,0,0,0,0,2,8,0},
      {0,0,0,4,1,9,0,0,5},
      {0,0,0,0,8,0,0,7,9}};
      sudoku(arr,0,0);
  }
    public static void main(String[] args) {
    // ratInMaze();
    sudoku();
  }
}