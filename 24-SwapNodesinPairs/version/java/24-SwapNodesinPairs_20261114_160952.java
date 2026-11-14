// Last updated: 11/14/2026, 4:09:52 PM
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
12    public ListNode swapPairs(ListNode head) {
13        if(head == null) 
14            return head;
15        
16        ListNode dummy = new ListNode();
17        dummy.next = head;
18        ListNode prev = dummy;
19        
20        while(prev.next != null && prev.next.next != null)
21        {
22            ListNode first = prev.next;
23            ListNode second = prev.next.next;
24            first.next = second.next;
25            second.next = first;
26            prev.next = second;
27
28            prev = first;
29        }
30        return dummy.next;
31    }
32}