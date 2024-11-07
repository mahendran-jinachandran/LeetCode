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
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        ListNode move = head;
        while(move.next != null) {
            move = move.next;
            if(move.val == temp.val) {
                temp.next = move.next;
            } else {
                temp = move;
            }

           // move = move.next;
        }

        return head;
    }
}