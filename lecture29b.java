// 1. Two Sum
// class Solution {
//   public int[] twoSum(int[] nums, int target) {
//       int x=-1,y=-1;
//       HashMap<Integer,Integer>map= new HashMap<>();
//       for(int i=0;i<nums.length;i++){
//           if(map.containsKey(target-nums[i])){
//                x= map.get(target-nums[i]);
//                y= i;
//               break;
//           }
//           map.put(nums[i],i);
//       }
//       int arr[]={x,y};
//       return arr;
//   }
// }




// 387. First Unique Character in a String
// class Solution {
//   public int firstUniqChar(String s) {
//       int arr[]=new int[26];
//       for(int i=0;i<s.length();i++){
//           arr[s.charAt(i)-'a']++;
//       }
//       for(int i=0;i<s.length();i++){
//           if(arr[s.charAt(i)-'a']==1){
//               return i;
//           }
//       }
      
//       // HashMap<Character,Integer>map= new HashMap<>();
//       // for(int i=0;i<s.length();i++){
//       //     map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//       // }
//       // for(int i=0;i<s.length();i++){
//       //     if(map.containsKey(s.charAt(i))){
//       //         int val= map.get(s.charAt(i));
//       //         if(val==1)
//       //         return i;
//       //     }
//       // }
//       return -1;
//   }
// }

public class lecture29b {
  
}
