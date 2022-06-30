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
        ListNode q = null;
        ListNode prev = q;
        int count = 1;
        if(head.next == null && n == 1){
            return null;
        }
        while(count != n){
            p = p.next;
            count++;
        }
        p = p.next;
        q= head;
        if(p == null){
            head = head.next;
        }
        while(p != null){
            p = p.next;
            prev = q;
            q=q.next;
        }
        if(prev != null){
        prev.next = q.next;
        
        }
        q.next = null;
        return head;  
    }
}