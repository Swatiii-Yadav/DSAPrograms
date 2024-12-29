package december29;


public class MergeTwoList {

    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    ListNode head;

    public void insertFirst(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to simplify merging logic
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }


        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }


        return dummy.next;
    }

    public void print(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeTwoList list1 = new MergeTwoList();
        list1.insertFirst(4);
        list1.insertFirst(2);
        list1.insertFirst(1);

        MergeTwoList list2 = new MergeTwoList();
        list2.insertFirst(4);
        list2.insertFirst(3);
        list2.insertFirst(1);

        MergeTwoList result = new MergeTwoList();


        ListNode merged = result.mergeTwoLists(list1.head, list2.head);

        result.print(merged);
    }
}
