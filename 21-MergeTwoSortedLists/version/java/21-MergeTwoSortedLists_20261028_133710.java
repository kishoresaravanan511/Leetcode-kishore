// Last updated: 10/28/2026, 1:37:10 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> sortedValues = new ArrayList<>();

        while (list1 != null) {
            sortedValues.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            sortedValues.add(list2.val);
            list2 = list2.next;
        }

        sortedValues.sort(Integer::compareTo);

        ListNode head = new ListNode();
        ListNode node = new ListNode();

        head.next = node;

        for (Integer value : sortedValues) {
            node.next = new ListNode(value);
            node = node.next;
        }


        return head.next.next;

    }
}