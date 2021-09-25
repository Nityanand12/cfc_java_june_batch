import java.util.*;
public class lecture27{

// 337. House Robber III
//   class Solution {
//     public int rob(TreeNode root) {
//         int ans[]= fun(root);
//         return Math.max(ans[0],ans[1]);
//     }
//     public int[] fun(TreeNode root){
//         if(root==null){
//             int base[]= new int[2];
//             return base;
//         }
//         int left[]= fun(root.left);
//         int right[]= fun(root.right);
//         int res[] = new int[2];
//         // res[0] means include
//         // res[1] means exclude
        
//         res[0]=root.val+left[1]+right[1];
//         res[1]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
//         return res;
//     }
// }




// 538. Convert BST to Greater Tree
//   class Solution {
//     int sum=0;
//     public TreeNode convertBST(TreeNode root) {
//         if(root==null){
//             return null;
//         }
//         convertBST(root.right);
//         sum+=root.val;
//         root.val=sum;
//         convertBST(root.left);
//         return root;
//     }
// }





// 669. Trim a Binary Search Tree
//   class Solution {
//     public TreeNode trimBST(TreeNode root, int low, int high) {
//         if(root==null){
//             return null;
//         }
//         if(root.val<low){
//             return trimBST(root.right,low,high);
//         }
//         else if(root.val>high){
//             return trimBST(root.left,low,high);
//         }
//         else{
//             root.left= trimBST(root.left,low,high);
//             root.right= trimBST(root.right,low,high);
//         }
//         return root;
        
//     }
// }


// 235. Lowest Common Ancestor of a Binary Search Tree
//   class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         while(root!=null){
//             if(p.val<root.val&&q.val<root.val){
//                 root=root.left;
//             }
//             else if(p.val>root.val&&q.val>root.val){
//                 root=root.right;
//             }
//             else{
//                 break;
//             }
//         }
//         return root;
//     }
    
// }





// 450. Delete Node in a BST
// class Solution {
//      static int minimum(TreeNode root){
//         if(root.left==null){
//             return root.val;
//         }
//         return minimum(root.left);
//     }
//     public  TreeNode deleteNode(TreeNode root, int key) {
//         if(root==null) return null;
//         if(root.val==key){
//             if(root.left!=null&&root.right!=null){
//                 int min=minimum(root.right);
//                 root.val=min;
//                 root.right=deleteNode(root.right,min);
//             }
//             else if(root.left!=null){
//                 return root.left;
//             }
//             else if(root.right!=null){
//                 return root.right;
//             }
//             else{
//                 return null;
//             }
//         }
//         root.left= deleteNode(root.left,key);
//         root.right= deleteNode(root.right,key);
//         return root;
//     }
// }
  public static void main(String[] args) {
  }
}