package december29;

public class RemoveElementInLL {
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
        public ListNode removeElements(ListNode head, int target) {
            ListNode newNode=new ListNode(target);
            ListNode temp=newNode;
            newNode.next=head;
            while(temp.next!=null){
                if(temp.next.data == target){
                    temp.next =temp.next.next;
                }else{
                    temp=temp.next;
                }
            }
            return newNode.next ;

        }
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        RemoveElementInLL list=new RemoveElementInLL();
        list.insertFirst(2);
        list.insertFirst(12);
        list.insertFirst(22);
        list.insertFirst(32);
        list.insertFirst(42);
        list.insertFirst(52);
        list.printList(head);
        list.removeElements(head,22);
list.printList(head);
    }

}

