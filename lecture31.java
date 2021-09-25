import java.util.*;
public class lecture31{




// 451. Sort Characters By Frequency
//   class Solution {
//     class node implements Comparable<node>{
//         char ch;
//         int freq;
//         node(char ch,int freq){
//             this.ch=ch;
//             this.freq=freq;
//         }
//         node(){
            
//         }
//         @Override
//         public int compareTo(node o){
//             if(o.freq==this.freq){
//                return this.ch-o.ch;
//             }
//             return o.freq-this.freq;
//         }
//     }
//     public String frequencySort(String s) {
//         HashMap<Character,Integer>map= new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//         }
//         PriorityQueue<node>pq= new PriorityQueue<>();
//         for(Character ch: map.keySet()){
//             pq.add(new node(ch,map.get(ch)));
//         }
//         StringBuilder sb= new StringBuilder();
//         while(pq.size()!=0){
//             node rem= pq.remove();
//             for(int i=0;i<rem.freq;i++){
//                 sb.append(rem.ch);
//             }
//         }
//         return sb.toString();
        
//     }
// }







// 347. Top K Frequent Elements
//   class Solution {
//     class node implements Comparable<node>{
//         int val;
//         int freq;
//         node(int val,int freq){
//             this.val=val;
//             this.freq=freq;
//         }
//         @Override
//         public int compareTo(node o){
//             return o.freq-this.freq;
//         }
//     }
//     public int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer,Integer>map= new HashMap<>();
//         for(int ele: nums){
//             map.put(ele,map.getOrDefault(ele,0)+1);
//         }
//         PriorityQueue<node>pq= new PriorityQueue<>();
//         for(int ele: map.keySet()){
//             pq.add(new node(ele,map.get(ele)));
//         }
//         int ans[]= new int[k];
//         for(int i=0;i<k;i++){
//             node rem= pq.remove();
//             ans[i]= rem.val;
//         }
//         return ans;
//     }
// }








// 973. K Closest Points to Origin
//   class Solution {
//     class node implements Comparable<node>{
//         int x,y,d;
//         node(int x,int y,int d){
//             this.x=x;
//             this.y=y;
//             this.d=d;
//         }
//         @Override
//         public int compareTo(node o){
//             return o.d-this.d;
//         }
//     }
//     public int[][] kClosest(int[][] points, int k) {
//         PriorityQueue<node>pq= new PriorityQueue<>();
//         for(int i=0;i<k;i++){
//             int dis=(int)(Math.pow(points[i][0],2)+Math.pow(points[i][1],2));
//             pq.add(new node(points[i][0],points[i][1],dis));
//         }
//         for(int i=k;i<points.length;i++){
//             int dis=(int)(Math.pow(points[i][0],2)+Math.pow(points[i][1],2));
//             node rem= pq.peek();
//             if(dis<rem.d){
//                 pq.remove();
//                 pq.add(new node(points[i][0],points[i][1],dis));
//             }
//         }
//         int ans[][]= new int[k][2];
//         for(int i=0;i<k;i++){
//             node rem= pq.remove();
//             ans[i][0]= rem.x;
//             ans[i][1]= rem.y;
//         }
//         return ans;
//     }
// }










  static class Student implements Comparable<Student>{
    String name;
    int roll;
    int marks;
    Student(String name,int roll,int marks){
       this.name=name;
       this.roll=roll;
       this.marks=marks;
    }
    Student(){

    }
    @Override
    public int compareTo(Student o){
      return o.marks-this.marks;
    }
  }



  public static void kthLargest(){
    int arr[]={10,11,17,4,12,9,1,15,20,21,-5};
    int k=3;
    PriorityQueue<Integer>pq= new PriorityQueue<>();
    for(int i=0;i<k;i++){
      pq.add(arr[i]);
    }
    for(int i=k;i<arr.length;i++){
      int rem= pq.peek();
      if(arr[i]>rem){
        pq.remove();
        pq.add(arr[i]);
      }
    }
    System.out.println(pq.peek());
  }
  public static void main(String[] args) {
    // int arr[]={10,6,11,2,22,110,20,4};
    // // PriorityQueue<Integer>pq= new PriorityQueue<Integer>();
    // PriorityQueue<Integer>pq= new PriorityQueue<Integer>(Collections.reverseOrder());
    // for(int ele: arr){
    //   pq.add(ele);
    // }
    // while(pq.size()!=0){
    //   System.out.print(pq.remove()+" ");
    // }
    // PriorityQueue<Student>pq2= new PriorityQueue<Student>();
    // pq2.add(new Student("Bhede",2,90));
    // pq2.add(new Student("Jethalal",16,95));
    // pq2.add(new Student("Iyer",14,85));
    // pq2.add(new Student("Popatlal",28,80));
    // while(pq2.size()!=0){
    //   Student rem= pq2.remove();
    //   System.out.println(rem.name+" "+rem.roll+" "+rem.marks);
    // }

    kthLargest();
  }
}