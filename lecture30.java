import java.util.*;
public class lecture30{

//   class Solution {
//     public int numJewelsInStones(String jewels, String stones) {
//         HashMap<Character,Integer>map= new HashMap<>();
//         for(int i=0;i<stones.length();i++){
//             map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);
//         }
//         int ans=0;
//         for(int i=0;i<jewels.length();i++){
//             if(map.containsKey(jewels.charAt(i))){
//                 ans+= map.get(jewels.charAt(i));
//             }
//         }
//         return ans;
//     }
// }


  public static void subarraySumK(){
    int arr[]={1,-1,3,1,-1,4,5,2,1,3};
    int k=3;
    HashMap<Integer,Integer>map= new HashMap<>();
    int pre[]= new int [arr.length];
    for(int i=0;i<arr.length;i++){
      if(i==0){
        pre[i]= arr[i];
      }
      else{
        pre[i]= pre[i-1]+arr[i];
      }
    }
    int ans=0;
    map.put(0, 1);
    for(int i=0;i<pre.length;i++){
      if(map.containsKey(pre[i]-k)){
        ans+=map.get(pre[i]-k);
      }
      map.put(pre[i], map.getOrDefault(pre[i],0)+1);
    }
    System.out.println(ans);
  }
  public static void main(String[] args) {
    subarraySumK();
  }
}