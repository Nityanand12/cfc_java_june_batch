import java.util.*;

import org.w3c.dom.Node;
public class lecture28{
  static class AVL<T extends Comparable<T>>{
    class Node{
      Node left,right;
      int height;
      T val;
      Node(T val){
        height=1;
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
    public int height(Node myNode){
      if(myNode==null){
        return 0;
      }
      return myNode.height;
    }
    private Node leftRotation(Node myNode){
      Node a=myNode.right;
      Node c= a.left;
      a.left=myNode;
      myNode.right=c;
      myNode.height=Math.max(height(myNode.left), height(myNode.right))+1;
      a.height=Math.max(height(myNode.left), height(myNode.right))+1;
      return a;
    }
    private Node rightRotation(Node myNode){
      Node a=myNode.left;
      Node c= a.right;
      a.right=myNode;
      myNode.left=c;
      myNode.height=Math.max(height(myNode.left), height(myNode.right))+1;
      a.height=Math.max(height(myNode.left), height(myNode.right))+1;
      return a;
    }
    private Node balance(Node myNode){
      if(height(myNode.right)-height(myNode.left)>1){
        if(height(myNode.right.left)-height(myNode.right.right)>1){
          myNode.right=  rightRotation(myNode.right);
        }
        myNode=leftRotation(myNode);
      }
      else if(height(myNode.left)-height(myNode.right)>1){
        if(height(myNode.left.right)-height(myNode.left.left)>1){
          myNode.left=  leftRotation(myNode.left);
        }
        myNode=rightRotation(myNode);
      }
      return myNode;
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
      myNode.height=Math.max(height(myNode.left),height(myNode.right))+1;
      myNode=balance(myNode);
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
  public static void main(String args[]){
    AVL<Integer>bst= new AVL<>();
    for(int i=1;i<=10;i++){
      bst.insert(i);
    }
    bst.display();
  }
}