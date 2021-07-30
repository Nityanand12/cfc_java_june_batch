import java.util.*;
public class lecture13{
  public static void nokiaKeyPadWithoutReturnType(String arr[],String number,String ans,int index){
    if(index==number.length()){
      System.out.println(ans);
      return ;
    }
    char ch= number.charAt(index);
    for(int i=0;i<arr[ch-'0'].length();i++){
      nokiaKeyPadWithoutReturnType(arr,number,ans+arr[ch-'0'].charAt(i),index+1);
    }
  }
  public static void nokiaKeyPad(){
    String arr[]={"abc","def","ghi","jkl","mno","pqr","stu","vwx","yz","*/-"};
    String number="237";
    nokiaKeyPadWithoutReturnType(arr,number,"",0);
  }





  public static void display(int board[][]){
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board[0].length;j++){
        System.out.print(board[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static boolean isSafeForQueen(int board[][],int row,int col){
    for(int i=row;i>=0;i--){
      if(board[i][col]==1){
        return false;
      }
    }
    for(int i=row,j=col;i>=0&&j>=0;i--,j--){
      if(board[i][j]==1){
        return false;
      }
    }
    for(int i=row,j=col;i>=0&&j<board[0].length;i--,j++){
      if(board[i][j]==1){
        return false;
      }
    }
    return true;
  }

  public static void nqueen(int board[][],int row){
    if(row==board.length){
      display(board);
      System.out.println();
      return;
    }
    for(int col=0;col<board[0].length;col++){
      if(isSafeForQueen(board,row,col)){
        board[row][col]=1;
        nqueen(board,row+1);
        board[row][col]=0;
      }
    }
  }
  public static void nqueen(){
    int n=4;
    int board[][]= new int[n][n];
    nqueen(board,0);
  }

  public static void main(String[] args) {
    // nokiaKeyPad();
    // nqueen();
    
  }

}