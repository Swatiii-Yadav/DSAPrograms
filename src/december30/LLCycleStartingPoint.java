package december30;

    public class LLCycleStartingPoint {

        class ListNode {
            int data;
            ListNode next;

            ListNode(int data) {
                this.data = data;
                this.next = null;
            }
        }

       static ListNode head;


        public void insertFirst(int data) {
            ListNode node = new ListNode(data);
            node.next = head;
            head = node;
        }


        public ListNode detectCycle(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    slow = head;
                    while (slow != fast) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            LLCycleStartingPoint list = new LLCycleStartingPoint();


            list.insertFirst(-4); // Head becomes -4
            list.insertFirst(0);  // Head becomes 0
            list.insertFirst(2);  // Head becomes 2
            list.insertFirst(3);  // Head becomes 3


            ListNode head = list.head;
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = head.next;

            ListNode cycle = list.detectCycle(list.head);
            if (cycle != null) {
                System.out.println("Cycle detected at " + cycle.data);
            } else {
                System.out.println("No cycle detected.");
            }
        }
    }




