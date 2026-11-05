// Last updated: 11/5/2026, 10:52:51 AM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        //whenever we want to use new node for results , use dummy node is preferred
14        ListNode dummy = new ListNode(0);
15        ListNode curr = dummy;
16        ListNode t1 = l1;
17        ListNode t2 = l2;
18        int carry = 0;
19
20        while(t1 != null || t2 != null)
21        {
22            int sum = carry;
23            if(t1!=null)
24            {
25                sum = sum + t1.val;
26            }
27            if(t2!=null)
28            {
29                sum = sum+t2.val;
30            }
31            ListNode nn = new ListNode(sum%10);
32            carry = sum/10;
33            curr.next = nn;
34            curr = curr.next;
35            if(t1!=null)
36            {
37                t1 = t1.next;
38            }
39            if(t2!=null)
40            {
41                t2 = t2.next;
42            }
43        }
44        if(carry!=0)
45        {
46            ListNode nn = new ListNode(carry);
47            curr.next = nn;
48        }
49        return dummy.next;
50    }
51}