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
  
    static ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

   
    

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;

        ListNode sum=null;
        int carry=0;
        while(head1 != null || head2 !=null ||carry>0){
            int newVal=carry;
            if(head1!=null){
                newVal+=head1.val;
                head1=head1.next;
            }
            if(head2!=null){
                newVal+=head2.val;
                head2=head2.next;
            }
            carry=newVal/10;
            newVal%=10;

            ListNode newNode=new ListNode(newVal);
            newNode.next=sum;
            sum=newNode;
        }
            	  	while(sum != null && sum.val == 0){sum = sum.next;}
return (sum == null) ? new ListNode(0) : reverse(sum);
    }
}