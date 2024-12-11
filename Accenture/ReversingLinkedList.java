public class ReversingLinkedList {

    public ListNode fn(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    void print(ListNode lnod1) {

        ListNode cur = lnod1;

        while (cur != null) {
            System.out.print(cur.value + "->");
            cur = cur.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        ReversingLinkedList rl = new ReversingLinkedList();

        ListNode lnod1 = new ListNode(1);
        lnod1.next = new ListNode(2);
        lnod1.next.next = new ListNode(3);
        lnod1.next.next.next = new ListNode(4);

        ListNode p = null;

        rl.print(lnod1);

        p = rl.fn(lnod1);
        System.out.println();

        rl.print(p);

    }

}

class ListNode {
    ListNode next;
    int value;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }

}
