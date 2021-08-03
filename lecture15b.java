import java.util.*;
public class lecture15b {



// 234. Palindrome Linked List
//   class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode middle= middleNode(head);
//         ListNode head2= reverseList(middle);
//         while(head!=null&&head2!=null){
//             if(head.val!=head2.val) return false;
//             head= head.next;
//             head2=head2.next;
//         }
//         return true;
//     }
//     public ListNode middleNode(ListNode head) {
//           ListNode slow=head,fast=head;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }
//     public ListNode reverseList(ListNode head) {
//         ListNode prev=null,curr= head,forw=head;
//         while(forw!=null){
//             forw=curr.next;
//             curr.next= prev;
//             prev= curr;
//             curr=forw;
//         }
//         return prev;
//     }
// }



// 160. Intersection of Two Linked Lists
//   public class Solution {
//     public int myLength(ListNode head){
//         int ans=0;
//         while(head!=null){
//             head=head.next;
//             ans++;
//         }
//         return ans;
//     }
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         int la=myLength(headA);
//         int lb=myLength(headB);
//         if(la>lb){
//             headA= sizeManage(headA,la-lb);
//         }
//         if(lb>la){
//             headB= sizeManage(headB,lb-la);
//         }
//         while(headA!=headB){
//             headA=headA.next;
//             headB=headB.next;
//         }
//         return headA;
//     }
//     public ListNode sizeManage(ListNode head,int cnt){
//         while(cnt!=0){
//             head=head.next;
//             cnt--;
//         }
//         return head;
//     }
// }




// 876. Middle of the Linked List
//   class Solution {
//     public ListNode middleNode(ListNode head) {
//           ListNode slow=head,fast=head;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }
// }



// 206. Reverse Linked List
//   class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev=null,curr= head,forw=head;
//         while(forw!=null){
//             forw=curr.next;
//             curr.next= prev;
//             prev= curr;
//             curr=forw;
//         }
//         return prev;
//     }
// }



  public static void main(String args[]){

  }
}
