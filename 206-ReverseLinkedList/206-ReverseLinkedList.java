// Last updated: 8/11/2026, 2:21:08 PM
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
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        while(curr!=null)
        {
            next = curr.next;   //store next person
            curr.next = prev;   //reverse self
            prev = curr;
            curr = next;
        }
        return prev;   //return new head node.
    }
}