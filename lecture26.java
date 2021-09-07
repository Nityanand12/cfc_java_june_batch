import java.util.*;
public class lecture26 {




//   class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         ArrayList<TreeNode>p1= lca(root,p);
//         ArrayList<TreeNode>p2= lca(root,q);
//         int id1= p1.size()-1;
//         int id2= p2.size()-1;
//         TreeNode ans= null;
//         while(id1>=0&&id2>=0&&p1.get(id1)==p2.get(id2)){
//             ans= p1.get(id1);
//             id1--;
//             id2--;
//         }
//         return ans;
//     }
//     public ArrayList<TreeNode> lca(TreeNode root, TreeNode p){
//         if(root==null){
//             ArrayList<TreeNode>baseCase1=new ArrayList<>();
//             return baseCase1;
//         }
//         if(root==p){
//             ArrayList<TreeNode>baseCase2=new ArrayList<>();
//             baseCase2.add(root);
//             return baseCase2;
//         }
//         ArrayList<TreeNode>left= lca(root.left,p);
//         ArrayList<TreeNode>right= lca(root.right,p);
//         if(left.size()!=0){
//             left.add(root);
//             return left;
//         }
//         else if(right.size()!=0){
//             right.add(root);
//             return right;
//         }
//         return right;
//     }
// }




// 101. Symmetric Tree
//   class Solution {
//     public boolean fun(TreeNode root1,TreeNode root2){
//         if(root1==null&&root2==null){
//             return false;
//         }
//         if(root1==null||root2==null){
//             return true;
//         }
//         if(root1.val!=root2.val){
//             return true;
//         }
//         boolean res=false;
//         res=res||fun(root1.left,root2.right);
//         res=res||fun(root1.right,root2.left);
//         return res;
//     }
//     public boolean isSymmetric(TreeNode root) {
//        return fun(root,root)==false;
//     }
    
// }


  // 543. Diameter of Binary Tree
//   class Solution {
//     int ans=0;
//     public int diameterOfBinaryTree(TreeNode root) {
//         diameterBT(root);
//         return ans;
//     }
//     public int diameterBT(TreeNode root){
//         if(root==null){
//             return -1;
//         }
//         int l= diameterBT(root.left);
//         int r= diameterBT(root.right);
//         ans=Math.max(ans,l+r+2);
//         return Math.max(l,r)+1;
//     }
// }
  public static void main(String[] args) {
    System.out.println("Hii");
  }
}
