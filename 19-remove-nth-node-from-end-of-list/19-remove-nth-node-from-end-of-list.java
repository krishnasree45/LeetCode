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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        int count = 1;
        if(head == null)
            return head;
        if(head.next == null && n == 1)
            return null;
        while(count != n){
            p = p.next;
            count++;
        }
        if(p.next == null){
            ListNode temp = head;
            head = head.next;
            return head;
        }
            
        ListNode prev = head;
        while(p.next != null){
            p = p.next;
            prev = q;
            q = q.next;
        }
        ListNode temp = q;
        prev.next = q.next;
        q.next = null;
        return head;
    }
}