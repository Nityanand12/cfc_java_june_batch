import java.util.*;
public class lecture18 {

// 735.  Asteroid Collision
//  class Solution {
//     public int[] asteroidCollision(int[] arr) {
//         Stack<Integer>st= new Stack<>();
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>0){
//                 st.push(arr[i]);
//             }
//             else{
//                 while(st.size()!=0&&st.peek()>0&&st.peek()<Math.abs(arr[i])){
//                     st.pop();
//                 }
//                 if(st.size()==0||st.peek()<0){
//                     st.push(arr[i]);
//                 }
//                 else if(st.peek()==Math.abs(arr[i])){
//                     st.pop();
//                 }
//             }
//         }
//         int ans[]= new int[st.size()];
//         int idx=ans.length-1;
//         while(st.size()!=0){
//             ans[idx]= st.pop();
//             idx--;
//         }
//         return ans;
//     }
// }






  // 42. Trapping Rain Water
//   class Solution {
//     public int trap(int[] height) {
//         int leftMax[]= new int[height.length];
//         int rightMax[]= new int[height.length];
//         for(int i=1;i<height.length;i++){
//             leftMax[i]=Math.max(leftMax[i-1],height[i-1]);
//         }
//         for(int i=height.length-2;i>=0;i--){
//             rightMax[i]=Math.max(rightMax[i+1],height[i+1]);
//         }
//         int ans=0;
//         for(int i=0;i<height.length;i++){
//             if(Math.min(leftMax[i],rightMax[i])-height[i]>0){
//                 ans += Math.min(leftMax[i],rightMax[i])-height[i];
//             }
//         }
//         return ans;
//     }
// }





// 856. Score of Parentheses
//   class Solution {
//     public int scoreOfParentheses(String s) {
//         Stack<Integer>st= new Stack<>();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='('){
//                 st.push(0);
//             }
//             else{
//                 int ans=0;
//                 while(st.peek()!=0){
//                     ans= ans+st.pop();
//                 }
//                 st.pop();
//                 ans= ans*2;
//                 if(ans==0) ans=1;
//                 st.push(ans);
//             }
//         }
//         int finalAns=0;
//         while(st.size()!=0){
//             finalAns+= st.pop();
//         }
//         return finalAns;
//     }
// }




  // 1047. Remove All Adjacent Duplicates In String
//   class Solution {
//     public String removeDuplicates(String s) {
//       Stack<Character>st= new Stack<Character>();
//         for(int i=0;i<s.length();i++){
//             if(st.size()==0){
//                 st.push(s.charAt(i));
//                 continue;
//             }
//             if(st.peek()!=s.charAt(i)){
//                 st.push(s.charAt(i));
//             }
//             else{
//                 st.pop();
//             }
//         }
//         String ans="";
//         while(st.size()!=0){
//             ans= st.pop()+ans;
//         }
//         return ans;
//     }
// }




// 1021. Remove Outermost Parentheses
//   class Solution {
//     public String removeOuterParentheses(String s) {
//         int p=1,count=0;
//         String ans="";
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='('){
//                 count++;
//             }
//             else{
//                 count--;
//             }
//             if(count==0){
//                 ans= ans+s.substring(p,i);
//                 p=i+2;
//             }
//         }
//         return ans;
//     }
// }
  public static void main(String[] args) {
    System.out.println("Hii");
  }
}
