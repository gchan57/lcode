/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode verify=head;
        for(int i=0;i<k;i++){
            if(verify==null)return head;
            verify=verify.next;
        }
        ListNode nextNode=null;
        ListNode curr=head;
       ListNode prev=null;
        int count =0;
        while(curr!=null&&count<k){
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            count++;
        }
     if(nextNode!=null){
        head.next=reverseKGroup(nextNode,k);
     }
     return prev;
    }
}