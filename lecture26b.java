import java.util.*;
class BinarySearchTree<T extends Comparable<T>>{
  class Node{
    Node left,right;
    T val;
    Node(T val){
      this.val=val;
      left=null;
      right=null;
    }
    Node(T val,Node left,Node right){
      this.val=val;
      this.right=right;
      this.left=left;
    }
  }
  Node root;
  public void insert(T data){
    root= insert(data,root);
  }
  private Node insert(T data,Node myNode){
    if(myNode==null){
      Node baseCase= new Node(data);
      return baseCase;
    }
    if(myNode.val.compareTo(data)<0){
      myNode.right= insert(data,myNode.right);
    }
    else{
      myNode.left= insert(data,myNode.left);
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
    if(myNode.val==value){
      return true;
    }
    if(myNode.val.compareTo(value)<0){
      return find(value,myNode.right);
    }
    else{
      return find(value,myNode.left);
    }
  }

  public void display(){
    display(root);
  }
  private void display(Node myNode){
    if(myNode==null){
      return;
    }
    if(myNode.left!=null){
      System.out.print(myNode.left.val+" -> ");
    }
    else{
      System.out.print(" -> ");
    }
    System.out.print(myNode.val);
    if(myNode.right!=null){
      System.out.print(" <- "+myNode.right.val);
    }
    else{
      System.out.print(" <- ");
    }
    System.out.println();
    display(myNode.left);
    display(myNode.right);
  }
}

public class lecture26b {
  public static void main(String[] args) {
    BinarySearchTree<String> bst= new BinarySearchTree<>();
    bst.insert("10");
    bst.insert("45");
    bst.insert("8");
    bst.insert("4");
    bst.insert("16");
    bst.insert("6");
    bst.display();
  } 
}
