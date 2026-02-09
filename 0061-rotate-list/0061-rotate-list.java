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
    public ListNode rotateRight(ListNode head, int k) {
    
        ListNode curr=head;
        if(k==0||head==null)return head;
        int len=1;
        while(curr.next!=null){curr=curr.next;
        len=len+1;
        }
        k=k%len;
        k=len-k;
        if(k==0) return head;
        curr.next=head;
        curr=head;
        for(int i=1;i<k;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
    return head;
    }
}