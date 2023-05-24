package learn.basic.leetcode75;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head){
        ListNode nextNode = null;
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null){
            nextNode = curr.next;
            curr.next = prev;
            prev=curr;
            curr = nextNode;

        }
        return prev;
    }
}
