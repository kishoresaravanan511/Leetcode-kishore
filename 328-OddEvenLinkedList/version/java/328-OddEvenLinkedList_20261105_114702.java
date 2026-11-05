// Last updated: 11/5/2026, 11:47:02 AM
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
12    public ListNode oddEvenList(ListNode head) {
13        if(head == null)    return head;
14        ListNode curr = head;
15        ListNode odd = curr;
16        ListNode even = curr.next;    
17
18        ListNode evenHead = even;
19
20        while(even != null && even.next != null)
21        {
22            odd.next = even.next;
23            odd = odd.next;
24
25            even.next = odd.next;
26            even = even.next;
27        }
28        odd.next = evenHead;
29        return curr;
30    }
31}