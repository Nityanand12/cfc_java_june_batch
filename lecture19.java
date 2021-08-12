import java.util.*;
public class lecture19 {



// 11. Container With Most Water
//   class Solution {
//     public int maxArea(int[] height) {
//         int low=0,high= height.length-1,ans=0;
//         while(low<high){
//            ans = Math.max(ans,Math.min(height[low],height[high])*(high-low));
//             if(height[low]<height[high]){
//                 low++;
//             }
//             else{
//                 high--;
//             }
//         }
//         return ans;
//     }
// }





// 85. Maximal Rectangle
//   class Solution {
//     public int maximalRectangle(char[][] matrix) {
//         if(matrix.length==0){
//             return 0;
//         }
//         int ans=0;
//         int arr[]= new int[matrix[0].length];
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]=='0'){
//                     arr[j]=0;
//                 }
//                 else{
//                     arr[j]=arr[j]+1;
//                 }
//             }
//           ans=Math.max(ans,largestRectangleArea(arr)) ;
//         }
//         return ans;
//     }
//     public int largestRectangleArea(int[] heights) {
//         if(heights.length==0) return 0;
//         int ans=0;
//         Stack<Integer>st= new Stack<Integer>();
//         st.push(-1);
//         for(int i=0;i<heights.length;i++){
//             if(st.size()==1||heights[i]>heights[st.peek()]){
//                 st.push(i);
//             }
//             else{
//                 while(st.size()!=1&&heights[i]<=heights[st.peek()]){
//                     int var= st.pop();
//                     ans=Math.max(ans,(i-st.peek()-1)*heights[var]);
//                 }
//                 st.push(i);
//             }
//         }
//         int len=  heights.length;
//         while(st.size()!=1){
//             int var= st.pop();
//             ans=Math.max(ans,(len-st.peek()-1)*heights[var]);
//         }
//         return ans;
//     }
// }


// 84. Largest Rectangle in Histogram
//   class Solution {
//     public int largestRectangleArea(int[] heights) {
//         if(heights.length==0) return 0;
//         int ans=0;
//         Stack<Integer>st= new Stack<Integer>();
//         st.push(-1);
//         for(int i=0;i<heights.length;i++){
//             if(st.size()==1||heights[i]>heights[st.peek()]){
//                 st.push(i);
//             }
//             else{
//                 while(st.size()!=1&&heights[i]<=heights[st.peek()]){
//                     int var= st.pop();
//                     ans=Math.max(ans,(i-st.peek()-1)*heights[var]);
//                 }
//                 st.push(i);
//             }
//         }
//         int len=  heights.length;
//         while(st.size()!=1){
//             int var= st.pop();
//             ans=Math.max(ans,(len-st.peek()-1)*heights[var]);
//         }
//         return ans;
//     }
// }


  public static void main(String[] args) {
    
  }
}
