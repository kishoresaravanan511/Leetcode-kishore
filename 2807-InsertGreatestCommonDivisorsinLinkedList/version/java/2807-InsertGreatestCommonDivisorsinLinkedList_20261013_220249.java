// Last updated: 10/13/2026, 10:02:49 PM
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
12    public ListNode insertGreatestCommonDivisors(ListNode head) {
13      ListNode curr = head;
14      while(curr != null && curr.next != null){
15      int gcd = gcd(curr.val,curr.next.val);
16      ListNode nn = new ListNode(gcd);  
17      //notable steps..
18
19      nn.next = curr.next;
20      curr.next = nn;
21      curr = nn.next;
22      
23    }
24    return head;
25    }
26    int gcd(int a,int b)
27    {
28        while(b!=0)
29        {
30            int temp = a%b;
31            a = b;
32            b = temp;
33        }
34        return a;
35    }
36}