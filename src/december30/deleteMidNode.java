package december30;

import december29.LinkedListCycle;

public class deleteMidNode {
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }



    static ListNode head;


    public void insertFirst(int data){
        ListNode node=new ListNode(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow.next!=null){
            slow.next=slow.next.next;
        }


        return head;

    }
}
