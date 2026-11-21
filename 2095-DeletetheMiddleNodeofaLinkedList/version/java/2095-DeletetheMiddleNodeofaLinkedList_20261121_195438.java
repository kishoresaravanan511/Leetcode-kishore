// Last updated: 11/21/2026, 7:54:38 PM
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
12    public ListNode deleteMiddle(ListNode head) {
13
14        if(head == null || head.next == null)   return null;
15        ListNode curr = head;
16        ListNode fast = head;
17        ListNode slow = head;
18        ListNode prev = head;
19
20        while(fast!=null && fast.next!=null)
21        {
22            fast = fast.next.next;
23            prev = slow;
24            slow = slow.next;
25        }
26        ListNode nextNode = slow.next;
27        prev.next = nextNode;
28
29        return head;
30    }
31}