// Last updated: 11/5/2026, 11:52:07 AM
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
13        if(head == null)    
14            return head;
15            
16        ListNode curr = head;
17        ListNode odd = curr;
18        ListNode even = curr.next;    
19
20        ListNode evenHead = even; //first even head
21
22        while(even != null && even.next != null)
23        {
24            odd.next = even.next;
25            odd = odd.next;
26
27            even.next = odd.next;
28            even = even.next;
29        }
30        odd.next = evenHead; //connect to even head after odd elements completes
31        return curr;
32    }
33}