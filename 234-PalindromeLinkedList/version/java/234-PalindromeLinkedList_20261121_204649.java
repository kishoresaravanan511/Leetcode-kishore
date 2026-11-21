// Last updated: 11/21/2026, 8:46:49 PM
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
12    public boolean isPalindrome(ListNode head) {
13        ListNode curr = head;
14        int length = 0;
15        while(curr != null)
16        {
17            length++;
18            curr = curr.next;
19        }
20        int[] arr = new int[length];
21        int i=0;
22        ListNode dummy = head;
23        while(dummy != null)
24        {
25            arr[i] = dummy.val;
26            dummy = dummy.next;
27            i++;
28        }
29        int p1 = 0;
30        int p2 = length-1;
31        while(p1 <= p2)
32        {
33            if(arr[p1] != arr[p2])
34            {
35                return false;
36            }
37            p1++;
38            p2--;
39        }
40        return true;
41    }
42}