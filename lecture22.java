import java.util.*;

public class lecture22 {

  public static int knapSackWithRecursion(int wt[], int val[], int pos, int cap) {
    if (cap == 0 || pos == 0) {
      return 0;
    }
    int left = 0, right = 0;
    left = knapSackWithRecursion(wt, val, pos - 1, cap);
    if (cap - wt[pos - 1] >= 0)
      right = knapSackWithRecursion(wt, val, pos - 1, cap - wt[pos - 1]) + val[pos - 1];
    return Math.max(left, right);
  }

  public static int knapSackWithMemoization(int wt[], int val[], int pos, int cap, int dp[][]) {
    if (cap == 0 || pos == 0) {
      return dp[pos][cap] = 0;
    }
    int left = 0, right = 0;
    if (dp[pos][cap] != 0) {
      return dp[pos][cap];
    }
    left = knapSackWithMemoization(wt, val, pos - 1, cap, dp);
    if (cap - wt[pos - 1] >= 0)
      right = knapSackWithMemoization(wt, val, pos - 1, cap - wt[pos - 1], dp) + val[pos - 1];
    return dp[pos][cap] = Math.max(left, right);
  }

  public static int knapSackWithTabulation(int wt[], int val[], int pos, int cap, int dp[][]) {

    for (int i = 0; i <= pos; i++) {
      for (int j = 0; j <= cap; j++) {
        if (j == 0 || i == 0) {
          dp[i][j] = 0;
          continue;
        }
        int left = 0, right = 0;
        left = dp[i - 1][j];
        if (j - wt[i - 1] >= 0)
          right = dp[i - 1][j - wt[i - 1]] + val[i - 1];
        dp[i][j] = Math.max(left, right);
      }
    }
    return dp[dp.length - 1][dp[0].length - 1];
  }

  public static int lcs_Recursion(String x, String y, int xPos, int yPos) {
    if (xPos == 0 || yPos == 0) {
      return 0;
    }
    if (x.charAt(xPos - 1) == y.charAt(yPos - 1)) {
      return lcs_Recursion(x, y, xPos - 1, yPos - 1) + 1;
    } else {
      int left = lcs_Recursion(x, y, xPos - 1, yPos);
      int right = lcs_Recursion(x, y, xPos, yPos - 1);
      return Math.max(left, right);
    }
  }

  public static int lcs_Memoization(String x, String y, int xPos, int yPos, Integer dp[][]) {
    if (xPos == 0 || yPos == 0) {
      return dp[xPos][yPos] = 0;
    }
    if (dp[xPos][yPos] != null) {
      return dp[xPos][yPos];
    }
    if (x.charAt(xPos - 1) == y.charAt(yPos - 1)) {
      return dp[xPos][yPos] = lcs_Memoization(x, y, xPos - 1, yPos - 1, dp) + 1;
    } else {
      int left = lcs_Memoization(x, y, xPos - 1, yPos, dp);
      int right = lcs_Memoization(x, y, xPos, yPos - 1, dp);
      return dp[xPos][yPos] = Math.max(left, right);
    }
  }

  public static int lcs_Tabulation(String x, String y, Integer dp[][]) {
    for (int xPos = 0; xPos <= x.length(); xPos++) {
      for (int yPos = 0; yPos <= y.length(); yPos++) {
        if (xPos == 0 || yPos == 0) {
           dp[xPos][yPos] = 0;
           continue;
        }
        if (x.charAt(xPos - 1) == y.charAt(yPos - 1)) {
           dp[xPos][yPos] = dp[xPos-1][yPos-1]+1;
           continue;
        } else {
          int left = dp[xPos-1][yPos];
          int right = dp[xPos][yPos-1];
           dp[xPos][yPos] = Math.max(left, right);
        }
      }
    }
    return dp[dp.length-1][dp[0].length-1];
  }

  public static void lcs() {
    String x = "Saturday", y = "Sunday";
    // System.out.println(lcs_Recursion(x,y,x.length(),y.length()));
    Integer dp[][] = new Integer[x.length() + 1][y.length() + 1];
    // System.out.println(lcs_Memoization(x,y,x.length(),y.length(),dp));
    // for(int i=0;i<dp.length;i++){
    // for(int j=0;j<dp[0].length;j++){
    // System.out.print(dp[i][j]+" ");
    // }
    // System.out.println();
    // }

    System.out.println(lcs_Tabulation(x, y, dp));
    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[0].length; j++) {
        System.out.print(dp[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void knapsack(){
    int wt[] = { 1, 3, 2, 4 };
    int val[] = { 12, 15, 10, 20 };
    int cap = 8;
    // System.out.println(knapSackWithRecursion(wt,val,wt.length,cap));
    int dp[][] = new int[wt.length + 1][cap + 1];
    // System.out.println(knapSackWithMemoization(wt,val,wt.length,cap,dp));
    // for(int i=0;i<dp.length;i++){
    // for(int j=0;j<dp[0].length;j++){
    // System.out.print(dp[i][j]+" ");
    // }
    // System.out.println();
    // }

    // System.out.println(knapSackWithTabulation(wt,val,wt.length,cap,dp));
    // for(int i=0;i<dp.length;i++){
    // for(int j=0;j<dp[0].length;j++){
    // System.out.print(dp[i][j]+" ");
    // }
    // System.out.println();
    // }
  }
  public static void main(String[] args) {
    knapsack();
    lcs();
  }
}
