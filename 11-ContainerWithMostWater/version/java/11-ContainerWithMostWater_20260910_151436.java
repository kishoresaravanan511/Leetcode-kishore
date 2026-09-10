// Last updated: 9/10/2026, 3:14:36 PM
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
12    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
13        ListNode dummy = new ListNode();
14        ListNode curr = dummy;
15
16        //here, l1 and l2 are two distinct heads of LL.
17        while(l1 != null && l2 != null)
18        {
19            if(l1.val < l2.val)   //l1 is less
20            {
21                curr.next = l1;   //l1 address is pointing to current.next
22                l1 = l1.next;     //l1 increment to next to check
23            }
24            else
25            {
26                curr.next = l2;
27                l2 = l2.next;
28            }
29            curr = curr.next;
30        }
31        if(l1 != null)
32        {
33            curr.next = l1;
34        }
35        else if(l2 != null)
36        {
37            curr.next = l2;
38        }
39        return dummy.next;
40    }
41}