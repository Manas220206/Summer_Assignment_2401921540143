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
    public ListNode reverseList(ListNode head) {
        if(head==null|| head.next==null)return head;
        ListNode newHead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;if (head.next==null)return true;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        ListNode rev=reverseList(slow);
        prev.next=null;
        slow=head;
        while(slow!=null && rev!=null){
            if(slow.val!=rev.val)return false;
            slow=slow.next;
            rev=rev.next;
        }
    return true;}
}