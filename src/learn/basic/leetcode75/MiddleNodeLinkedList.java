package learn.basic.leetcode75;

public class MiddleNodeLinkedList {
    public ListNode middleNode(ListNode head){
        ListNode middle = head;

        while(head.next!=null ){
            if (head.next.next!=null){
                middle = middle.next;
                head = head.next.next;
            }else{
                return middle.next;
            }
        }

        return middle;
    }
}
