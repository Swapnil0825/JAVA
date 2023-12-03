package LinkedList;

public class LL {

    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void disaply (Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void disaplyreverse(Node head) {
        if(head == null) {
            return;
        }
        disaplyreverse(head.next);
        System.out.print(head.data+ " ");
    }

    public static void disaplyr(Node head) {
        if(head == null) {
            return;
        }
        System.out.print(head.data+ " ");
        disaplyr(head.next);
    }


    public static class Node {
        int data;    // value
        Node next;   // Address of next node

        Node (int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        // System.out.println(a.next);   // null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3  9  8  16
        a.next = b;   // 5 -> 3  9  8  16
        b.next = c;   // 5 -> 3 -> 9  8  16
        c.next = d;   // 5 -> 3 -> 9 -> 8  16
        d.next = e;   // 5 -> 3 -> 9 -> 8 -> 16
        
        disaply(a);
        System.out.println();
        disaplyr(a);
        System.out.println();
        System.out.println(length(a));
   
    }   
}
