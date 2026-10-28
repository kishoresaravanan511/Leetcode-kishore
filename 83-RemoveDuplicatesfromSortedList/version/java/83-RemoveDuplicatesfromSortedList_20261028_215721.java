// Last updated: 10/28/2026, 9:57:21 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode curr = head;
14        while(curr != null && curr.next != null)
15        {
16            if(curr.val == curr.next.val)
17            {
18                curr.next = curr.next.next;
19            }
20            else
21            {
22                curr = curr.next;
23            }
24        }
25        return head;
26    }
27}