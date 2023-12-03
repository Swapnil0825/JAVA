package LinkedList;

public class Implementation {

    public static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int data) {
            Node temp  = new Node(data);
            if(head == null ) {
                head = temp;
                tail = temp;
            }
            else {  // Non Empty List
                tail.next = temp;
                tail = temp;
            }   
            size++;
        }

        
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }


        void insertAtHead (int data) {
            Node temp = new Node(data);
            if(head == null) {
               insertAtEnd(data);
            } 
            else {   // Non empty List
                temp.next = head;
                head = temp;
            }
            size++;

        }


        void insertAt(int idx , int data) {
            Node t = new Node(data);
            Node temp = head;
            if(idx == size) {
                insertAtEnd(data);
                return ;
            }else if(idx == 0) {
                insertAtHead(data);
                return;
            } else if(idx < 0 || idx > size)  {
                System.out.println("Wrong Index");
                return;
            }

            for(int i=1;i<idx;i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx) {

            if(idx < 0 || idx > size)  {
                System.out.println("Wrong Index");
                return -1;
            }

            Node temp = head;
            for(int i=1;i<idx;i++) {
                temp = temp.next;
            }
            return temp.next.data;
        }



        int size() {
            return size;
        }


        void deleteAt(int idx) {
            if(idx == 0) {
                head = head.next;
                size --;
                return ;
            }

            
            Node temp = head;
            for(int i=1;i<idx;i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size -- ;
        }




    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();    
        ll.insertAtEnd(4);
        // ll.display();
        ll.insertAtEnd(5);
        // ll.display();
        // System.out.println(ll.size());
        ll.insertAtEnd(12);
        // ll.display();
        ll.insertAtHead(13);
        ll.display();
        ll.insertAt(4, 10);
        ll.display();
         ll.insertAt(0, 100);
        ll.display();
        // System.out.println(ll.tail.data);
        // System.out.println(ll.head.data);
        // System.out.println(ll.getAt(5));
        // System.out.println(ll.size);
        // System.out.println(ll.size());
        // ll.display();
        ll.deleteAt(5);
        ll.display();
        System.out.println(ll.head.data);


      
    }
    
}
