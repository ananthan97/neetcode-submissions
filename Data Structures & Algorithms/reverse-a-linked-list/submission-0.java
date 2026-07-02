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
    public ListNode reverseList(ListNode head) {
        ListNode prev = head;
        ListNode current = head;
         while(current != null && current.next != null){
            ListNode temp = current.next;
            current.next = current.next.next;
            temp.next = prev;
            prev = temp;
         }
         return prev;
    }
}
