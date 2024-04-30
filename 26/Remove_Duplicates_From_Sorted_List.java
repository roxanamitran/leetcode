package MasterOfTheCode_LeetCode;

import java.util.LinkedList;

public class Remove_Duplicates_From_Sorted_List {
    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        node1.val = 1;
        ListNode node2 = new ListNode();
        node2.val = 1;
        ListNode node3 = new ListNode();
        node3.val = 2;
        ListNode node4 = new ListNode();
        node2.val = 3;
        ListNode node5 = new ListNode();
        node2.val = 3;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;


        ListNode result = deleteDuplication(node1);


    }

    public static ListNode deleteDuplication(ListNode head) {

        ListNode it = head;
        while (it != null && it.next != null) {
            if (it.val == it.next.val) {
                it = it.next.next;
            } else {
                it = it.next;
            }
        }

        return head;
    }
}
