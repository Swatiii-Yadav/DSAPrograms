package december30;

public class FindLengthOFCycle {


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
            ListNode node = new ListNode(data);
            node.next = head;
            head = node;
        }

        public int countLengthOfLoop(ListNode head) {

            if (head == null) {
                return 0;
            }
            ListNode slow = head;
            ListNode fast = head;
            int count = 1;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    fast = fast.next;
                    while (slow != fast) {
                        count++;
                        fast = fast.next;

                    }

                    return count;
                }
            }
            return 0;
        }

            public static void main(String[] args) {
                FindLengthOFCycle list = new FindLengthOFCycle();


                list.insertFirst(-4); // Head becomes -4
                list.insertFirst(0);  // Head becomes 0
                list.insertFirst(2);  // Head becomes 2
                list.insertFirst(3);  // Head becomes 3

              ListNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = head.next;

                int  length = list.countLengthOfLoop(head);
                System.out.println("Length of loop in linked list is: "+length);
            }
        }


