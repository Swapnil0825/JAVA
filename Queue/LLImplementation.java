package Queue;

// 1.Add  2. remove  3.peek

public class LLImplementation {

    public static class Node {
        int data;
        Node  next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        Node head = null;
        Node tail = null;

        void push(int data) {
            Node temp = new Node(data);
            if(head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        Node pop () {
            Node x = head;
            head = head.next;
            return x;
        }


        Node peek () {
            Node x = head;
            return x;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next; 
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.display();
        Node data = q.peek();
        System.out.println(data.data);
        q.pop();
        q.display();






        
    }
    
}
  