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
    public ListNode middleNode(ListNode head) {
        ListNode nextNode = head;
        int size = 0;

        while (nextNode != null) {
            size++;
            nextNode = nextNode.next;
        }
 
        int middle = 0; 
        if (size % 2 == 1) middle = (int)Math.ceil(size / 2);
        else middle = size / 2;

        nextNode = head;
        for (int i = 1;; i++) {
            if (nextNode.next == null) return nextNode;
            nextNode = nextNode.next;
            if (i == middle) return nextNode;
        }
    }
}
