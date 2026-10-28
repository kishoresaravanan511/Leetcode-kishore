// Last updated: 10/28/2026, 10:05:24 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) { val = x; }
7 * }
8 */
9class Solution {
10    public void deleteNode(ListNode node) {
11        node.val = node.next.val;    //copying the next value to node
12        node.next = node.next.next;  //just change the links that's it.
13    }
14}