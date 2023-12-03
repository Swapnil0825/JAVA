package LinkedList;

public class Question {

    public static Node NthNode(Node head, int n) {
        Node temp = head;
        int size =0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        temp = head;
        for(int i=1;i<=m-1;i++) {
            temp = temp.next;
        }

        return temp ;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public static Node NthNodeslowfast(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next; 
        }
        return slow;
    }


    
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node q = NthNode(a, 3);
        System.out.println(q.data);

        Node qsf = NthNodeslowfast(a,3);
        System.out.println(qsf.data);

    }
    
}
