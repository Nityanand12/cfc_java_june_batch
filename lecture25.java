public import java.util.*;

// 102. Binary Tree Level Order Traversal
// class Solution {
//   public List<List<Integer>> levelOrder(TreeNode root) {
//       List<List<Integer>> ans= new ArrayList<>();
//       int h= height(root);
//       for(int i=0;i<h;i++){
//           ans.add(new ArrayList<Integer>());
//       }
//       fun(ans,root,0);
//       return ans;
//   }
//   public void fun(List<List<Integer>> ans,TreeNode root,int idx){
//       if(root==null) return;
//       ans.get(idx).add(root.val);
//       fun(ans,root.left,idx+1);
//       fun(ans,root.right,idx+1);
//   }
//   public int height(TreeNode root){
//       if(root==null) return 0;
//       return Math.max(height(root.left),height(root.right))+1;
//   }
// }



// 145. Binary Tree Postorder Traversal
// class Solution {
//   public void postorder(TreeNode root,List<Integer> ans){
//       if(root==null) return;
//       postorder(root.left,ans);
//       postorder(root.right,ans);
//       ans.add(root.val);
//   }
//   public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> ans= new ArrayList<>();
//       postorder(root,ans);
//       return ans;
//   }
// }



//94. Binary Tree Inorder Traversal
// class Solution {
//   public void inorder(TreeNode root,List<Integer>ans){
//       if(root==null) return ;
//       inorder(root.left,ans);
//       ans.add(root.val);
//       inorder(root.right,ans);
//   }
//   public List<Integer> inorderTraversal(TreeNode root) {
//       List<Integer> ans= new ArrayList<>();
//       inorder(root,ans);
//       return ans;
//   }
// }



// 144. Binary Tree Preorder Traversal
// class Solution {
//   public List<Integer> preorderTraversal(TreeNode root) {
//       List<Integer> ans= new ArrayList<>();
//       preorder(root,ans);
//       return ans;
//   }
//   public void preorder(TreeNode root,List<Integer> ans){
//       if(root==null) return ;
//       ans.add(root.val);
//       preorder(root.left,ans);
//       preorder(root.right,ans);
//   }



// 111. Minimum Depth of Binary Tree
// class Solution {
//   public int fun(TreeNode root){
//       if(root==null){
//           return Integer.MAX_VALUE;
//       }
//       if(root.left==null&&root.right==null){
//           return 1;
//       }
//       return Math.min(fun(root.left),fun(root.right))+1;
//   }
//   public int minDepth(TreeNode root) {
//    if(root==null) return 0;
//      return fun(root);
//   }
// }




// 104. Maximum Depth of Binary Tree
// class Solution {
//   public int maxDepth(TreeNode root) {
//       if(root==null) return 0;
//       return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
//   }
// }

class CustomBinaryTree<T>{
  class Node{
    T value;
    Node left;
    Node right;
    Node(T value){
      this.value=value;
      left=null;
      right=null;
    }
    Node(T value,Node left,Node right){
      this.value=value;
      this.left=left;
      this.right=right;
    }
  }
  private Node root;

  public void insert(T data,String dir){
    root= insert(data, dir,root,0);
  }
  private Node insert(T data,String dir,Node myNode,int idx){
    if(myNode==null){
      myNode = new Node(data);
      return myNode;
    }
    if(dir.length()==idx){
      myNode.value=data;
      return myNode;
    }
    if(dir.charAt(idx)=='L'){
      myNode.left= insert(data, dir, myNode.left, idx+1);
    }
    else{
      myNode.right= insert(data, dir, myNode.right, idx+1);
    }
    return myNode;
  }
  public boolean find(T value){
    return find(value,root);
  }
  private boolean find(T value,Node myNode){
    if(myNode==null){
      return false;
    }
    if(myNode.value==value){
      return true;
    }
    boolean left= find(value,myNode.left);
    boolean right= find(value,myNode.right);
    return left||right;
  }
  public void display(){
    display(root);
  }
  private void display(Node myNode){
    if(myNode==null){
      return;
    }
    if(myNode.left!=null){
      System.out.print(myNode.left.value+" -> ");
    }
    else{
      System.out.print(" -> ");
    }
    System.out.print(myNode.value);
    if(myNode.right!=null){
      System.out.print(" <- "+myNode.right.value);
    }
    else{
      System.out.print(" <- ");
    }
    System.out.println();
    display(myNode.left);
    display(myNode.right);
  }

}
public class lecture25{
  public static void main(String[] args) {
    CustomBinaryTree<Integer> bt= new CustomBinaryTree<>();
    bt.insert(10,"");
    bt.insert(20, "L");
    bt.insert(5, "R");
    bt.insert(25, "LR");
    bt.insert(45, "RR");
    bt.insert(12, "RL");
    bt.insert(46, "RRR");
    bt.insert(7, "LR");
    bt.insert(76, "RR");
    bt.insert(54, "LL");
    bt.display();
  }
}