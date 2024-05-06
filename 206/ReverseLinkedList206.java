package recapitulare_colectii;

public class ReverseLinkedList206 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(3);
        n2.next = n3;

        ListNode r = reverseList(n1);
        while (r != null) {
            System.out.println(r.val);
            r = r.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode it = head;

        while (it != null) {
            ListNode next = it.next;
            it.next = previous;
            previous = it;
            it = next;
        }


        return previous;
    }
}
