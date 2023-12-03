package Stack;

public class LLImplementation {
   

        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static class Stack {
            Node head = null;
            int Size = 0;

            void push(int data) {
                Node newNode = new Node(data);
              
                newNode.next = head;
                head = newNode;
                Size++;

            }

            int pop () {
                if(head == null) {
                    System.out.println("Stack is Empty");
                    return -1;
                }
                int top = head.data;
                head = head.next;
                Size--;
                return top;
              
            }

            int peek() {
                if(head == null) {
                    System.out.println("Stack is Empty");
                    return -1;
                }
                int top = head.data;
                return top;

            }

            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;  
                }
                System.out.println();
              
            }

            boolean isEmpty() {
                if(head == null) {
                    return true;
                } 
                return false;
            }
            
    }

    public static void main(String[] args) {
        
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.Size);
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.Size);
        System.out.println(st.isEmpty());
    }
    
}
