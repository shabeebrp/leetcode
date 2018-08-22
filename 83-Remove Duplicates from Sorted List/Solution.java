/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(-1);
        ListNode prev = temp;
        temp.next = head;
        while(head != null){
            if(head.next!=null && head.next.val == head.val)
                prev.next = head.next;
            else
                prev = head;
            head = head.next;
        }
        return temp.next;
    }
}
