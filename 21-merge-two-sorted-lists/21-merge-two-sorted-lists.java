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
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode mergeList = new ListNode();
        ListNode mergeListHead = mergeList;
        mergeList.next = null;
        if(list1.val <= list2.val){
            mergeList.val = list1.val;
            list1 = list1.next;
        }
        
        else{
            mergeList.val = list2.val;
            list2 = list2.next;
        }
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val ){
                mergeList.next = new ListNode(list1.val);
                list1 = list1.next;
            } else{
                mergeList.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            mergeList = mergeList.next;
            
        }
        if(list1 == null){
            while(list2 != null){
                mergeList.next = new ListNode(list2.val);
                list2 = list2.next;
                mergeList = mergeList.next;
            }
        }
        if(list2 == null){
            while(list1 != null){
                mergeList.next = new ListNode(list1.val);
                list1 = list1.next;
                mergeList = mergeList.next;
            }
        }
        return mergeListHead;
    }
}