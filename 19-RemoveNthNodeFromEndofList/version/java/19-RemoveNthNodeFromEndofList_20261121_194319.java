// Last updated: 11/21/2026, 7:43:19 PM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode curr = head;
14        int k = 0;
15        while(curr != null)
16        {
17            curr = curr.next;
18            k++;
19        }
20        if(k == n)
21        {
22            return head.next;
23        }
24        ListNode dummy = head;
25        ListNode prev = null;
26        while(dummy != null)
27        {
28            if(k == n)
29            {
30                ListNode nextNode = dummy.next;
31                prev.next = nextNode;
32                break;
33            }
34            k--;
35            prev = dummy;
36            dummy = dummy.next;
37        }
38        return head;
39    }
40}