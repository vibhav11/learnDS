package learn.basic.leetcode75;

public class MergeTwoLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //list1 = {1,3}
        //list2 = {2,4}

        if (list1!=null && list2!=null){
            if (list1.val< list2.val){
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;
            }else {
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }

        }
        if(list1==null)
            return list2;
        return list1;

    }
}
